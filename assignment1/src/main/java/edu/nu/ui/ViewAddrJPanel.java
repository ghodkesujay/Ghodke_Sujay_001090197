/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.ui;

import edu.nu.content.Address;

/**
 *
 * @author sujayghodke
 */
public class ViewAddrJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAddrJPanel
     */
    
    Address addr;
    public ViewAddrJPanel(Address addr) {
        initComponents();
        this.addr = addr;
        
        displayAddress();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtZip = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        txtStreetAddr = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblTitleAddr = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblStreetAddr = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        txtZip.setEditable(false);
        txtZip.setBackground(new java.awt.Color(204, 204, 204));

        lblCity.setText("City:");

        lblState.setText("State:");

        lblZip.setText("Zip code:");

        txtStreetAddr.setEditable(false);
        txtStreetAddr.setBackground(new java.awt.Color(204, 204, 204));

        txtCity.setEditable(false);
        txtCity.setBackground(new java.awt.Color(204, 204, 204));

        lblTitleAddr.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitleAddr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleAddr.setText("Address Details");

        txtState.setEditable(false);
        txtState.setBackground(new java.awt.Color(204, 204, 204));

        lblStreetAddr.setText("Street Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitleAddr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCity)
                            .addComponent(lblStreetAddr)
                            .addComponent(lblState)
                            .addComponent(lblZip))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStreetAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblTitleAddr)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreetAddr)
                    .addComponent(txtStreetAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(277, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreetAddr;
    private javax.swing.JLabel lblTitleAddr;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetAddr;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    private void displayAddress() {
        txtStreetAddr.setText(addr.getStreet());
        txtCity.setText(addr.getCity());
        txtState.setText(addr.getState());
        txtZip.setText(addr.getZip());
    }
}
