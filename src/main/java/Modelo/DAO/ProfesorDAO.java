package Modelo.dao;

import Modelo.Cconexion;
import Modelo.Profesor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProfesorDAO {
    private Connection con;

    public ProfesorDAO() {
        Cconexion conexion = new Cconexion();
        con = conexion.estableConexion();
    }

    public boolean agregarProfesor(Profesor profesor) {
        String sql = "INSERT INTO PROFESORES (Dni_Profesor, Nombre, Apellido, Correo, Direccion, Telefono) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, profesor.getDniProfesor());
            ps.setString(2, profesor.getNombre());
            ps.setString(3, profesor.getApellido());
            ps.setString(4, profesor.getCorreo());
            ps.setString(5, profesor.getDireccion());
            ps.setString(6, profesor.getTelefono());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar profesor: " + e.getMessage());
            return false;
        }
    }

    public List<Profesor> listarProfesores() {
        List<Profesor> lista = new ArrayList<>();
        String sql = "SELECT * FROM PROFESORES";
        try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Profesor p = new Profesor();
                p.setDniProfesor(rs.getString("Dni_Profesor"));
                p.setNombre(rs.getString("Nombre"));
                p.setApellido(rs.getString("Apellido"));
                p.setCorreo(rs.getString("Correo"));
                p.setDireccion(rs.getString("Direccion"));
                p.setTelefono(rs.getString("Telefono"));
                lista.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar profesores: " + e.getMessage());
        }
        return lista;
    }

    public boolean actualizarProfesor(Profesor profesor) {
        String sql = "UPDATE PROFESORES SET Nombre=?, Apellido=?, Correo=?, Direccion=?, Telefono=? WHERE Dni_Profesor=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, profesor.getNombre());
            ps.setString(2, profesor.getApellido());
            ps.setString(3, profesor.getCorreo());
            ps.setString(4, profesor.getDireccion());
            ps.setString(5, profesor.getTelefono());
            ps.setString(6, profesor.getDniProfesor());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar profesor: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarProfesor(String dniProfesor) {
        String sql = "DELETE FROM PROFESORES WHERE Dni_Profesor=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, dniProfesor);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar profesor: " + e.getMessage());
            return false;
        }
    }

    public Profesor buscarPorDni(String dniProfesor) {
        Profesor p = null;
        String sql = "SELECT * FROM PROFESORES WHERE Dni_Profesor=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, dniProfesor);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p = new Profesor();
                p.setDniProfesor(rs.getString("Dni_Profesor"));
                p.setNombre(rs.getString("Nombre"));
                p.setApellido(rs.getString("Apellido"));
                p.setCorreo(rs.getString("Correo"));
                p.setDireccion(rs.getString("Direccion"));
                p.setTelefono(rs.getString("Telefono"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar profesor: " + e.getMessage());
        }
        return p;
    }
}