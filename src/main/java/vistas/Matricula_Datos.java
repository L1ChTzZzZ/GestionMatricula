package vistas;

import controladores.ControladorMatricula;
import javax.swing.table.DefaultTableModel;
import modelos.Cconexion;
import modelos.Matricula;
import modelos.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class Matricula_Datos extends javax.swing.JFrame {
    private Usuario usuarioLogueado;
    private ControladorMatricula controller = new ControladorMatricula();

    public Matricula_Datos() {
        initComponents();
        mostrarDatosEnVisor("MATRICULA");
        this.setLocationRelativeTo(null);
        this.setTitle("Matriculas");
        this.setTitle("Gestión de Matricula");
    }
    
    public Matricula_Datos(Usuario usuario) {
        initComponents();
        this.usuarioLogueado = usuario; 
        mostrarDatosEnVisor("MATRICULA"); 
        this.setLocationRelativeTo(null);
        this.setTitle("Gestión de Matricula");
    }
        public modelos.Usuario getUsuarioLogueado() {
        return this.usuarioLogueado;
    }
        
        

    public void mostrarDatosEnVisor(String tabla) {
        DefaultTableModel modeloConDatos = controller.cargarDatosMatricula(tabla);
        visor.setModel(modeloConDatos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(visor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 818, 410));

        jButton2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton2.setText("REFRESCAR");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 150, 80));

        btnAtras.setText("<");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 59, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("GESTION DE MATRICULAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo50sinfondo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 110));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 150, 80));

        btnModificar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 150, 80));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 150, 80));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -580, -1, -1));
        jLabel4.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarDatosEnVisor("MATRICULA");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        controller.retrocederAMenu(this, usuarioLogueado);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int filaSeleccionada = visor.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String idMatricula = visor.getValueAt(filaSeleccionada, 0).toString();
        controller.eliminarMatricula(idMatricula, this);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
           int filaSeleccionada = visor.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // 1. Obtener los valores editados directamente de la tabla (visor)
    
    // Asumimos que el ID (Columna 0) no es editable
    String id = visor.getValueAt(filaSeleccionada, 0).toString();
    
    // Obtener los demás valores de las celdas (ya editados por el usuario)
    String fecha = visor.getValueAt(filaSeleccionada, 1).toString();
    String montoStr = visor.getValueAt(filaSeleccionada, 2).toString();
    String tipoPago = visor.getValueAt(filaSeleccionada, 3).toString();
    String idUsuario = visor.getValueAt(filaSeleccionada, 4).toString();
    String dniAlumno = visor.getValueAt(filaSeleccionada, 5).toString();
    String idClase = visor.getValueAt(filaSeleccionada, 6).toString();
    
    // Variables para conversión
    double monto = 0.0;
    java.sql.Date fechaPagoSQL = null;

    // 2. Conversión de Monto (String a double)
    try {
        monto = Double.parseDouble(montoStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El 'Monto total' debe ser un número válido en la tabla.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // 3. Conversión de Fecha (String a java.sql.Date)
    try {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
        java.util.Date parsedDate = format.parse(fecha);
        fechaPagoSQL = new java.sql.Date(parsedDate.getTime());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "El formato de fecha en la tabla es incorrecto (use AAAA-MM-DD).", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // 4. Crear el objeto Matricula
    modelos.Matricula matriculaModificada = new modelos.Matricula(
        id, fechaPagoSQL, monto, tipoPago, idUsuario, dniAlumno, idClase
    );

    // 5. Delegar la acción al controlador
    controller.modificarMatricula(matriculaModificada, this);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
            FormMatricula formulario = new FormMatricula(usuarioLogueado);
            formulario.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Matricula_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula_Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarImplemento;
    private javax.swing.JMenu Implementos;
    private javax.swing.JMenuItem ListarAlumno;
    private javax.swing.JMenuItem ListarClases;
    private javax.swing.JMenuItem ListarImplementos;
    private javax.swing.JMenuItem ListarMatriculas;
    private javax.swing.JMenuItem ListarProfesores;
    private javax.swing.JMenuItem RegistrarAlumno;
    private javax.swing.JMenuItem RegistrarMatricula;
    private javax.swing.JMenuItem RegistrarProfesor;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
