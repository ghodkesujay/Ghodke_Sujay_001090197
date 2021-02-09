/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.ui;

import edu.nu.content.Medical;
import javax.swing.JOptionPane;

/**
 *
 * @author sujayghodke
 */
public class CreateMedJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateMedJPanel
     */
    Medical med;
    public CreateMedJPanel(Medical med) {
        initComponents();
        this.med = med;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAll3 = new javax.swing.JTextField();
        lblAll1 = new javax.swing.JLabel();
        lblAll2 = new javax.swing.JLabel();
        lblAll3 = new javax.swing.JLabel();
        txtRecordNo = new javax.swing.JTextField();
        txtAll1 = new javax.swing.JTextField();
        lblTitleMed = new javax.swing.JLabel();
        txtAll2 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblRecordNo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        txtAll3.setBackground(new java.awt.Color(204, 204, 204));

        lblAll1.setText("Allergy 1:");

        lblAll2.setText("Allergy 2:");

        lblAll3.setText("Allergy 3:");

        txtRecordNo.setBackground(new java.awt.Color(204, 204, 204));

        txtAll1.setBackground(new java.awt.Color(204, 204, 204));

        lblTitleMed.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitleMed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleMed.setText("Enter your medical information below:");

        txtAll2.setBackground(new java.awt.Color(204, 204, 204));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblRecordNo.setText("Record Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleMed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAll1)
                            .addComponent(lblRecordNo)
                            .addComponent(lblAll2)
                            .addComponent(lblAll3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAll3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAll2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAll1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRecordNo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblTitleMed)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecordNo)
                    .addComponent(txtRecordNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAll1)
                    .addComponent(txtAll1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAll2)
                    .addComponent(txtAll2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAll3)
                    .addComponent(txtAll3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        med.setRec_no(txtRecordNo.getText());
        med.setAllergy1(txtAll1.getText());
        med.setAllergy2(txtAll2.getText());
        med.setAllergy3(txtAll3.getText());
        
        JOptionPane.showMessageDialog(this, "Your medical information is saved. \n "
            + "You can now generate the final report.");

    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAll1;
    private javax.swing.JLabel lblAll2;
    private javax.swing.JLabel lblAll3;
    private javax.swing.JLabel lblRecordNo;
    private javax.swing.JLabel lblTitleMed;
    private javax.swing.JTextField txtAll1;
    private javax.swing.JTextField txtAll2;
    private javax.swing.JTextField txtAll3;
    private javax.swing.JTextField txtRecordNo;
    // End of variables declaration//GEN-END:variables
}
