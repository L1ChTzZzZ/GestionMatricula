package Modelo.dao;

import Modelo.Cconexion;
import Modelo.Profesor;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class ProfesorDAO {
    
    private Cconexion conexion = new Cconexion();

    // ===============================
    //      MOSTRAR PROFESORES
    // ===============================
    public DefaultTableModel mostrarProfesores() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("DNI");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Correo");
        model.addColumn("Dirección");
        model.addColumn("Teléfono");

        String sql = "SELECT * FROM PROFESORES";

        try (Connection con = conexion.estableConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            String[] datos = new String[6];
            
            while (rs.next()) {
                datos[0] = rs.getString("Dni_Profesor");
                datos[1] = rs.getString("Nombre");
                datos[2] = rs.getString("Apellido");
                datos[3] = rs.getString("Correo");
                datos[4] = rs.getString("Direccion");
                datos[5] = rs.getString("Telefono");
                model.addRow(datos);
            }

        } catch (SQLException e) {
            System.err.println("Error al listar profesores: " + e.getMessage());
            return new DefaultTableModel();
        }

        return model;
    }

    // ===============================
    //      AGREGAR PROFESOR
    // ===============================
    public boolean agregarProfesor(Profesor profesor) {
        String sql = "INSERT INTO PROFESORES (Dni_Profesor, Nombre, Apellido, Correo, Direccion, Telefono) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection con = conexion.estableConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, profesor.getDniProfesor());
            ps.setString(2, profesor.getNombre());
            ps.setString(3, profesor.getApellido());
            ps.setString(4, profesor.getCorreo());
            ps.setString(5, profesor.getDireccion());
            ps.setString(6, profesor.getTelefono());
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al agregar profesor: " + e.getMessage());
            return false;
        }
    }

    // ===============================
    //    ACTUALIZAR PROFESOR
    // ===============================
    public boolean actualizarProfesor(Profesor profesor) {
        String sql = "UPDATE PROFESORES SET Nombre=?, Apellido=?, Correo=?, Direccion=?, Telefono=? WHERE Dni_Profesor=?";
        
        try (Connection con = conexion.estableConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, profesor.getNombre());
            ps.setString(2, profesor.getApellido());
            ps.setString(3, profesor.getCorreo());
            ps.setString(4, profesor.getDireccion());
            ps.setString(5, profesor.getTelefono());
            ps.setString(6, profesor.getDniProfesor());
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al actualizar profesor: " + e.getMessage());
            return false;
        }
    }

    // ===============================
    //     ELIMINAR PROFESOR
    // ===============================
    public boolean eliminarProfesor(String dniProfesor) {
        String sql = "DELETE FROM PROFESORES WHERE Dni_Profesor=?";
        
        try (Connection con = conexion.estableConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, dniProfesor);
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al eliminar profesor: " + e.getMessage());
            return false;
        }
    }

    // ===============================
    //     BUSCAR POR DNI
    // ===============================
    public Profesor buscarPorDni(String dniProfesor) {
        Profesor profesor = null;
        String sql = "SELECT * FROM PROFESORES WHERE Dni_Profesor=?";
        
        try (Connection con = conexion.estableConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, dniProfesor);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                profesor = new Profesor();
                profesor.setDniProfesor(rs.getString("Dni_Profesor"));
                profesor.setNombre(rs.getString("Nombre"));
                profesor.setApellido(rs.getString("Apellido"));
                profesor.setCorreo(rs.getString("Correo"));
                profesor.setDireccion(rs.getString("Direccion"));
                profesor.setTelefono(rs.getString("Telefono"));
            }
            
        } catch (SQLException e) {
            System.err.println("Error al buscar profesor: " + e.getMessage());
        }
        
        return profesor;
    }
}