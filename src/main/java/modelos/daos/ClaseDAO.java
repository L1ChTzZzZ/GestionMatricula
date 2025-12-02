package modelos.daos;

import modelos.Cconexion;
import modelos.Clase;
import modelos.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ClaseDAO {

    private Cconexion con = new Cconexion();

    // LISTAR
    public DefaultTableModel mostrarClases(String nombreTabla) {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_Clase");
        model.addColumn("Horario");
        model.addColumn("Mensualidad");

        String sql = "SELECT * FROM " + nombreTabla + ";";

        try (Connection conexion = con.estableConexion();
             Statement st = conexion.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            String[] datos = new String[3];

            while (rs.next()) {
                datos[0] = rs.getString("id_clase");
                datos[1] = rs.getString("horario");
                datos[2] = rs.getString("Mensualidad");
                model.addRow(datos);
            }

        } catch (SQLException e) {
            System.err.println("Error al listar clases: " + e.getMessage());
            return new DefaultTableModel();
        }

        return model;
    }

    
    public DefaultTableModel crearModeloEditable(ResultSet rs) throws SQLException {

        // Usamos un modelo anónimo que permite la edición
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"id_clase", "Horario", "Mensualidad"}, 0) {

            // Sobrescribimos el método isCellEditable
            @Override
            public boolean isCellEditable(int row, int column) {
                // Solo la columna 0 (Id_Matricula) no es editable
                return column != 0;
            }
        };

        // ... Código para llenar el modelo con rs.next() ...
        return model;
    }
    // MODIFICAR
    public boolean actualizarClase(Clase clase) {
        String sql = "UPDATE CLASE SET horario=?, mensualidad=? WHERE id_clase=?";

        try (Connection conexion = con.estableConexion();
             PreparedStatement pst = conexion.prepareStatement(sql)) {

            pst.setString(1, clase.getHorario());
            pst.setDouble(2, clase.getMensualidad());
            pst.setString(3, clase.getId_clase());

            return pst.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al actualizar clase: " + e.getMessage());
            return false;
        }
    }
    
    
    public boolean modificarClase(Clase clase) {

        String sql = "UPDATE CLASES SET "
                + "Horario=?, Mensualidad=? "
                + "WHERE id_clase=?";

        Cconexion con = new Cconexion();

        try (Connection conexion = con.estableConexion(); PreparedStatement pst = conexion.prepareStatement(sql)) {

            // Asignación de valores usando los Getters del objeto Matricula
            pst.setString(1, clase.getHorario()); // Usamos setDate para java.sql.Date
            pst.setDouble(2, clase.getMensualidad());
            pst.setString(3, clase.getId_clase()); // WHERE

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.err.println("Error al modificar Clases en DAO: " + e.getMessage());
            return false;
        }
    }
    
    // ELIMINAR
    public boolean eliminarClase(String idClase) {
        String sql = "DELETE FROM CLASE WHERE id_clase  = ?";
        Cconexion con = new Cconexion();

        try (Connection conexion = con.estableConexion(); // Usamos PreparedStatement
                 java.sql.PreparedStatement pst = conexion.prepareStatement(sql)) {

            pst.setString(1, idClase); // Asigna el ID al primer '?'

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0; // Retorna true si se eliminó al menos una fila

        } catch (SQLException e) {
            System.err.println("Error al eliminar matrícula: " + e.getMessage());
            return false;
        }
    }
}