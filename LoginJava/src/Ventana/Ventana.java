/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import Usuarios.Usuarios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sala de Sistemas
 */
public class Ventana extends javax.swing.JFrame {

  // Lista estática para almacenar los usuarios
    private static List<Usuarios> listaUsuarios = new ArrayList<>();
    
    public Ventana() {
        initComponents();
    }
    

    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JbnSave = new javax.swing.JButton();
        JbnListarUsuarios = new javax.swing.JButton();
        txtListarUsuarios = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario de Usuarios");

        jLabel1.setText("NOMBRE:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel2.setText("NICKNAME:");

        txtNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicknameActionPerformed(evt);
            }
        });

        jLabel3.setText("CLAVE:");

        JbnSave.setText("GUARDAR");
        JbnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbnSaveActionPerformed(evt);
            }
        });

        JbnListarUsuarios.setText("LISTAR USUARIOS");
        JbnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbnListarUsuariosActionPerformed(evt);
            }
        });

        txtListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtListarUsuariosActionPerformed(evt);
            }
        });

        jLabel4.setText("Hecho Por:Didier Lopez y Ana Caro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(txtListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JbnListarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(JbnSave))
                    .addComponent(txtNickname)
                    .addComponent(txtName)
                    .addComponent(txtClave, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(JbnSave)
                .addGap(37, 37, 37)
                .addComponent(JbnListarUsuarios)
                .addGap(18, 18, 18)
                .addComponent(txtListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicknameActionPerformed

    private void JbnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbnSaveActionPerformed
         // Obtener los datos ingresados en los campos de texto
        String nombre = txtName.getText();
        String nickname = txtNickname.getText();
        String clave = txtClave.getText();

        // Guardar el usuario en la lista
        Usuarios.SaveUsuario(nombre, nickname, clave);

        // Limpiar los campos de texto
        txtName.setText("");
        txtNickname.setText("");
        txtClave.setText("");

        // Mensaje de confirmación
        javax.swing.JOptionPane.showMessageDialog(this, "Usuario guardado correctamente!");
    }//GEN-LAST:event_JbnSaveActionPerformed

    private void JbnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbnListarUsuariosActionPerformed
         // Obtener la lista de usuarios
        List<Usuarios> usuarios = Usuarios.listarUsuarios();

        // Crear un StringBuilder para mostrar los usuarios
        StringBuilder sb = new StringBuilder();

        // Agregar cada usuario a la cadena
        for (Usuarios usuario : usuarios) {
            sb.append("Nombre: ").append(usuario.getNombre())
              .append(", Nickname: ").append(usuario.getNickname())
              .append(", Clave: ").append(usuario.getClave()).append("\n");
        }

        // Mostrar la lista en el campo de texto
        txtListarUsuarios.setText(sb.toString());
    }//GEN-LAST:event_JbnListarUsuariosActionPerformed

    private void txtListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtListarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtListarUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbnListarUsuarios;
    private javax.swing.JButton JbnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtListarUsuarios;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNickname;
    // End of variables declaration//GEN-END:variables
}
