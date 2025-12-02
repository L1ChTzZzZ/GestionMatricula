package controladores;

import modelos.Cconexion;
import modelos.daos.UsuarioDAO;
import vistas.FormMenuPrincipal;
import vistas.Login;
import vistas.Profesores_Datos;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal {
    public static void main(String[] args) {
        try {
            // Aplica el estilo moderno FlatLaf
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Error al aplicar FlatLaf: " + ex.getMessage());
        }

        Login vista = new Login();
        UsuarioDAO modelo = new UsuarioDAO();
        ControladorLogin controlador = new ControladorLogin(vista, modelo);
        vista.setVisible(true);
    }
}