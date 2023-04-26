/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package infotermproject;

import java.awt.CardLayout;
import model.directories.DoctorDirectory;
import model.directories.EncounterDirectory;
import model.directories.HospitalDirectory;
import model.directories.PatientDirectory;
import view.AdminLoginPanel;
import view.DoctorLoginPanel;
import view.PatientLoginPanel;

/**
 *
 * @author ASUS
 */
public class MainSystemJFrame extends javax.swing.JFrame {

    DoctorDirectory allDoctors;
    HospitalDirectory allHospitals;
    PatientDirectory allPatients;
    EncounterDirectory allEncounters;
    
    public MainSystemJFrame() {
        initComponents();
        allDoctors = new DoctorDirectory();
        allHospitals = new HospitalDirectory();
        allPatients = new PatientDirectory();
        allEncounters = new EncounterDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainSplitPane = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        mainTitleLabel = new javax.swing.JLabel();
        patientLoginButton = new javax.swing.JButton();
        doctorLoginButton = new javax.swing.JButton();
        adminLoginButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topPanel.setBackground(new java.awt.Color(255, 153, 153));

        mainTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mainTitleLabel.setText("Hospital Management System");

        patientLoginButton.setText("Patient Login");
        patientLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientLoginButtonActionPerformed(evt);
            }
        });

        doctorLoginButton.setText("Doctor Login");
        doctorLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorLoginButtonActionPerformed(evt);
            }
        });

        adminLoginButton.setText("Admin Login");
        adminLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(patientLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(mainTitleLabel)
                        .addContainerGap(427, Short.MAX_VALUE))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(doctorLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(mainTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientLoginButton)
                    .addComponent(doctorLoginButton)
                    .addComponent(adminLoginButton))
                .addGap(19, 19, 19))
        );

        mainSplitPane.setTopComponent(topPanel);

        bottomPanel.setBackground(new java.awt.Color(255, 153, 153));
        bottomPanel.setLayout(new java.awt.CardLayout());
        mainSplitPane.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorLoginButtonActionPerformed
        // TODO add your handling code here:
        DoctorLoginPanel doctorLoginPanel = new DoctorLoginPanel(bottomPanel, allDoctors, allEncounters, allPatients);
        bottomPanel.add(doctorLoginPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_doctorLoginButtonActionPerformed

    private void adminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginButtonActionPerformed
        // TODO add your handling code here:
        AdminLoginPanel adminLoginPanel = new AdminLoginPanel(bottomPanel, allDoctors, allHospitals, allPatients, allEncounters);
        bottomPanel.add(adminLoginPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_adminLoginButtonActionPerformed

    private void patientLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientLoginButtonActionPerformed
        // TODO add your handling code here:
        PatientLoginPanel patientLoginPanel = new PatientLoginPanel(bottomPanel, allDoctors, allPatients);
        bottomPanel.add(patientLoginPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_patientLoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainSystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSystemJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLoginButton;
    public javax.swing.JPanel bottomPanel;
    private javax.swing.JButton doctorLoginButton;
    private javax.swing.JSplitPane mainSplitPane;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JButton patientLoginButton;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
