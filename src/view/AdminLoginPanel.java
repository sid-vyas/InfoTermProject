/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import model.directories.DoctorDirectory;
import model.directories.EncounterDirectory;
import model.directories.HospitalDirectory;
import model.directories.PatientDirectory;

/**
 *
 * @author ASUS
 */
public class AdminLoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminLoginPanel
     */
    JPanel bottomPanel;
    String adminType;
    DoctorDirectory allDoctors;
    HospitalDirectory allHospitals;
    PatientDirectory allPatients;
    EncounterDirectory allEncounters;
    
    public AdminLoginPanel(JPanel bottomPanel, DoctorDirectory allDoctors, HospitalDirectory allHospitals, PatientDirectory allPatients, EncounterDirectory allEncounters) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.allDoctors = allDoctors;
        this.allHospitals = allHospitals;
        this.allPatients = allPatients;
        this.allEncounters = allEncounters;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        adminTypeLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        adminTypeMenu = new javax.swing.JComboBox<>();

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setText("Admin Login");

        adminTypeLabel.setText("Select Admin Type:");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        usernameLabel.setText("Enter Username:");

        adminTypeMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System", "Community", "Hospital" }));
        adminTypeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTypeMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminTypeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(loginButton)))))
                .addContainerGap(732, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(30, 30, 30)
                        .addComponent(titleLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminTypeLabel)
                            .addComponent(adminTypeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usernameLabel)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(loginButton)
                .addContainerGap(579, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        bottomPanel.remove(this);
    }//GEN-LAST:event_backButtonActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        {                                  
        // TODO add your handling code here:
        if(adminTypeMenu.getSelectedItem().equals("System")) {
            adminType = "System";
        } else if(adminTypeMenu.getSelectedItem().equals("Community")) {
            adminType = "Community";
        } else {
            adminType = "Hospital";
        }
        
        if((adminTypeMenu.getSelectedItem().equals("System") && (usernameField.getText().equals("admin1") || usernameField.getText().equals("admin2")))  || (adminTypeMenu.getSelectedItem().equals("Community") && (usernameField.getText().equals("comm1") || usernameField.getText().equals("comm2"))) || (adminTypeMenu.getSelectedItem().equals("Hospital") && (usernameField.getText().equals("hAdmin1") || usernameField.getText().equals("hAdmin2")))) {
            AdminLandingPanel systemAdminLoginPanel = new AdminLandingPanel(adminType, allDoctors, allHospitals, allPatients, allEncounters);
            bottomPanel.add(systemAdminLoginPanel);
            CardLayout layout = (CardLayout) bottomPanel.getLayout();
            layout.next(bottomPanel);
            JOptionPane.showMessageDialog(bottomPanel, "You are logged in Successfully");
        } 
        else {
            JOptionPane.showMessageDialog(bottomPanel, "The entered username is incorrect", "Invalid Credentials", ERROR_MESSAGE);
        }  
                                              
    }//GEN-LAST:event_loginButtonActionPerformed
    }
    private void adminTypeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTypeMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminTypeMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminTypeLabel;
    private javax.swing.JComboBox<String> adminTypeMenu;
    private javax.swing.JButton backButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
