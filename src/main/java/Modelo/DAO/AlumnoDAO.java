
package Modelo.dao;

import Modelo.Alumno;
import Modelo.Cconexion;
import Modelo.Matricula;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlumnoDAO {
    
    private Cconexion con = new Cconexion();
    
        public DefaultTableModel mostrarAlumnos(String nombreTabla) {

        // 1. Configurar el modelo de tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Dni");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Correo");
        model.addColumn("Direccion");
        model.addColumn("Telefono");

        String sql = "SELECT * FROM " + nombreTabla + ";";


        try (Connection conexion = con.estableConexion(); Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(sql)) { // Uso de try-with-resources para cerrar automáticamente

            String[] datos = new String[6];

            while (rs.next()) {
                // Se obtiene el valor por el índice de la columna (1-based)
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
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
                new Object[]{"DNI", "Nombre", "Apellido", "Correo", "Direccion", "Telefono"}, 0) {

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
    
    
    public boolean eliminarAlumno(String DniAlumno) {
        String sql = "DELETE FROM ALUMNO WHERE DniAlumno = ?";
        Cconexion con = new Cconexion();

        try (Connection conexion = con.estableConexion(); // Usamos PreparedStatement
                 java.sql.PreparedStatement pst = conexion.prepareStatement(sql)) {

            pst.setString(1, DniAlumno); // Asigna el ID al primer '?'

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0; // Retorna true si se eliminó al menos una fila

        } catch (SQLException e) {
            System.err.println("Error al eliminar Alumno: " + e.getMessage());
            return false;
        }
    }

    public boolean modificarAlumno(Alumno alumno) {

        String sql = "UPDATE ALUMNO SET "
                + "Nombre=?, Apellido=?, Correo=?, Direccion=?, Telefono=? "
                + "WHERE DniAlumno=?";

        Cconexion con = new Cconexion();

        try (Connection conexion = con.estableConexion(); PreparedStatement pst = conexion.prepareStatement(sql)) {

            // Asignación de valores usando los Getters del objeto Matricula
            pst.setString(1, alumno.getNombre()); // Usamos setDate para java.sql.Date
            pst.setString(2, alumno.getApellido());
            pst.setString(3, alumno.getCorreo());
            pst.setString(4, alumno.getDireccion());
            pst.setString(5, alumno.getTelefono());
            pst.setString(6, alumno.getDniAlumno()); // WHERE

            int filasAfectadas = pst.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.err.println("Error al modificar matrícula en DAO: " + e.getMessage());
            return false;
        }
    }
            
        public boolean insertarAlumno(Alumno a) {
        String sql = "INSERT INTO ALUMNO (DniAlumno, Nombre, Apellido, Correo, Direccion, Telefono) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection cn = con.estableConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, a.getDniAlumno());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getApellido());
            ps.setString(4, a.getCorreo());
            ps.setString(5, a.getDireccion());
            ps.setString(6, a.getTelefono());
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
        public Alumno buscarPorDni(String dni) {
        String sql = "SELECT * FROM ALUMNO WHERE DniAlumno = ?";

        try (Connection cn = con.estableConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Alumno a = new Alumno();
                a.setDniAlumno(rs.getString("DniAlumno"));
                a.setNombre(rs.getString("Nombre"));
                a.setApellido(rs.getString("Apellido"));
                return a;
            }

        } catch (Exception e) {
            System.out.println("Error al buscar alumno por DNI: " + e.getMessage());
        }

        return null; 
    }
    
    
}