
package modelos.daos;

import modelos.Implemento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.Alumno;
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
            
            
               // GENERAR ID I0001
        public String generarIdImplemento() {
        String sql = "SELECT id_implemento FROM IMPLEMENTO ORDER BY id_implemento DESC LIMIT 1";

        try (Connection conexion = con.estableConexion();
             PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                String ultimo = rs.getString(1); 
                int numero = Integer.parseInt(ultimo.substring(1)) + 1;
                return "I" + String.format("%04d", numero);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "I0001";
    }
    
    public void guardarImplemento(Implemento i) {
        String sql = "INSERT INTO IMPLEMENTO (id_implemento, Nombre, Tipo, Stock, Precio) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try (Connection conexion = con.estableConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, i.getIdImplemento());
            ps.setString(2, i.getNombre());
            ps.setString(3, i.getTipo());
            ps.setInt(4, i.getStock());
            ps.setDouble(5, i.getPrecio());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        public boolean registrarImplementoCompleto(
             String id_implemento, 
             String Nombre, 
             String Tipo, 
             int Stock, 
             Double Precio) {

         Connection conexion = null;

         try {
             conexion = con.estableConexion();
             if (conexion == null) {
                 System.out.println("No se pudo conectar a la BD");
                 return false;
             }

             conexion.setAutoCommit(false); // iniciar transacción

             // 1. GENERAR ID MATRÍCULA
             String nuevoId = generarIdImplemento();

             // 3. INSERTAR MATRÍCULA
             String sqlMatricula = """
                 INSERT INTO IMPLEMENTO 
                 (id_implemento, Nombre, Tipo, Stock, Precio)
                 VALUES (?, ?, ?, ?, ?)
             """;

             try (PreparedStatement ps = conexion.prepareStatement(sqlMatricula)) {
                 ps.setString(1, nuevoId);
                 ps.setString(2, Nombre);
                 ps.setString(3, Tipo);
                 ps.setInt(4, Stock);
                 ps.setDouble(5, Precio);
                 ps.executeUpdate();
             }

             conexion.commit();
             return true;

         } catch (Exception e) {

             if (conexion != null) {
                 try {
                     conexion.rollback();
                 } catch (Exception ex) {
                     System.out.println("Error en rollback: " + ex.getMessage());
                 }
             }

             System.out.println("Error registrando Implemento: " + e.getMessage());
             e.printStackTrace();
             return false;

         } finally {

             if (conexion != null) {
                 try {
                     conexion.setAutoCommit(true);
                     conexion.close();
                 } catch (Exception ex) {
                     System.out.println("Error cerrando conexión: " + ex.getMessage());
                 }
             }

         }
     }
}