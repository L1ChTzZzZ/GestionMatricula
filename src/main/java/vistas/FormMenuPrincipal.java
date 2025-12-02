
package vistas;
import modelos.Usuario;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import modelos.Cconexion;
import java.sql.Connection;
import vistas.Matricula_Datos;
import vistas.Profesores_Datos;


public class FormMenuPrincipal extends javax.swing.JFrame {
    private Usuario usuarioLogueado;
    private JPopupMenu menuPerfil;
    
    public FormMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        inicializarMenuPerfil();
        this.setTitle("IWS - Menu Principal");
    }
    
    public FormMenuPrincipal(Usuario usuario) {
    initComponents();
    this.usuarioLogueado = usuario;
    setLocationRelativeTo(null); // centra la ventana
    inicializarMenuPerfil();     // método que crearemos abajo
    }
    
    private void inicializarMenuPerfil() {
        menuPerfil = new JPopupMenu();

        JMenuItem itemNombre = new JMenuItem("Nombre: " + (usuarioLogueado != null ? usuarioLogueado.getNombre() : "Desconocido"));
        JMenuItem itemRol    = new JMenuItem("Rol: " + (usuarioLogueado != null ? usuarioLogueado.getRol() : "-"));
        JMenuItem itemCerrar = new JMenuItem("Cerrar sesión");

        itemNombre.setEnabled(false);
        itemRol.setEnabled(false);

        itemCerrar.addActionListener(e -> {
            int opcion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Desea cerrar sesión?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
            if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                this.dispose();
                vistas.Login login = new vistas.Login();
                modelos.daos.UsuarioDAO dao = new modelos.daos.UsuarioDAO();
                new controladores.ControladorLogin(login, dao);
                login.setVisible(true);
            }
        });

        menuPerfil.add(itemNombre);
        menuPerfil.add(itemRol);
        menuPerfil.addSeparator();
        menuPerfil.add(itemCerrar);

        // Mostrar el popup al hacer clic en el botón
        btnPerfil.addActionListener(e -> {
            // actualizar los textos por si han cambiado
            itemNombre.setText("Nombre: " + (usuarioLogueado != null ? usuarioLogueado.getNombre() : "Desconocido"));
            itemRol.setText("Rol: " + (usuarioLogueado != null ? usuarioLogueado.getRol() : "-"));
            menuPerfil.show(btnPerfil, 0, btnPerfil.getHeight());
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnVentanaAlumno = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnMatricula = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PanelPerfil = new javax.swing.JPanel();
        lblAvatar = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ListarAlumno = new javax.swing.JMenuItem();
        RegistrarAlumno = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        ListarMatriculas = new javax.swing.JMenuItem();
        RegistrarMatricula = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ListarProfesores = new javax.swing.JMenuItem();
        RegistrarProfesor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ListarClases = new javax.swing.JMenuItem();
        Implementos = new javax.swing.JMenu();
        ListarImplementos = new javax.swing.JMenuItem();
        AgregarImplemento = new javax.swing.JMenuItem();

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVentanaAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alumno.png"))); // NOI18N
        btnVentanaAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentanaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentanaAlumnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnVentanaAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 149, 177, 169));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profesor.png"))); // NOI18N
        jButton4.setAlignmentY(0.0F);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 149, 177, 169));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clases.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 149, 177, 169));

        btnMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Matricula.png"))); // NOI18N
        btnMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculaActionPerformed(evt);
            }
        });
        jPanel2.add(btnMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 379, 177, 169));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tabla-de-surf.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 379, 177, 169));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo50sinfondo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 114, 110));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setText("ALUMNOS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 324, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setText("PROFESORES");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 324, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setText("CLASES");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("MATRICULA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 554, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setText("IMPLEMENTOS");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 554, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("INKA WARRIOR SURF");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 370, 58));

        PanelPerfil.setBackground(new java.awt.Color(255, 255, 255));
        PanelPerfil.setForeground(new java.awt.Color(255, 255, 255));
        PanelPerfil.setToolTipText("");

        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N
        lblAvatar.setToolTipText("");
        PanelPerfil.add(lblAvatar);

        btnPerfil.setText("PERFIL▾ ");
        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setFocusPainted(false);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        PanelPerfil.add(btnPerfil);

        jPanel2.add(PanelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        jMenu1.setText("ALUMNOS");

        ListarAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ListarAlumno.setText("Listar Alumno");
        ListarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(ListarAlumno);

        RegistrarAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        RegistrarAlumno.setText("Registrar Alumno");
        RegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(RegistrarAlumno);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("MATRICULA");

        ListarMatriculas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ListarMatriculas.setText("Listar Matriculas");
        ListarMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarMatriculasActionPerformed(evt);
            }
        });
        jMenu4.add(ListarMatriculas);

        RegistrarMatricula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        RegistrarMatricula.setText("Registrar Matricula");
        RegistrarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarMatriculaActionPerformed(evt);
            }
        });
        jMenu4.add(RegistrarMatricula);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("PROFESORES");

        ListarProfesores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ListarProfesores.setText("Listar Profesores");
        ListarProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarProfesoresActionPerformed(evt);
            }
        });
        jMenu2.add(ListarProfesores);

        RegistrarProfesor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        RegistrarProfesor.setText("Registrar Profesor");
        RegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarProfesorActionPerformed(evt);
            }
        });
        jMenu2.add(RegistrarProfesor);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("CLASES");

        ListarClases.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        ListarClases.setText("Listar Clases");
        ListarClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarClasesActionPerformed(evt);
            }
        });
        jMenu3.add(ListarClases);

        jMenuBar1.add(jMenu3);

        Implementos.setText("IMPLEMENTOS");

        ListarImplementos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ListarImplementos.setText("Listar Implementos");
        ListarImplementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarImplementosActionPerformed(evt);
            }
        });
        Implementos.add(ListarImplementos);

        AgregarImplemento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        AgregarImplemento.setText("Agregar Implemento");
        AgregarImplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarImplementoActionPerformed(evt);
            }
        });
        Implementos.add(AgregarImplemento);

        jMenuBar1.add(Implementos);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Profesores_Datos profesoresTabla = new Profesores_Datos(usuarioLogueado);
        profesoresTabla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Clases_Datos clasesTabla = new Clases_Datos(usuarioLogueado);
        clasesTabla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            Implementos_Datos matriculatabla = new Implementos_Datos(usuarioLogueado);
            matriculatabla.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
            
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnVentanaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentanaAlumnoActionPerformed
            Alumnos_Datos matriculatabla = new Alumnos_Datos(usuarioLogueado);
            matriculatabla.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnVentanaAlumnoActionPerformed

    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed
            Matricula_Datos matriculatabla = new Matricula_Datos(usuarioLogueado);
            matriculatabla.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnMatriculaActionPerformed

    private void RegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAlumnoActionPerformed
            FormAlumno formulario = new FormAlumno(usuarioLogueado);
            formulario.setVisible(true);
    }//GEN-LAST:event_RegistrarAlumnoActionPerformed

    private void ListarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarAlumnoActionPerformed
            Matricula_Datos matriculatabla = new Matricula_Datos(usuarioLogueado);
            matriculatabla.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_ListarAlumnoActionPerformed

    private void ListarMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarMatriculasActionPerformed
            Matricula_Datos matriculatabla = new Matricula_Datos(usuarioLogueado);
            matriculatabla.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_ListarMatriculasActionPerformed

    private void RegistrarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMatriculaActionPerformed
            FormMatricula formulario = new FormMatricula(usuarioLogueado);
            formulario.setVisible(true);
    }//GEN-LAST:event_RegistrarMatriculaActionPerformed

    private void ListarProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarProfesoresActionPerformed
            Profesores_Datos formulario = new Profesores_Datos(usuarioLogueado);
            formulario.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_ListarProfesoresActionPerformed

    private void RegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarProfesorActionPerformed
            FormProfesor formulario = new FormProfesor();
            formulario.setVisible(true);
    }//GEN-LAST:event_RegistrarProfesorActionPerformed

    private void ListarClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarClasesActionPerformed
            Clases_Datos formulario = new Clases_Datos(usuarioLogueado);
            formulario.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_ListarClasesActionPerformed

    private void ListarImplementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarImplementosActionPerformed
            Implementos_Datos formulario = new Implementos_Datos(usuarioLogueado);
            formulario.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_ListarImplementosActionPerformed

    private void AgregarImplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarImplementoActionPerformed
            FormImplementos formulario = new FormImplementos();
            formulario.setVisible(true);
    }//GEN-LAST:event_AgregarImplementoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarImplemento;
    private javax.swing.JMenu Implementos;
    private javax.swing.JMenuItem ListarAlumno;
    private javax.swing.JMenuItem ListarClases;
    private javax.swing.JMenuItem ListarImplementos;
    private javax.swing.JMenuItem ListarMatriculas;
    private javax.swing.JMenuItem ListarProfesores;
    private javax.swing.JPanel PanelPerfil;
    private javax.swing.JMenuItem RegistrarAlumno;
    private javax.swing.JMenuItem RegistrarMatricula;
    private javax.swing.JMenuItem RegistrarProfesor;
    private javax.swing.JButton btnMatricula;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnVentanaAlumno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAvatar;
    // End of variables declaration//GEN-END:variables
}
