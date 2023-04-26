/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;

/**
 *
 * @author ASUS
 */
public class DoctorLandingPage extends javax.swing.JPanel {

    /**
     * Creates new form CreateEncounterPanel
     */
    public DoctorLandingPage() {
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

        splitPanel = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        createPatientButton = new javax.swing.JButton();
        createEncounterButton = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

        leftPanel.setBackground(new java.awt.Color(255, 153, 153));

        createPatientButton.setText("Create Patient");
        createPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientButtonActionPerformed(evt);
            }
        });

        createEncounterButton.setText("Create Encounter");
        createEncounterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEncounterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createEncounterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createPatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(createPatientButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addComponent(createEncounterButton)
                .addGap(187, 187, 187))
        );

        splitPanel.setLeftComponent(leftPanel);

        rightPanel.setBackground(new java.awt.Color(255, 153, 153));
        rightPanel.setLayout(new java.awt.CardLayout());
        splitPanel.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientButtonActionPerformed
        // TODO add your handling code here:
        CreatePatientPanel createPatientPanel = new CreatePatientPanel();
        rightPanel.add(createPatientPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_createPatientButtonActionPerformed

    private void createEncounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEncounterButtonActionPerformed
        // TODO add your handling code here:
        CreateEncounterPanel createEncounterPanel = new CreateEncounterPanel();
        rightPanel.add(createEncounterPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_createEncounterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createEncounterButton;
    private javax.swing.JButton createPatientButton;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSplitPane splitPanel;
    // End of variables declaration//GEN-END:variables
}
