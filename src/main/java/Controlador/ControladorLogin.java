package Controlador;

import Modelo.Usuario;
import Modelo.DAO.UsuarioDAO;
import Vista.Login;
import Vista.FormMenuPrincipal;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ControladorLogin implements java.awt.event.ActionListener {
    private Login vista;
    private UsuarioDAO modelo;
    private FormMenuPrincipal ventanaPrincipal; // ventana principal
    private int intentosFallidos = 0;
    private boolean bloqueado = false;

    public ControladorLogin(Login vista, UsuarioDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.getBtnIngresar().addActionListener(this);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == vista.getBtnIngresar()) {
            if (bloqueado) {
                JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos. Espere unos segundos e intente de nuevo.");
                return;
            }

            String usuario = vista.getTxtUsuario().getText().trim();
            String contraseña = new String(vista.getTxtContraseña().getPassword()).trim();

            if (usuario.isEmpty() || contraseña.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                return;
            }

            Usuario user = modelo.validarUsuario(usuario, contraseña);

            if (user != null) {
                JOptionPane.showMessageDialog(null, "Bienvenido, " + user.getNombre());

                // Abrir ventana principal
                ventanaPrincipal = new FormMenuPrincipal(user);
                ventanaPrincipal.setVisible(true);
                vista.dispose(); // cerrar login
            } else {
                intentosFallidos++;
                if (intentosFallidos >= 3) {
                    bloquearLogin();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Intento " 
                                                  + intentosFallidos + " de 3.");
                }
            }
        }
    }

    private void bloquearLogin() {
        bloqueado = true;
        JOptionPane.showMessageDialog(null, "Demasiados intentos fallidos. El login se bloqueará por 10 segundos.");
        Timer timer = new Timer(10000, e -> {
            bloqueado = false;
            intentosFallidos = 0;
            JOptionPane.showMessageDialog(null, "Ya puede volver a intentar iniciar sesión.");
        });
        timer.setRepeats(false);
        timer.start();
    }

}