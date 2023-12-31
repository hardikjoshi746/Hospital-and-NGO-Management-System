/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.donorpkg;


import business.EcoSystem;
import business.enterprisepkg.Enterprise;
import business.organizationpkg.Organization;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayush
 */
public class DonorWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    /**
     * Creates new form DonorWorkAreaJPanel
     */
    public DonorWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = organization;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(153,197,85);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageProfile = new javax.swing.JButton();
        donationHistory = new javax.swing.JButton();
        manageEnt = new javax.swing.JLabel();
        viewDonationRequestsBtn = new javax.swing.JButton();
        donateMoneyBtn = new javax.swing.JButton();
        viewProfileBtn = new javax.swing.JButton();

        manageProfile.setText("Create Profile");
        manageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProfileActionPerformed(evt);
            }
        });

        donationHistory.setText("View Donation History");
        donationHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationHistoryActionPerformed(evt);
            }
        });

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Donor Work Area");

        viewDonationRequestsBtn.setText("View Donation Requests");
        viewDonationRequestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDonationRequestsBtnActionPerformed(evt);
            }
        });

        donateMoneyBtn.setText("Donate Money");
        donateMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateMoneyBtnActionPerformed(evt);
            }
        });

        viewProfileBtn.setText("View/Update Profile");
        viewProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(donationHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewDonationRequestsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(donateMoneyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(manageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(manageEnt)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDonationRequestsBtn)
                    .addComponent(manageProfile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donationHistory)
                    .addComponent(viewProfileBtn))
                .addGap(18, 18, 18)
                .addComponent(donateMoneyBtn)
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProfileActionPerformed
        CreateDonorProfileJPanel createDonorProfile = new CreateDonorProfileJPanel(userProcessContainer, userAccount);
        userProcessContainer.add("CreateDonorProfile", createDonorProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProfileActionPerformed

    private void donationHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationHistoryActionPerformed
        if(userAccount.getWorkQueue().getWorkRequestList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Donations Recorded as of now","warning",JOptionPane.WARNING_MESSAGE);
           return;     
        }
        ViewDonationHistory vdh = new ViewDonationHistory(userProcessContainer, userAccount);
        userProcessContainer.add("ViewDonationHistory", vdh);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_donationHistoryActionPerformed

    private void viewDonationRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDonationRequestsBtnActionPerformed
        ViewDonationRequestJPanel viewDonationRequestJPanel = new ViewDonationRequestJPanel(userProcessContainer, userAccount, organization, ecoSystem);
        userProcessContainer.add("ViewDonationRequestJPanel", viewDonationRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDonationRequestsBtnActionPerformed

    private void donateMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateMoneyBtnActionPerformed
       DonationJPanelWorkArea donationJPanelWorkArea = new DonationJPanelWorkArea(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("DonationJPanelWorkArea", donationJPanelWorkArea);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_donateMoneyBtnActionPerformed

    private void viewProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileBtnActionPerformed
     
        ViewMyProfile viewMyProfile = new ViewMyProfile(userProcessContainer, userAccount);
        userProcessContainer.add("ViewMyProfile", viewMyProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donateMoneyBtn;
    private javax.swing.JButton donationHistory;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton manageProfile;
    private javax.swing.JButton viewDonationRequestsBtn;
    private javax.swing.JButton viewProfileBtn;
    // End of variables declaration//GEN-END:variables
}
