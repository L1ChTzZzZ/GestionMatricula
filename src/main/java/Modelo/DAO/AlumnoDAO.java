
package Modelo.dao;

import Modelo.Alumno;
import Modelo.Cconexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoDAO {

    private Cconexion conexion = new Cconexion();

    // ➤ Insertar nuevo alumno
    public void agregarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (DniAlumno, Nombre, Apellido, Correo, Direccion, Telefono) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = conexion.estableConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, alumno.getDniAlumno());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setString(4, alumno.getCorreo());
            ps.setString(5, alumno.getDireccion());
            ps.setString(6, alumno.getTelefono());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alumno registrado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar alumno: " + e.getMessage());
        }
    }

    // ➤ Listar todos los alumnos
    public List<Alumno> listarAlumnos() {
        List<Alumno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alumno";

        try (Connection con = conexion.estableConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Alumno a = new Alumno(
                    rs.getString("DniAlumno"),
                    rs.getString("Nombre"),
                    rs.getString("Apellido"),
                    rs.getString("Correo"),
                    rs.getString("Direccion"),
                    rs.getString("Telefono")
                );
                lista.add(a);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar alumnos: " + e.getMessage());
        }
        return lista;
    }

    // ➤ Buscar alumno por DNI
    public Alumno buscarPorDni(String dni) {
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE DniAlumno = ?";

        try (Connection con = conexion.estableConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, dni);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    alumno = new Alumno(
                        rs.getString("DniAlumno"),
                        rs.getString("Nombre"),
                        rs.getString("Apellido"),
                        rs.getString("Correo"),
                        rs.getString("Direccion"),
                        rs.getString("Telefono")
                    );
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar alumno: " + e.getMessage());
        }
        return alumno;
    }

    // ➤ Actualizar alumno
    public void actualizarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET Nombre=?, Apellido=?, Correo=?, Direccion=?, Telefono=? WHERE DniAlumno=?";

        try (Connection con = conexion.estableConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getCorreo());
            ps.setString(4, alumno.getDireccion());
            ps.setString(5, alumno.getTelefono());
            ps.setString(6, alumno.getDniAlumno());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alumno actualizado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar alumno: " + e.getMessage());
        }
    }

    // ➤ Eliminar alumno
    public void eliminarAlumno(String dni) {
        String sql = "DELETE FROM alumno WHERE DniAlumno = ?";

        try (Connection con = conexion.estableConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, dni);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar alumno: " + e.getMessage());
        }
    }
}