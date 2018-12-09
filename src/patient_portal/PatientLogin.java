
package patient_portal;

import hospital_management_system.Driver;
import hospital_management_system.HMS;
import hospital_management_system.UpdatePatientId;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Class that logins patients
 * @author AbrarZawed
 * Date Created: 5th December, 2018 
 * Last Modified: 6th December, 2018
 */
public class PatientLogin extends javax.swing.JFrame {

    // variables for Singleton
    private static HMS hms;

    /**
     * Creates new form PatientLogin
     */
    public PatientLogin() {
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
        jLabelPatientId = new javax.swing.JLabel();
        jTextFieldPatientId = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonEnter = new javax.swing.JButton();
        jLabelPatientFirstName = new javax.swing.JLabel();
        jLabelPatientLastName = new javax.swing.JLabel();
        jTextFieldPatientLastName = new javax.swing.JTextField();
        jTextFieldPatientFirstName = new javax.swing.JTextField();
        jLabelPateintLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBase.setBackground(new java.awt.Color(102, 102, 102));

        jPanelRight.setBackground(new java.awt.Color(51, 204, 255));

        jLabelPatientId.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabelPatientId.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPatientId.setText("Patient Id:");

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonEnter.setText("Login");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });

        jLabelPatientFirstName.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabelPatientFirstName.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPatientFirstName.setText("Patient First Name:");

        jLabelPatientLastName.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabelPatientLastName.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPatientLastName.setText("Patient Last Name:");

        javax.swing.GroupLayout jPanelRightLayout = new javax.swing.GroupLayout(jPanelRight);
        jPanelRight.setLayout(jPanelRightLayout);
        jPanelRightLayout.setHorizontalGroup(
            jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightLayout.createSequentialGroup()
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRightLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRightLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRightLayout.createSequentialGroup()
                                .addComponent(jLabelPatientId)
                                .addGap(88, 88, 88)
                                .addComponent(jTextFieldPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRightLayout.createSequentialGroup()
                                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelPatientFirstName)
                                    .addComponent(jLabelPatientLastName))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelRightLayout.setVerticalGroup(
            jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPatientId)
                    .addComponent(jTextFieldPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPatientFirstName)
                    .addComponent(jTextFieldPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPatientLastName)
                    .addComponent(jTextFieldPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jLabelPateintLogin.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabelPateintLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPateintLogin.setText("Patient Login");

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelPateintLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabelPateintLogin)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Returns to the Driver class
     * @param evt 
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
        Driver.main(null);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * Verifies patient's information with the DB
     * @param evt 
     */
    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        int patientId = Integer.parseInt(jTextFieldPatientId.getText());    //input from user
        String fName = jTextFieldPatientFirstName.getText();    //input from user
        String lName = jTextFieldPatientLastName.getText();     //input from user

        try {
            ResultSet rs;
            rs = hms.getPatient(patientId);
            if (rs.next()) {

                String fName_from_db = rs.getString(1); //db output
                String lName_from_db = rs.getString(2); //db output

                // compare the user input with db output
                if (fName_from_db.equalsIgnoreCase(fName) && lName_from_db.equalsIgnoreCase(lName)) {
                    PatientPortal pp = new PatientPortal();
                    pp.setVisible(true);
                    pp.pack();
                    pp.setLocationRelativeTo(null);
                    pp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    pp.jTextFieldPatientId.setText(String.valueOf(patientId));
                    pp.jTextFieldPatientId.setEditable(false);
                    pp.jTextFieldFirstName.setText(rs.getString(1));
                    pp.jTextFieldFirstName.setEditable(false);
                    pp.jTextFieldLastName.setText(rs.getString(2));
                    pp.jTextFieldLastName.setEditable(false);
                    pp.jTextFieldPhoneNumber.setText(rs.getString(3));
                    pp.jTextFieldPhoneNumber.setEditable(false);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Inputs, Please Enter Valid Inputs.");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePatientId.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonEnterActionPerformed

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
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JLabel jLabelPateintLogin;
    private javax.swing.JLabel jLabelPatientFirstName;
    private javax.swing.JLabel jLabelPatientId;
    private javax.swing.JLabel jLabelPatientLastName;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelRight;
    private javax.swing.JTextField jTextFieldPatientFirstName;
    private javax.swing.JTextField jTextFieldPatientId;
    private javax.swing.JTextField jTextFieldPatientLastName;
    // End of variables declaration//GEN-END:variables
}
