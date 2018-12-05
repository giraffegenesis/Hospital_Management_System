/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import javax.swing.JFrame;

/**
 *
 * @author general
 */
public class AdminPortal extends javax.swing.JFrame {

    /**
     * Creates new form AdminOptions
     */
    public AdminPortal() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jToggleButtonUpdateDoctor = new javax.swing.JToggleButton();
        jToggleButtonAddPatient = new javax.swing.JToggleButton();
        jToggleButtonAddDoctor = new javax.swing.JToggleButton();
        jToggleButtonUpdatePatient = new javax.swing.JToggleButton();
        jToggleButtonDeleteDoctor = new javax.swing.JToggleButton();
        jToggleButtonDeletePatient = new javax.swing.JToggleButton();
        jPanelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelAdminPortal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBase.setBackground(new java.awt.Color(102, 102, 102));

        jPanelRight.setBackground(new java.awt.Color(255, 255, 255));

        jToggleButtonUpdateDoctor.setBackground(new java.awt.Color(255, 153, 0));
        jToggleButtonUpdateDoctor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButtonUpdateDoctor.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonUpdateDoctor.setText("Update Doctor ");
        jToggleButtonUpdateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonUpdateDoctorActionPerformed(evt);
            }
        });

        jToggleButtonAddPatient.setBackground(new java.awt.Color(51, 102, 0));
        jToggleButtonAddPatient.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButtonAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonAddPatient.setText("Add Patient");
        jToggleButtonAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAddPatientActionPerformed(evt);
            }
        });

        jToggleButtonAddDoctor.setBackground(new java.awt.Color(51, 102, 0));
        jToggleButtonAddDoctor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButtonAddDoctor.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonAddDoctor.setText("Add Doctor ");
        jToggleButtonAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAddDoctorActionPerformed(evt);
            }
        });

        jToggleButtonUpdatePatient.setBackground(new java.awt.Color(255, 153, 0));
        jToggleButtonUpdatePatient.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButtonUpdatePatient.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonUpdatePatient.setText("Update Patient ");
        jToggleButtonUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonUpdatePatientActionPerformed(evt);
            }
        });

        jToggleButtonDeleteDoctor.setBackground(new java.awt.Color(204, 0, 0));
        jToggleButtonDeleteDoctor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButtonDeleteDoctor.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonDeleteDoctor.setText("Delete Doctor ");
        jToggleButtonDeleteDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonDeleteDoctorActionPerformed(evt);
            }
        });

        jToggleButtonDeletePatient.setBackground(new java.awt.Color(204, 0, 0));
        jToggleButtonDeletePatient.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jToggleButtonDeletePatient.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonDeletePatient.setText("Delete Patient");
        jToggleButtonDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonDeletePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRightLayout = new javax.swing.GroupLayout(jPanelRight);
        jPanelRight.setLayout(jPanelRightLayout);
        jPanelRightLayout.setHorizontalGroup(
            jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRightLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelRightLayout.createSequentialGroup()
                        .addComponent(jToggleButtonAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButtonUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRightLayout.createSequentialGroup()
                        .addComponent(jToggleButtonAddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jToggleButtonUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButtonDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonDeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanelRightLayout.setVerticalGroup(
            jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRightLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonDeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonAddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButtonAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButtonUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButtonDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanelHeader.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Mission Hill Hospital Management System");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        jLabelAdminPortal.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabelAdminPortal.setForeground(new java.awt.Color(204, 204, 204));
        jLabelAdminPortal.setText("Admin Portal");

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelAdminPortal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBaseLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabelAdminPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    //Update Doctor
    private void jToggleButtonUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonUpdateDoctorActionPerformed

        UpdateDoctorId updateDoc = new UpdateDoctorId();
        updateDoc.setVisible(true);
        updateDoc.pack();
        updateDoc.setLocationRelativeTo(null);
        updateDoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonUpdateDoctorActionPerformed
    //add patient
    private void jToggleButtonAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAddPatientActionPerformed
        AddPatientPortal addPatient = new AddPatientPortal();
        addPatient.setVisible(true);
        addPatient.pack();
        addPatient.setLocationRelativeTo(null);
        addPatient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonAddPatientActionPerformed

    //add doctor
    private void jToggleButtonAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAddDoctorActionPerformed
        AddDoctorPortal addDoc = new AddDoctorPortal();
        addDoc.setVisible(true);
        addDoc.pack();
        addDoc.setLocationRelativeTo(null);
        addDoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonAddDoctorActionPerformed

    private void jToggleButtonUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonUpdatePatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonUpdatePatientActionPerformed

    private void jToggleButtonDeleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonDeleteDoctorActionPerformed
        DeleteDoctorPortal deleteDoc = new DeleteDoctorPortal();
        deleteDoc.setVisible(true);
        deleteDoc.pack();
        deleteDoc.setLocationRelativeTo(null);
        deleteDoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonDeleteDoctorActionPerformed
//delete patient
    private void jToggleButtonDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonDeletePatientActionPerformed
        DeletePatientPortal deletePatient = new DeletePatientPortal();
        deletePatient.setVisible(true);
        deletePatient.pack();
        deletePatient.setLocationRelativeTo(null);
        deletePatient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonDeletePatientActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdminPortal;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelRight;
    private javax.swing.JToggleButton jToggleButtonAddDoctor;
    private javax.swing.JToggleButton jToggleButtonAddPatient;
    private javax.swing.JToggleButton jToggleButtonDeleteDoctor;
    private javax.swing.JToggleButton jToggleButtonDeletePatient;
    private javax.swing.JToggleButton jToggleButtonUpdateDoctor;
    private javax.swing.JToggleButton jToggleButtonUpdatePatient;
    // End of variables declaration//GEN-END:variables
}
