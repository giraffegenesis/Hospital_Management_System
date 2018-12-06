/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author general
 */
public class AdminLogin extends javax.swing.JFrame {

    private static HMS hms;

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        hms = HMS.instance();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jPanelRight = new javax.swing.JPanel();
        jLabelAdminPassword = new javax.swing.JLabel();
        jLabelAdminUserName = new javax.swing.JLabel();
        jLabelHeader = new javax.swing.JLabel();
        jPasswordFieldAdminPawword = new javax.swing.JPasswordField();
        jTextFieldAdminKeyword = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelAdminLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBase.setBackground(new java.awt.Color(102, 102, 102));

        jPanelRight.setBackground(new java.awt.Color(0, 204, 255));

        jLabelAdminPassword.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabelAdminPassword.setForeground(new java.awt.Color(102, 102, 102));
        jLabelAdminPassword.setText("Password:");

        jLabelAdminUserName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabelAdminUserName.setForeground(new java.awt.Color(102, 102, 102));
        jLabelAdminUserName.setText("Keyword:");

        jLabelHeader.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabelHeader.setForeground(new java.awt.Color(102, 102, 102));
        jLabelHeader.setText("Mission Hill Hospital Management System");

        jButtonLogin.setBackground(new java.awt.Color(153, 153, 153));
        jButtonLogin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(51, 51, 51));
        jButtonLogin.setText("Login");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(153, 153, 153));
        jButtonCancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(51, 51, 51));
        jButtonCancel.setText("Cancel");
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRightLayout = new javax.swing.GroupLayout(jPanelRight);
        jPanelRight.setLayout(jPanelRightLayout);
        jPanelRightLayout.setHorizontalGroup(
            jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightLayout.createSequentialGroup()
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRightLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRightLayout.createSequentialGroup()
                                .addComponent(jLabelAdminUserName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanelRightLayout.createSequentialGroup()
                                .addComponent(jLabelAdminPassword)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAdminKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldAdminPawword, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRightLayout.createSequentialGroup()
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelRightLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelHeader)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelRightLayout.setVerticalGroup(
            jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelHeader)
                .addGap(68, 68, 68)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAdminUserName)
                    .addComponent(jTextFieldAdminKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAdminPassword)
                    .addComponent(jPasswordFieldAdminPawword, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabelAdminLogin.setFont(new java.awt.Font("Lucida Grande", 2, 24)); // NOI18N
        jLabelAdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdminLogin.setText("Admin Login");

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAdminLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabelAdminLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        String keyword = jTextFieldAdminKeyword.getText(); //from user input
        String password = new String(jPasswordFieldAdminPawword.getPassword());  //from user input

        try {
            ResultSet rs = hms.getAdmin(keyword, password);

            if (rs.next()) {
                String keyword_from_db = rs.getString(1);
                String password_from_db = rs.getString(2);

                if (keyword_from_db.equalsIgnoreCase(keyword) && password_from_db.equalsIgnoreCase(password)) {
                    AdminPortal adminLOptions = new AdminPortal();
                    adminLOptions.setVisible(true);
                    adminLOptions.pack();
                    adminLOptions.setLocationRelativeTo(null);
                    adminLOptions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect keyword or password.");
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    // GUI window is closed upon clicking this button
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelAdminLogin;
    private javax.swing.JLabel jLabelAdminPassword;
    private javax.swing.JLabel jLabelAdminUserName;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelRight;
    private javax.swing.JPasswordField jPasswordFieldAdminPawword;
    private javax.swing.JTextField jTextFieldAdminKeyword;
    // End of variables declaration//GEN-END:variables
}
