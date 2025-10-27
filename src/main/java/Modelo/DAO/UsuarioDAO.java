package Modelo.DAO;

import Modelo.Cconexion;
import Modelo.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public Usuario validarUsuario(String usuario, String contraseña) {
        Usuario user = null;
        try {
            Cconexion objetoConexion = new Cconexion();
            String consulta = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?;";
            PreparedStatement ps = objetoConexion.estableConexion().prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Se encontró el usuario → se crea el objeto con sus datos
                user = new Usuario();
                user.setIdUsuario(rs.getString("id_usuario"));
                user.setIngresoUsuario(rs.getString("usuario"));
                user.setNombreUsuario(rs.getString("nombre"));
                user.setIngresoContraseña(rs.getString("contraseña"));
                user.setRol(rs.getString("rol"));
            }

            rs.close();
            ps.close();
            objetoConexion.estableConexion().close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al validar usuario: " + e.getMessage());
        }
        return user; // si es null, significa que el usuario no existe
    }
}