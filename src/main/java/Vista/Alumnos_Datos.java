
package Vista;

import Controlador.ControladorAlumno;
import Modelo.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Alumnos_Datos extends javax.swing.JFrame {
    
    private Usuario usuarioLogueado;
    private ControladorAlumno controller = new ControladorAlumno();
    
    public Alumnos_Datos() {
        initComponents();

    }

    public Alumnos_Datos(Usuario usuario) {
        initComponents();
        mostrarDatosDeLaTabla("ALUMNO");
        this.usuarioLogueado = usuario;
        setLocationRelativeTo(null);
    }
    
    
        public void mostrarDatosDeLaTabla(String tabla) {
        DefaultTableModel modeloConDatos = controller.cargarDatosAlumnos(tabla);
        tbAlumno.setModel(modeloConDatos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAtras1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlumno = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnAgregarAlumno = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1040, 580));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\logo50sinfondo.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 110));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("GESTION ALUMNOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras1.setText("<");
        btnAtras1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 59, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\logo50sinfondo.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 110));

        btnRefrescar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRefrescar.setText("REFRESCAR");
        btnRefrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 281, 150, 80));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 150, 80));

        tbAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbAlumno.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbAlumno);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 820, 410));

        btnModificar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 481, 150, 80));

        btnAgregarAlumno.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregarAlumno.setText("AGREGAR");
        btnAgregarAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 150, 80));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\Fondo.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -580, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int filaSeleccionada = tbAlumno.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String DniAlumno = tbAlumno.getValueAt(filaSeleccionada, 0).toString();
        controller.eliminarAlumno(DniAlumno, this);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        controller.retrocederAMenu3(this, usuarioLogueado);
    }//GEN-LAST:event_btnAtras1ActionPerformed

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        FormAlumno formulario = new FormAlumno(usuarioLogueado);
        formulario.setVisible(true);
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(Alumnos_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos_Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAlumno;
    // End of variables declaration//GEN-END:variables
}