/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.Employee;
import static utils.Constants.MAX_ATTEMPTS;

/**
 *
 * @author nilar
 */
public class LoginView extends javax.swing.JFrame {

    private int failedAttempts = 0;
 

    /**
     * Creates new form LoginVIew
     */
    public LoginView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNum = new javax.swing.JLabel();
        jLPass = new javax.swing.JLabel();
        jTNum = new javax.swing.JTextField();
        jTPass = new javax.swing.JTextField();
        jBLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLNum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNum.setText("Número de empleado");

        jLPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLPass.setText("Password");

        jTNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNumActionPerformed(evt);
            }
        });

        jBLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBLogin.setText("Acceder");
        jBLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTNum, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jLPass)
                    .addComponent(jLNum)
                    .addComponent(jTPass))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jBLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNumActionPerformed
    }//GEN-LAST:event_jTNumActionPerformed

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
          if (evt.getSource() == jBLogin) {
        }
            logUser();
    }//GEN-LAST:event_jBLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
  private void logUser() {
          Employee employee = new Employee();
        int user = Integer.parseInt(jTNum.getText());
        String pass = jTPass.getText();
        boolean finish = employee.logEmployee(user, pass);
        if (!finish) {
            failedAttempts++;
            if (failedAttempts >= MAX_ATTEMPTS) {
                JOptionPane.showMessageDialog(this, "Error login, superados los 3 intentos", "", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "Numero de usuario o contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
          JOptionPane.showMessageDialog(this, "Sesión iniciada correctamente!", "", JOptionPane.PLAIN_MESSAGE);

            this.setVisible(false);
            dispose();
            ShopView SV = new ShopView();
            SV.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLogin;
    private javax.swing.JLabel jLNum;
    private javax.swing.JLabel jLPass;
    private javax.swing.JTextField jTNum;
    private javax.swing.JTextField jTPass;
    // End of variables declaration//GEN-END:variables
}
