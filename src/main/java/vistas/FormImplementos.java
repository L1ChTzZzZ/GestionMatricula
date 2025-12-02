/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controladores.ControladorImplementos;
import controladores.ControladorMatricula;
import javax.swing.JOptionPane;
import modelos.Implemento;
import modelos.Usuario;
import modelos.daos.ImplementoDAO;

/**
 *
 * @author HP
 */
public class FormImplementos extends javax.swing.JFrame {

    private Usuario usuarioLogueado;
    private ControladorImplementos controller = new ControladorImplementos();
    private ImplementoDAO dao = new ImplementoDAO();
    public FormImplementos() {
        initComponents();
    }
    
    public FormImplementos(Usuario usuario) {
        initComponents();
        this.usuarioLogueado = usuario;
        setLocationRelativeTo(null);
    }
    
    public void limpiarFormulario() {
    txtNombre.setText("");
    txtTipo.setText("");
    txtStock.setText("");
    txtPrecio.setText("");
    
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnAgregarImplemento = new javax.swing.JButton();
        BGMatricula = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo50sinfondo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 110));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Agregar Implemento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        btnAtras.setText("<");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 59, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nota-adhesiva.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 210, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setText("Tipo:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 25));

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        jPanel2.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 210, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setText("Stock:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 25));

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        jPanel2.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 210, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel9.setText("Precio:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 25));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 210, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setText("DATOS DEL IMPLEMENTO");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel13.setText("Nombre:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 25));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 330, 290));

        btnAgregarImplemento.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregarImplemento.setText("AGREGAR IMPLEMENTO");
        btnAgregarImplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImplementoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarImplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 230, 60));

        BGMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.png"))); // NOI18N
        jPanel1.add(BGMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 670, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 550));

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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        controller.retrocederAMenu5(this, usuarioLogueado);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnAgregarImplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImplementoActionPerformed
        try {
                // Generar ID automáticamente desde el DAO
                String id = dao.generarIdImplemento();  

                String nombre = txtNombre.getText();
                String tipo = txtTipo.getText();
                int stock = Integer.parseInt(txtStock.getText());
                double precio = Double.parseDouble(txtPrecio.getText());

                // Crear el objeto implemento
                Implemento i = new Implemento(id, nombre, tipo, stock, precio);

                // Mandarlo al controlador (this = la vista actual)
                controller.registrarImplemento(i, this);

                limpiarFormulario();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Datos inválidos: " + e.getMessage());
            }
    }//GEN-LAST:event_btnAgregarImplementoActionPerformed

    private void ListarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarAlumnoActionPerformed
        Matricula_Datos matriculatabla = new Matricula_Datos(usuarioLogueado);
        matriculatabla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ListarAlumnoActionPerformed

    private void RegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAlumnoActionPerformed
        FormAlumno formulario = new FormAlumno(usuarioLogueado);
        formulario.setVisible(true);
    }//GEN-LAST:event_RegistrarAlumnoActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormImplementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormImplementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormImplementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormImplementos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormImplementos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarImplemento;
    private javax.swing.JLabel BGMatricula;
    private javax.swing.JMenu Implementos;
    private javax.swing.JMenuItem ListarAlumno;
    private javax.swing.JMenuItem ListarClases;
    private javax.swing.JMenuItem ListarImplementos;
    private javax.swing.JMenuItem ListarMatriculas;
    private javax.swing.JMenuItem ListarProfesores;
    private javax.swing.JMenuItem RegistrarAlumno;
    private javax.swing.JMenuItem RegistrarMatricula;
    private javax.swing.JMenuItem RegistrarProfesor;
    private javax.swing.JButton btnAgregarImplemento;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
