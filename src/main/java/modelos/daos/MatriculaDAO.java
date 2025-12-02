package modelos.daos; // o el paquete que uses para tu lógica de datos

import modelos.Alumno;
import modelos.Cconexion;
import modelos.Matricula;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MatriculaDAO {
    
    private Cconexion con = new Cconexion();

    public DefaultTableModel mostrarMatriculas(String nombreTabla) {

        // 1. Configurar el modelo de tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id_Matricula");
        model.addColumn("Fecha_Pago");
        model.addColumn("Monto_total");
        model.addColumn("Tipo_Pago");
        model.addColumn("Id_Usuario");
        model.addColumn("Dni_Alumno");
        model.addColumn("Id_clase");

        String sql = "SELECT * FROM " + nombreTabla + ";";


        try (Connection conexion = con.estableConexion(); Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(sql)) { // Uso de try-with-resources para cerrar automáticamente

            String[] datos = new String[7];

            while (rs.next()) {
                // Se obtiene el valor por el índice de la columna (1-based)
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                model.addRow(datos);
            }

        } catch (SQLException e) {
            // En la capa DAO, es mejor propagar la excepción o registrarla, no mostrar un JOptionPane
            System.err.println("Error al obtener datos de matrícula: " + e.getMessage());
            // Si quieres devolver un modelo vacío en caso de error:
            return new DefaultTableModel();
        }
        
        return model; // Devuelve el modelo lleno de datos
    }

    public DefaultTableModel crearModeloEditable(ResultSet rs) throws SQLException {

        // Usamos un modelo anónimo que permite la edición
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"Id_Matricula", "Fecha_Pago", "Monto_total", "Tipo_Pago", "Id_Usuario", "Dni_Alumno", "Id_clase"}, 0) {

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


    public boolean eliminarMatricula(String idMatricula) {
        String sql = "DELETE FROM MATRICULA WHERE Id_Matricula = ?";
        Cconexion con = new Cconexion();

        try (Connection conexion = con.estableConexion(); // Usamos PreparedStatement
                 java.sql.PreparedStatement pst = conexion.prepareStatement(sql)) {

            pst.setString(1, idMatricula); // Asigna el ID al primer '?'

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0; // Retorna true si se eliminó al menos una fila

        } catch (SQLException e) {
            System.err.println("Error al eliminar matrícula: " + e.getMessage());
            return false;
        }
    }

    public boolean modificarMatricula(Matricula matricula) {

        String sql = "UPDATE MATRICULA SET "
                + "Fecha_Pago=?, Monto_total=?, Tipo_Pago=?, Id_Usuario=?, Dni_Alumno=?, Id_clase=? "
                + "WHERE Id_Matricula=?";

        Cconexion con = new Cconexion();

        try (Connection conexion = con.estableConexion(); PreparedStatement pst = conexion.prepareStatement(sql)) {

            // Asignación de valores usando los Getters del objeto Matricula
            pst.setDate(1, matricula.getFechaPago()); // Usamos setDate para java.sql.Date
            pst.setDouble(2, matricula.getMontoTotal());
            pst.setString(3, matricula.getTipoPago());
            pst.setString(4, matricula.getIdUsuario());
            pst.setString(5, matricula.getDniAlumno());
            pst.setString(6, matricula.getIdClase());
            pst.setString(7, matricula.getIdMatricula()); // WHERE

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.err.println("Error al modificar matrícula en DAO: " + e.getMessage());
            return false;
        }
    }
    
        // GENERAR ID M0001
    public String generarIdMatricula() {
        String sql = "SELECT id_matricula FROM MATRICULA ORDER BY id_matricula DESC LIMIT 1";

        try (Connection conexion = con.estableConexion();
             PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                String ultimo = rs.getString(1); 
                int numero = Integer.parseInt(ultimo.substring(1)) + 1;
                return "M" + String.format("%04d", numero);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "M0001";
    }
    
    public void guardarMatricula(Matricula m) {
        String sql = "INSERT INTO MATRICULA (id_matricula, Fecha_pago, Monto_total, Tipo_pago, id_usuario, Dni_alumno, id_clase) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexion = con.estableConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, m.getIdMatricula());
            ps.setDate(2, m.getFechaPago());
            ps.setDouble(3, m.getMontoTotal());
            ps.setString(4, m.getTipoPago());
            ps.setString(5, m.getIdUsuario());
            ps.setString(6, m.getDniAlumno());
            ps.setString(7, m.getIdClase());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        public boolean registrarMatriculaCompleta(
             String Dni_alumno, 
             String tipoPago, 
             Date fechaPago, 
             String idClase, 
             String idUsuario) {

         Connection conexion = null;

         try {
             conexion = con.estableConexion();
             if (conexion == null) {
                 System.out.println("No se pudo conectar a la BD");
                 return false;
             }

             conexion.setAutoCommit(false); // iniciar transacción

             // 1. GENERAR ID MATRÍCULA
             String nuevoId = generarIdMatricula();

             // 2. OBTENER MONTO DE LA CLASE
             double monto = 0;
             String sqlMonto = "SELECT Mensualidad FROM CLASES WHERE id_clase = ?";

             try (PreparedStatement psMonto = conexion.prepareStatement(sqlMonto)) {
                 psMonto.setString(1, idClase);
                 ResultSet rs = psMonto.executeQuery();

                 if (rs.next()) {
                     monto = rs.getDouble("Mensualidad");
                 } else {
                     throw new Exception("No existe la clase con ID: " + idClase);
                 }
             }

             // 3. INSERTAR MATRÍCULA
             String sqlMatricula = """
                 INSERT INTO MATRICULA 
                 (id_matricula, Fecha_pago, Monto_total, Tipo_pago, id_usuario, Dni_alumno, id_clase)
                 VALUES (?, ?, ?, ?, ?, ?, ?)
             """;

             try (PreparedStatement ps = conexion.prepareStatement(sqlMatricula)) {
                 ps.setString(1, nuevoId);
                 ps.setDate(2, fechaPago);
                 ps.setDouble(3, monto);
                 ps.setString(4, tipoPago);
                 ps.setString(5, idUsuario);
                 ps.setString(6, Dni_alumno);   // <-- CORRECTO
                 ps.setString(7, idClase);
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

             System.out.println("Error registrando matrícula: " + e.getMessage());
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
