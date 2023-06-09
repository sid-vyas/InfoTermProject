/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import model.directories.DoctorDirectory;

/**
 *
 * @author ASUS
 */
public class PatientLoginPanel extends javax.swing.JPanel {
    JPanel bottomPanel;
    DoctorDirectory allDoctors;
    
    private static final String username = "root";
    private static final String password = "root";
    private static final String dataConnector = "jdbc:mysql://localhost:3306/connector";
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form patientLoginScreen
     */
    public PatientLoginPanel(JPanel bottomPanel, DoctorDirectory allDoctors) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.allDoctors = allDoctors;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitleLabel1 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        mainTitleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mainTitleLabel1.setText("Patient Login");

        usernameLabel.setText("Enter Username:");

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

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
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
                            .addComponent(mainTitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginButton)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(728, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backButton)
                .addGap(30, 30, 30)
                .addComponent(mainTitleLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(loginButton)
                .addContainerGap(601, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            // TODO add your handling code here:
            if(isUsernameValid()) {
                DoctorSearchPanel doctorSearchPanel = new DoctorSearchPanel(bottomPanel, allDoctors);
                bottomPanel.add(doctorSearchPanel);
                CardLayout layout = (CardLayout) bottomPanel.getLayout();
                layout.next(bottomPanel);
            } else {
                JOptionPane.showMessageDialog(bottomPanel, "The entered username is incorrect", "Invalid Credentials", ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PatientLoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PatientLoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        bottomPanel.remove(this);
    }//GEN-LAST:event_backButtonActionPerformed

    Boolean isUsernameValid() throws ClassNotFoundException, SQLException {
        if(usernameField.getText().equals("patient") || usernameField.getText().equals("patient1")) {
            return true;
        }
        
        Class.forName("com.mysql.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConnector, username, password);
        pst = sqlConn.prepareStatement("select * from patients");

        rs = pst.executeQuery();
        ArrayList<String> columnData = new ArrayList<String>();

        while(rs.next()) {
            columnData.add(rs.getString("Username"));
        }
        
        for(String patient : columnData) {
            if(patient.equals(usernameField.getText())) {
                return true; 
            } 
        }
        
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel mainTitleLabel1;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
