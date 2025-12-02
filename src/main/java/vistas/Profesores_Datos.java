package vistas;

import controladores.ControladorProfesor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Profesores_Datos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Profesores_Datos.class.getName());
    private modelos.Usuario usuarioLogueado;
    private ControladorProfesor controller = new ControladorProfesor();
    
    public Profesores_Datos() {
        initComponents();
        cargarDatos();
        this.setLocationRelativeTo(null);
        this.setTitle("Gestión de Profesores");
    }
    
    public Profesores_Datos(modelos.Usuario usuario) {
        initComponents();
        this.usuarioLogueado = usuario;
        cargarDatos();
        this.setLocationRelativeTo(null);
        this.setTitle("Gestión de Profesores");
    }
    
    public modelos.Usuario getUsuarioLogueado() {
        return this.usuarioLogueado;
    }

    public void cargarDatos() {
        DefaultTableModel modelo = controller.cargarProfesores();
        tbDatos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        btnRefrescar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 818, 410));

        btnRefrescar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRefrescar.setText("REFRESCAR");
        btnRefrescar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnRefrescar.addActionListener(this::btnRefrescarActionPerformed);
        jPanel1.add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 150, 80));

        btnAtras.setText("<");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtras.addActionListener(this::btnAtrasActionPerformed);
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 59, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("GESTION DE PROFESORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 150, 80));

        btnModificar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModificar.addActionListener(this::btnModificarActionPerformed);
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 150, 80));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 150, 80));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -580, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo50sinfondo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 110));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -580, -1, -1));

        jMenu1.setText("ALUMNOS");

        ListarAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ListarAlumno.setText("Listar Alumno");
        ListarAlumno.addActionListener(this::ListarAlumnoActionPerformed);
        jMenu1.add(ListarAlumno);

        RegistrarAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        RegistrarAlumno.setText("Registrar Alumno");
        RegistrarAlumno.addActionListener(this::RegistrarAlumnoActionPerformed);
        jMenu1.add(RegistrarAlumno);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("MATRICULA");

        ListarMatriculas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ListarMatriculas.setText("Listar Matriculas");
        ListarMatriculas.addActionListener(this::ListarMatriculasActionPerformed);
        jMenu4.add(ListarMatriculas);

        RegistrarMatricula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        RegistrarMatricula.setText("Registrar Matricula");
        RegistrarMatricula.addActionListener(this::RegistrarMatriculaActionPerformed);
        jMenu4.add(RegistrarMatricula);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("PROFESORES");

        ListarProfesores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ListarProfesores.setText("Listar Profesores");
        ListarProfesores.addActionListener(this::ListarProfesoresActionPerformed);
        jMenu2.add(ListarProfesores);

        RegistrarProfesor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        RegistrarProfesor.setText("Registrar Profesor");
        RegistrarProfesor.addActionListener(this::RegistrarProfesorActionPerformed);
        jMenu2.add(RegistrarProfesor);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("CLASES");
        jMenuBar1.add(jMenu3);

        jMenu5.setText("IMPLEMENTOS");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        cargarDatos();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        controller.retrocederAMenu(this, usuarioLogueado);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         int fila = tbDatos.getSelectedRow();
        
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un profesor para eliminar.", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String dni = tbDatos.getValueAt(fila, 0).toString();
        
        if (controller.eliminarProfesor(dni, this)) {
            cargarDatos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = tbDatos.getSelectedRow();
        
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un profesor para modificar.", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener datos de la fila seleccionada
        String dni = tbDatos.getValueAt(fila, 0).toString();
        String nombre = tbDatos.getValueAt(fila, 1).toString();
        String apellido = tbDatos.getValueAt(fila, 2).toString();
        String correo = tbDatos.getValueAt(fila, 3).toString();
        String direccion = tbDatos.getValueAt(fila, 4).toString();
        String telefono = tbDatos.getValueAt(fila, 5).toString();

        modelos.Profesor profesor = new modelos.Profesor(dni, nombre, apellido, correo, direccion, telefono);

        if (controller.modificarProfesor(profesor, this)) {
            cargarDatos();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        FormProfesor form = new FormProfesor(this);
        form.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void ListarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarAlumnoActionPerformed
        Matricula_Datos matriculatabla = new Matricula_Datos(usuarioLogueado);
        matriculatabla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ListarAlumnoActionPerformed

    private void RegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAlumnoActionPerformed
        FormAlumno formulario = new FormAlumno(usuarioLogueado);
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarAlumnoActionPerformed

    private void ListarMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarMatriculasActionPerformed
        Matricula_Datos matriculatabla = new Matricula_Datos(usuarioLogueado);
        matriculatabla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ListarMatriculasActionPerformed

    private void RegistrarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMatriculaActionPerformed
        FormMatricula formulario = new FormMatricula(usuarioLogueado);
        formulario.setVisible(true);
        this.setVisible(false);
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Profesores_Datos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ListarAlumno;
    private javax.swing.JMenuItem ListarMatriculas;
    private javax.swing.JMenuItem ListarProfesores;
    private javax.swing.JMenuItem RegistrarAlumno;
    private javax.swing.JMenuItem RegistrarMatricula;
    private javax.swing.JMenuItem RegistrarProfesor;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbDatos;
    // End of variables declaration//GEN-END:variables
}
