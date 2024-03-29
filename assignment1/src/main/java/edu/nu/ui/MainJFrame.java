/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nu.ui;

import edu.nu.content.Account;
import edu.nu.content.Address;
import edu.nu.content.Demographic;
import edu.nu.content.Driver;
import edu.nu.content.Medical;


/**
 *
 * @author sujayghodke
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    Demographic demo;
    Address addr;
    Account acc;
    Driver driv;
    Medical med;
    
    
    public MainJFrame() {
        initComponents();
        
        demo = new Demographic();
        addr = new Address();
        acc = new Account();
        driv = new Driver();
        med = new Medical();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnCreateDemo = new javax.swing.JButton();
        btnViewDemo = new javax.swing.JButton();
        lblChoose = new javax.swing.JLabel();
        lblDemo = new javax.swing.JLabel();
        lblAddr = new javax.swing.JLabel();
        btnCreateAddr = new javax.swing.JButton();
        btnViewAddr = new javax.swing.JButton();
        lblBankAcc = new javax.swing.JLabel();
        btnCreateAcc = new javax.swing.JButton();
        btnViewAcc = new javax.swing.JButton();
        lblDriver = new javax.swing.JLabel();
        btnCreateDriv = new javax.swing.JButton();
        btnViewDriv = new javax.swing.JButton();
        lblMedical = new javax.swing.JLabel();
        btnCreateMed = new javax.swing.JButton();
        btnViewMed = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setBackground(new java.awt.Color(0, 0, 0));
        splitPane.setDividerSize(1);

        controlPanel.setBackground(new java.awt.Color(0, 102, 153));

        btnCreateDemo.setBackground(new java.awt.Color(153, 153, 153));
        btnCreateDemo.setText("Create");
        btnCreateDemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDemoActionPerformed(evt);
            }
        });

        btnViewDemo.setBackground(new java.awt.Color(153, 153, 153));
        btnViewDemo.setText("View");
        btnViewDemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDemoActionPerformed(evt);
            }
        });

        lblChoose.setForeground(new java.awt.Color(204, 204, 204));
        lblChoose.setText("Choose category of information");

        lblDemo.setForeground(new java.awt.Color(204, 204, 204));
        lblDemo.setText("Demographic");

        lblAddr.setForeground(new java.awt.Color(204, 204, 204));
        lblAddr.setText("Address");

        btnCreateAddr.setBackground(new java.awt.Color(153, 153, 153));
        btnCreateAddr.setText("Create");
        btnCreateAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAddrActionPerformed(evt);
            }
        });

        btnViewAddr.setBackground(new java.awt.Color(153, 153, 153));
        btnViewAddr.setText("View");
        btnViewAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAddrActionPerformed(evt);
            }
        });

        lblBankAcc.setForeground(new java.awt.Color(204, 204, 204));
        lblBankAcc.setText("Bank Account");

        btnCreateAcc.setBackground(new java.awt.Color(153, 153, 153));
        btnCreateAcc.setText("Create");
        btnCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccActionPerformed(evt);
            }
        });

        btnViewAcc.setBackground(new java.awt.Color(153, 153, 153));
        btnViewAcc.setText("View");
        btnViewAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAccActionPerformed(evt);
            }
        });

        lblDriver.setForeground(new java.awt.Color(204, 204, 204));
        lblDriver.setText("Driver's License");

        btnCreateDriv.setBackground(new java.awt.Color(153, 153, 153));
        btnCreateDriv.setText("Create");
        btnCreateDriv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDrivActionPerformed(evt);
            }
        });

        btnViewDriv.setBackground(new java.awt.Color(153, 153, 153));
        btnViewDriv.setText("View");
        btnViewDriv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDrivActionPerformed(evt);
            }
        });

        lblMedical.setForeground(new java.awt.Color(204, 204, 204));
        lblMedical.setText("Medical Records");

        btnCreateMed.setBackground(new java.awt.Color(153, 153, 153));
        btnCreateMed.setText("Create");
        btnCreateMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMedActionPerformed(evt);
            }
        });

        btnViewMed.setBackground(new java.awt.Color(153, 153, 153));
        btnViewMed.setText("View");
        btnViewMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMedActionPerformed(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(153, 153, 153));
        btnReport.setText("Generate Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addComponent(lblMedical)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreateMed, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewMed, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addComponent(lblDriver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreateDriv, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewDriv, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addComponent(lblBankAcc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addComponent(lblAddr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreateAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addComponent(lblDemo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreateDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateDemo, btnViewDemo});

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateAddr, btnViewAddr});

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateAcc, btnViewAcc});

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateDriv, btnViewDriv});

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateMed, btnViewMed});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewDemo))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblDemo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(btnCreateAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewAddr))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblAddr)))
                .addGap(18, 18, 18)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(btnCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewAcc))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblBankAcc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(btnCreateDriv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewDriv))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblDriver)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(btnCreateMed, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewMed))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblMedical)))
                .addGap(26, 26, 26)
                .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateDemo, btnViewDemo});

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateAddr, btnViewAddr});

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateAcc, btnViewAcc});

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateDriv, btnViewDriv});

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateMed, btnViewMed});

        splitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Personal Information Manager");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Welcome!");

        jLabel4.setText("This application will");

        jLabel5.setText("1. Help you store and manage your personal information.");

        jLabel6.setText("2. Show individual categories of information.");

        jLabel7.setText("3. Generate report of all of your stored information.");

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(205, 205, 205))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(76, 76, 76)))))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDemoActionPerformed
        // TODO add your handling code here:
        CreateDemoJPanel createDemo = new CreateDemoJPanel(demo);
        splitPane.setRightComponent(createDemo);
        
    }//GEN-LAST:event_btnCreateDemoActionPerformed

    private void btnViewDemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDemoActionPerformed
        // TODO add your handling code here:
        ViewDemoJPanel viewDemo = new ViewDemoJPanel(demo);
        splitPane.setRightComponent(viewDemo);
    }//GEN-LAST:event_btnViewDemoActionPerformed

    private void btnCreateAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAddrActionPerformed
        // TODO add your handling code here:
        CreateAddrJPanel createAddr = new CreateAddrJPanel(addr);
        splitPane.setRightComponent(createAddr);
    }//GEN-LAST:event_btnCreateAddrActionPerformed

    private void btnViewAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAddrActionPerformed
        // TODO add your handling code here:
        ViewAddrJPanel viewAddr = new ViewAddrJPanel(addr);
        splitPane.setRightComponent(viewAddr);
    }//GEN-LAST:event_btnViewAddrActionPerformed

    private void btnCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccActionPerformed
        // TODO add your handling code here:
        CreateAccJPanel createAcc = new CreateAccJPanel(acc);
        splitPane.setRightComponent(createAcc);    
    }//GEN-LAST:event_btnCreateAccActionPerformed

    private void btnViewAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAccActionPerformed
        // TODO add your handling code here:
        ViewAccJPanel viewAcc = new ViewAccJPanel(acc);
        splitPane.setRightComponent(viewAcc);
    }//GEN-LAST:event_btnViewAccActionPerformed

    private void btnCreateDrivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDrivActionPerformed
        // TODO add your handling code here:
        CreateDrivJPanel createDriv = new CreateDrivJPanel(driv);
        splitPane.setRightComponent(createDriv);
    }//GEN-LAST:event_btnCreateDrivActionPerformed

    private void btnViewDrivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDrivActionPerformed
        // TODO add your handling code here:
        ViewDrivJPanel viewDriv = new ViewDrivJPanel(driv);
        splitPane.setRightComponent(viewDriv);
    }//GEN-LAST:event_btnViewDrivActionPerformed

    private void btnCreateMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMedActionPerformed
        // TODO add your handling code here:
        CreateMedJPanel createMed = new CreateMedJPanel(med);
        splitPane.setRightComponent(createMed);
    }//GEN-LAST:event_btnCreateMedActionPerformed

    private void btnViewMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMedActionPerformed
        // TODO add your handling code here:
        ViewMedJPanel viewMed = new ViewMedJPanel(med);
        splitPane.setRightComponent(viewMed);
    }//GEN-LAST:event_btnViewMedActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        ViewReportJPanel viewReport = new ViewReportJPanel(demo, addr, acc, driv, med);
        splitPane.setRightComponent(viewReport);
    }//GEN-LAST:event_btnReportActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAcc;
    private javax.swing.JButton btnCreateAddr;
    private javax.swing.JButton btnCreateDemo;
    private javax.swing.JButton btnCreateDriv;
    private javax.swing.JButton btnCreateMed;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnViewAcc;
    private javax.swing.JButton btnViewAddr;
    private javax.swing.JButton btnViewDemo;
    private javax.swing.JButton btnViewDriv;
    private javax.swing.JButton btnViewMed;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddr;
    private javax.swing.JLabel lblBankAcc;
    private javax.swing.JLabel lblChoose;
    private javax.swing.JLabel lblDemo;
    private javax.swing.JLabel lblDriver;
    private javax.swing.JLabel lblMedical;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
