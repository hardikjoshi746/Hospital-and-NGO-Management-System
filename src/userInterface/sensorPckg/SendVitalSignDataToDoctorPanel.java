/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.sensorPckg;

import business.EcoSystem;
import business.common.Validation;
import business.organizationpkg.DoctorOrganization;
import business.personpkg.HelpNeeded;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.SendDataToDoctorWorkRequest;
import business.workQueuepkg.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayush
 */
public class SendVitalSignDataToDoctorPanel extends javax.swing.JPanel {
      private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private HelpNeeded person;
    private EcoSystem ecoSystem;
    private DoctorOrganization doctorOrganization;
    /**
     * Creates new form SendVitalSignDataToDoctorPanel
     */
    public SendVitalSignDataToDoctorPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecoSystem) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        person = (HelpNeeded)userAccount.getPerson();
        this.ecoSystem = ecoSystem;
         doctorComboBx.removeAllItems();
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

        sendToDoctorGroup = new javax.swing.ButtonGroup();
        sendToDoctorPanel = new javax.swing.JLayeredPane();
        medications = new javax.swing.JLabel();
        sendToDoctNoRadio = new javax.swing.JRadioButton();
        sendToDoctorYesRad = new javax.swing.JRadioButton();
        doctorComboBx = new javax.swing.JComboBox();
        dctrNameLabel = new javax.swing.JLabel();
        sendDataTodctrBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentMedicationsTxtArea = new javax.swing.JTextArea();
        sendDataLabel = new javax.swing.JLabel();
        getAlertFromHH = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        sendToDoctorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        medications.setText("Enter Current Medications:");

        sendToDoctorGroup.add(sendToDoctNoRadio);
        sendToDoctNoRadio.setText("No");
        sendToDoctNoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToDoctNoRadioActionPerformed(evt);
            }
        });

        sendToDoctorGroup.add(sendToDoctorYesRad);
        sendToDoctorYesRad.setText("Yes");
        sendToDoctorYesRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToDoctorYesRadActionPerformed(evt);
            }
        });

        doctorComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dctrNameLabel.setText("Please Select a doctor you wish to send data");

        sendDataTodctrBtn.setText("Send Vital Sign Data to Doctor");
        sendDataTodctrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendDataTodctrBtnActionPerformed(evt);
            }
        });

        currentMedicationsTxtArea.setColumns(20);
        currentMedicationsTxtArea.setRows(5);
        jScrollPane1.setViewportView(currentMedicationsTxtArea);

        sendDataLabel.setText("Do you want to send data to Doctor");

        javax.swing.GroupLayout sendToDoctorPanelLayout = new javax.swing.GroupLayout(sendToDoctorPanel);
        sendToDoctorPanel.setLayout(sendToDoctorPanelLayout);
        sendToDoctorPanelLayout.setHorizontalGroup(
            sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendToDoctorPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sendDataTodctrBtn)
                    .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sendToDoctorPanelLayout.createSequentialGroup()
                            .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sendDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dctrNameLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(doctorComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(sendToDoctorPanelLayout.createSequentialGroup()
                                    .addComponent(sendToDoctorYesRad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sendToDoctNoRadio))))
                        .addGroup(sendToDoctorPanelLayout.createSequentialGroup()
                            .addComponent(medications)
                            .addGap(29, 29, 29)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        sendToDoctorPanelLayout.setVerticalGroup(
            sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendToDoctorPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendDataLabel)
                    .addComponent(sendToDoctorYesRad)
                    .addComponent(sendToDoctNoRadio))
                .addGap(18, 18, 18)
                .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dctrNameLabel)
                    .addComponent(doctorComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(sendToDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medications)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(sendDataTodctrBtn)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        sendToDoctorPanel.setLayer(medications, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(sendToDoctNoRadio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(sendToDoctorYesRad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(doctorComboBx, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(dctrNameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(sendDataTodctrBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        sendToDoctorPanel.setLayer(sendDataLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getAlertFromHH.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        getAlertFromHH.setText("Send Vital Sign Data to Doctor");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(getAlertFromHH, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(sendToDoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(backBtn)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(getAlertFromHH)
                .addGap(35, 35, 35)
                .addComponent(sendToDoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendToDoctNoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToDoctNoRadioActionPerformed
        doctorComboBx.setVisible(false);
        dctrNameLabel.setVisible(false);
        person.setSendDataToDoctor(false);
        medications.setVisible(false);
        currentMedicationsTxtArea.setVisible(false);
        jScrollPane1.setVisible(false);
    }//GEN-LAST:event_sendToDoctNoRadioActionPerformed

    private void sendToDoctorYesRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToDoctorYesRadActionPerformed
        populateDoctorComboBx();
        doctorComboBx.setVisible(true);
        dctrNameLabel.setVisible(true);
        medications.setVisible(true);
        currentMedicationsTxtArea.setVisible(true);
        jScrollPane1.setVisible(true);
        person.setSendDataToDoctor(true);

    }//GEN-LAST:event_sendToDoctorYesRadActionPerformed

    private void sendDataTodctrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendDataTodctrBtnActionPerformed

        try
        {
            if(sendToDoctorGroup.getSelection() == null)
            {
                JOptionPane.showMessageDialog(null, "Please Select a radio button to send vital Sign data to doctor ","warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(sendToDoctorYesRad.isSelected())
            {
                if(doctorComboBx.getSelectedIndex()<0 || currentMedicationsTxtArea.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please Enter data in all fields ","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(currentMedicationsTxtArea.getText().length()>100)
                {
                    JOptionPane.showMessageDialog(null, "Please enter characters less than 100 in medications Field ","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                UserAccount docAccount = (UserAccount) doctorComboBx.getSelectedItem();
                String medicatnTxt = currentMedicationsTxtArea.getText().replaceAll("\n", " ");
                
                SendDataToDoctorWorkRequest sendDataToDoctorWorkRequest = new SendDataToDoctorWorkRequest();
                sendDataToDoctorWorkRequest.setMessage("Vital Sign Data");
                sendDataToDoctorWorkRequest.setSender(userAccount);
                sendDataToDoctorWorkRequest.setStatus("Sent");
                sendDataToDoctorWorkRequest.setMedication(medicatnTxt);
                sendDataToDoctorWorkRequest.setRequestDate(new Date());
                sendDataToDoctorWorkRequest.setReceiver(docAccount);
               
                docAccount.getWorkQueue().getWorkRequestList().add(sendDataToDoctorWorkRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(sendDataToDoctorWorkRequest);
                JOptionPane.showMessageDialog(null, "Data has been sent successfully", "success", JOptionPane.PLAIN_MESSAGE);
                currentMedicationsTxtArea.setText("");
            }
            else if(sendToDoctNoRadio.isSelected())
            {
                person.setSendDataToDoctor(false);
                JOptionPane.showMessageDialog(null, "Thank You, Data will not be shared with doctor", "success", JOptionPane.PLAIN_MESSAGE);

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please Enter valid data in all fields ","warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_sendDataTodctrBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed
    
    public void populateDoctorComboBx()
    {
       try
       {
        doctorComboBx.removeAllItems();
        doctorOrganization =  Validation.getDoctorOrganization(ecoSystem, userAccount);
   //    System.out.println("doctorOrganization"+doctorOrganization.getName());
       if(doctorOrganization!=null)
       {
        if(doctorOrganization.getUserAccountDirectory().getUserAccountList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No doctors exists in our records as of now!","warning", JOptionPane.WARNING_MESSAGE);
         return;    
        }
         doctorComboBx.removeAllItems();
        for(UserAccount userAccount : doctorOrganization.getUserAccountDirectory().getUserAccountList())
        {
        doctorComboBx.addItem(userAccount);
        }   
       }
       }
       catch(NullPointerException npe)
       {
       JOptionPane.showMessageDialog(null, "Dcotor Organization exists in our records as of now!","warning", JOptionPane.WARNING_MESSAGE);
         return;       
       }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea currentMedicationsTxtArea;
    private javax.swing.JLabel dctrNameLabel;
    private javax.swing.JComboBox doctorComboBx;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medications;
    private javax.swing.JLabel sendDataLabel;
    private javax.swing.JButton sendDataTodctrBtn;
    private javax.swing.JRadioButton sendToDoctNoRadio;
    private javax.swing.ButtonGroup sendToDoctorGroup;
    private javax.swing.JLayeredPane sendToDoctorPanel;
    private javax.swing.JRadioButton sendToDoctorYesRad;
    // End of variables declaration//GEN-END:variables
}
