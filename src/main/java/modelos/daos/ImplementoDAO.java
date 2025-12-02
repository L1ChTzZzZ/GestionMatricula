
package modelos.daos;

import modelos.Implemento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.Cconexion;

public class ImplementoDAO {
    private Cconexion con = new Cconexion();

    public DefaultTableModel mostrarImplementos(String nombreTabla) {

        // 1. Configurar el modelo de tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id_implemento");
        model.addColumn("Nombre");
        model.addColumn("Tipo");
        model.addColumn("Stock");
        model.addColumn("Precio");

        String sql = "SELECT * FROM " + nombreTabla + ";";


        try (Connection conexion = con.estableConexion(); Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(sql)) { 

            String[] datos = new String[5];

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                model.addRow(datos);
                
            }

        } catch (SQLException e) {

            System.err.println("Error al obtener datos de Implementos: " + e.getMessage());

            return new DefaultTableModel();
        }
        
        return model;
    }
    
    public DefaultTableModel crearModeloEditable(ResultSet rs) throws SQLException {

        // Usamos un modelo anónimo que permite la edición
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"id_implemento", "Nombre", "Tipo", "Stock", "Precio"}, 0) {

            // Sobrescribimos el método isCellEditable
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0;
            }
        };

        // ... Código para llenar el modelo con rs.next() ...
        return model;
    }
    
        public boolean eliminarMatricula(String id_implemento) {
        String sql = "DELETE FROM IMPLEMENTO WHERE id_implemento = ?";
        Cconexion con = new Cconexion();

        try (Connection conexion = con.estableConexion(); // Usamos PreparedStatement
                 java.sql.PreparedStatement pst = conexion.prepareStatement(sql)) {

            pst.setString(1, id_implemento); // Asigna el ID al primer '?'

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0; // Retorna true si se eliminó al menos una fila

        } catch (SQLException e) {
            System.err.println("Error al eliminar Implemento: " + e.getMessage());
            return false;
        }
    }
        
            public boolean modificarImplemento(Implemento implemento) {

        String sql = "UPDATE IMPLEMENTO SET "
                + "Nombre=?, Tipo=?, Stock=?, Precio=? "
                + "WHERE id_implemento=?";

        Cconexion con = new Cconexion();

        try (Connection conexion = con.estableConexion(); PreparedStatement pst = conexion.prepareStatement(sql)) {

            // Asignación de valores usando los Getters del objeto Matricula
            pst.setString(1, implemento.getNombre()); // Usamos setDate para java.sql.Date
            pst.setString(2, implemento.getTipo());
            pst.setInt(3, implemento.getStock());
            pst.setDouble(4, implemento.getPrecio());
            pst.setString(5, implemento.getIdImplemento()); // WHERE

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.err.println("Error al modificar matrícula en DAO: " + e.getMessage());
            return false;
        }
    }
}