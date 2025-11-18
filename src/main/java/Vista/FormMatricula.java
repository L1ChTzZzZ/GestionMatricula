/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.ClaseCompleta;
import Modelo.DAO.ClaseCompletaDAO;
import controlador.ControladorMatricula;

/**
 *
 * @author HP
 */
public class FormMatricula extends javax.swing.JFrame {
    ClaseCompletaDAO cb = new ClaseCompletaDAO();
    
    public FormMatricula() {
        initComponents();
        setLocationRelativeTo(null);
        cb.RellenarCB("CLASES", "id_clase", cbIdClase);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Dni1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Dni2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Dni4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Dni5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Dni6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Dni7 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbIdClase = new javax.swing.JComboBox<>();
        txtDescripcion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtMensualidad = new javax.swing.JTextField();
        txtProfesor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnAgregarAlumno = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        BGMatricula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setText("<");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 59, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("AGREGAR MATRICULA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\logo50sinfondo.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setText("Direccion:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, 25));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\nota-adhesiva.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Dni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dni1ActionPerformed(evt);
            }
        });
        jPanel2.add(Dni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 210, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setText("Nombre:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 25));

        Dni2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dni2ActionPerformed(evt);
            }
        });
        jPanel2.add(Dni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 210, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setText("Apellido:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 25));

        Dni4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dni4ActionPerformed(evt);
            }
        });
        jPanel2.add(Dni4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 210, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel9.setText("Correo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 25));

        Dni5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dni5ActionPerformed(evt);
            }
        });
        jPanel2.add(Dni5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 210, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel10.setText("Telefono:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, 25));

        Dni6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dni6ActionPerformed(evt);
            }
        });
        jPanel2.add(Dni6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 210, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setText("DATOS DEL ESTUDIANTE");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel13.setText("DNI:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 45, 25));

        Dni7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dni7ActionPerformed(evt);
            }
        });
        jPanel2.add(Dni7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 210, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 320, 380));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\pizarra.png")); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setText("DESCRIPCION:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 25));

        cbIdClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdClaseActionPerformed(evt);
            }
        });
        jPanel4.add(cbIdClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, -1));

        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel4.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 280, 50));

        jLabel15.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel15.setText("HORARIO:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 25));

        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });
        jPanel4.add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel16.setText("PAGO:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 25));

        jLabel17.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel17.setText("PROFESOR:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, 25));

        txtMensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensualidadActionPerformed(evt);
            }
        });
        jPanel4.add(txtMensualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, -1));

        txtProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfesorActionPerformed(evt);
            }
        });
        jPanel4.add(txtProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel18.setText("ASIGNACION DE CLASES");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel20.setText("CLASE:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 25));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 320, 380));

        btnAgregarAlumno.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregarAlumno.setText("AGREGAR");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 160, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("INFORMACION DEL PAGO");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\tarjeta-de-debito.png")); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YAPE", "EFECTIVO", "TARJETA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 170, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel14.setText("TIPO DE PAGO:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 25));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 310, 190));

        BGMatricula.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\Fondo.png")); // NOI18N
        jPanel1.add(BGMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 1060, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void Dni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dni1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dni1ActionPerformed

    private void Dni2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dni2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dni2ActionPerformed

    private void Dni4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dni4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dni4ActionPerformed

    private void Dni5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dni5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dni5ActionPerformed

    private void Dni6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dni6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dni6ActionPerformed

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void Dni7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dni7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dni7ActionPerformed

    private void txtProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfesorActionPerformed

    private void txtMensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensualidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensualidadActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void cbIdClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdClaseActionPerformed

        String idSeleccionado = (String) cbIdClase.getSelectedItem();
        if (idSeleccionado == null || idSeleccionado.isEmpty()) return;

        ClaseCompleta datos = cb.obtenerDatosClaseCompleta(idSeleccionado);

        if (datos != null) {
            txtHorario.setText(datos.getHorario());
            txtMensualidad.setText(String.valueOf(datos.getMensualidad()));
            txtDescripcion.setText(datos.getDescripcion());
            txtProfesor.setText(datos.getNombreProfesor());
        }
    }//GEN-LAST:event_cbIdClaseActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGMatricula;
    private javax.swing.JTextField Dni1;
    private javax.swing.JTextField Dni2;
    private javax.swing.JTextField Dni4;
    private javax.swing.JTextField Dni5;
    private javax.swing.JTextField Dni6;
    private javax.swing.JTextField Dni7;
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnAtras;
    private javax.swing.JComboBox<String> cbIdClase;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtMensualidad;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables
}
