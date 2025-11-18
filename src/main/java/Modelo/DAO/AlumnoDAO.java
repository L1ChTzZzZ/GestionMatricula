
package Modelo.dao;

import Modelo.Alumno;
import Modelo.Cconexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoDAO {
    
    private Cconexion con = new Cconexion();
    
    public void guardarAlumno(Alumno a, Connection conexion) {
        String sql = "INSERT INTO ALUMNO (DniAlumno, Nombre, Apellido, Correo, Direccion, Telefono) "
                + "VALUES (?, ?, ?, ?, ?, ?) "
                + "ON DUPLICATE KEY UPDATE "
                + "Nombre = VALUES(Nombre), "
                + "Apellido = VALUES(Apellido), "
                + "Correo = VALUES(Correo), "
                + "Direccion = VALUES(Direccion), "
                + "Telefono = VALUES(Telefono)";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, a.getDniAlumno());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getApellido());
            ps.setString(4, a.getCorreo());
            ps.setString(5, a.getDireccion());
            ps.setString(6, a.getTelefono());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}