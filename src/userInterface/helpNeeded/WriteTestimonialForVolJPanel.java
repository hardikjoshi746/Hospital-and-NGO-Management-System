/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.helpNeeded;

import business.personpkg.Testimonial;
import business.personpkg.Volunteer;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.NeedHelpWorkRequest;
import business.workQueuepkg.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.volunteer.ViewVolunteerProfile;

/**
 *
 * @author nishi
 */
public class WriteTestimonialForVolJPanel extends javax.swing.JPanel {
       
       private JPanel userProcessContainer;
       private UserAccount userAccount;  
       private Volunteer volunteer;
    
    /**
     * Creates new form WriteTestimonialForVolJPanel
     */
    public WriteTestimonialForVolJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       this.userAccount = userAccount;
    
       populateHelpReqJTable();
        writeTestPanel.setVisible(false);
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
    
    public void populateHelpReqJTable()
    {
      DefaultTableModel dtm = (DefaultTableModel)helpRequestsJTable.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
        {
            if(workRequest.getMessage().equals("Need Help"))
            {
           NeedHelpWorkRequest helpWorkRequest = (NeedHelpWorkRequest)workRequest; 
     
           if(helpWorkRequest.getStatus().equalsIgnoreCase("Completed"))
           {
           Object[] rowData = new Object[5];
           rowData[0] = helpWorkRequest.getRequestId();
           rowData[1] = helpWorkRequest;
           rowData[2] = helpWorkRequest.getRequestDate();
           rowData[3] = helpWorkRequest.getReceiver() == null ? null : workRequest.getReceiver().getUserName() ;
           rowData[4] = helpWorkRequest.getResolveDate();
           
           dtm.addRow(rowData);
           }
           }
        }  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt = new javax.swing.JLabel();
        manageEnt1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        helpRequestsJTable = new javax.swing.JTable();
        writeTestimonialBtn = new javax.swing.JButton();
        writeTestPanel = new javax.swing.JLayeredPane();
        submitTestimnialBtn = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        viewYourProfile = new javax.swing.JLabel();
        helpNameTxtField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        firstName1 = new javax.swing.JLabel();
        serviceTypeTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        testiTxtAreaField = new javax.swing.JTextArea();
        LastName1 = new javax.swing.JLabel();
        viewYourProfile1 = new javax.swing.JLabel();
        LastName2 = new javax.swing.JLabel();
        ViewVolunteerProfileBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Write Testimonial");

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("Unique");

        helpRequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Help Recieved", "Requested Date", "Volunteer Name", "Resolved Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(helpRequestsJTable);

        writeTestimonialBtn.setText("Write Testimonial");
        writeTestimonialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeTestimonialBtnActionPerformed(evt);
            }
        });

        writeTestPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        submitTestimnialBtn.setText("Submit");
        submitTestimnialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTestimnialBtnActionPerformed(evt);
            }
        });

        LastName.setText("Last Name:");

        cancelBtn.setText("Cancel");

        jLabel1.setText("Please enter characters below 500");

        lastNameField.setEditable(false);
        lastNameField.setEnabled(false);

        viewYourProfile.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile.setText("Volunteer Details:");

        helpNameTxtField.setEditable(false);
        helpNameTxtField.setEnabled(false);
        helpNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpNameTxtFieldActionPerformed(evt);
            }
        });

        firstNameField.setEditable(false);
        firstNameField.setEnabled(false);

        firstName.setText("First Name:");

        firstName1.setText("Help Recieved");

        serviceTypeTxtField.setEditable(false);
        serviceTypeTxtField.setEnabled(false);

        testiTxtAreaField.setColumns(20);
        testiTxtAreaField.setRows(5);
        jScrollPane1.setViewportView(testiTxtAreaField);

        LastName1.setText("Help Type:");

        viewYourProfile1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile1.setText("Help Recieved:");

        LastName2.setText("Testimonial");

        writeTestPanel.setLayer(submitTestimnialBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(LastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(cancelBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(lastNameField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(viewYourProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(helpNameTxtField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(firstNameField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(firstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(firstName1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(serviceTypeTxtField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(LastName1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(viewYourProfile1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(LastName2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout writeTestPanelLayout = new javax.swing.GroupLayout(writeTestPanel);
        writeTestPanel.setLayout(writeTestPanelLayout);
        writeTestPanelLayout.setHorizontalGroup(
            writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(writeTestPanelLayout.createSequentialGroup()
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(writeTestPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewYourProfile)
                            .addGroup(writeTestPanelLayout.createSequentialGroup()
                                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastName))
                                .addGap(18, 18, 18)
                                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lastNameField)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(viewYourProfile1)
                            .addGroup(writeTestPanelLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(submitTestimnialBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelBtn))
                            .addGroup(writeTestPanelLayout.createSequentialGroup()
                                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastName1)
                                    .addComponent(firstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastName2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(writeTestPanelLayout.createSequentialGroup()
                                        .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(serviceTypeTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(helpNameTxtField))
                                        .addGap(183, 183, 183))))))
                    .addGroup(writeTestPanelLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        writeTestPanelLayout.setVerticalGroup(
            writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(writeTestPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(viewYourProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(viewYourProfile1)
                .addGap(18, 18, 18)
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName1)
                    .addComponent(helpNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastName1)
                    .addComponent(serviceTypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(writeTestPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(LastName2))
                    .addGroup(writeTestPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitTestimnialBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        ViewVolunteerProfileBtn.setText("View Volunteer Profile");
        ViewVolunteerProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewVolunteerProfileBtnActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(backJButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ViewVolunteerProfileBtn)
                        .addGap(53, 53, 53)
                        .addComponent(writeTestimonialBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(writeTestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(377, 377, 377)
                    .addComponent(manageEnt1)
                    .addContainerGap(666, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(manageEnt)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ViewVolunteerProfileBtn)
                            .addComponent(writeTestimonialBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(writeTestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(manageEnt1)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void writeTestimonialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeTestimonialBtnActionPerformed
        int selectedRow = helpRequestsJTable.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        NeedHelpWorkRequest nhwr = (NeedHelpWorkRequest)helpRequestsJTable.getValueAt(selectedRow, 1);
        if(nhwr.getReceiver()==null)
        {
        JOptionPane.showMessageDialog(this, "Request has not been processed yet", "warning", JOptionPane.PLAIN_MESSAGE);
            return;    
        }
        volunteer = (Volunteer)nhwr.getReceiver().getPerson();
        
        firstNameField.setText(volunteer.getFirstName());
        lastNameField.setText(volunteer.getLastName());
        helpNameTxtField.setText(nhwr.getNeedHelp().getHelp());
        serviceTypeTxtField.setText(nhwr.getNeedHelp().getServiceType());
        writeTestPanel.setVisible(true);
        
    }//GEN-LAST:event_writeTestimonialBtnActionPerformed

    private void helpNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpNameTxtFieldActionPerformed

    private void submitTestimnialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitTestimnialBtnActionPerformed
        
        if(testiTxtAreaField.getText().trim().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Please write few words about volunteer service!", "warning", JOptionPane.PLAIN_MESSAGE);
          return;    
        }
         if(testiTxtAreaField.getText().length()>500)
         {
         JOptionPane.showMessageDialog(this, "Please enter text less than 500 characters", "warning", JOptionPane.PLAIN_MESSAGE);
          return;      
         }
        try
        {
       
        Testimonial testimonial = volunteer.addTestimonial();
        testimonial.setTestimonialTxt(testiTxtAreaField.getText().replaceAll("\n", " "));
       
        DateFormat df = new SimpleDateFormat("EEE, MMM d, YYYY hh:mm aaa");
        Calendar cal = Calendar.getInstance();
        String timestamp = df.format(cal.getTime());
        testimonial.setWriterName(userAccount.getPerson().getName());
        testimonial.setDate(timestamp);
       
        JOptionPane.showMessageDialog(this, "Testimonial has been created Succesfully, Thank You", "success", JOptionPane.PLAIN_MESSAGE);
        testiTxtAreaField.setText("");
        }
        catch(Exception e)
        {
            e.printStackTrace();
          JOptionPane.showMessageDialog(this, "Please enter valid data", "warning", JOptionPane.WARNING_MESSAGE);
          return;       
        }
        
    }//GEN-LAST:event_submitTestimnialBtnActionPerformed

    private void ViewVolunteerProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewVolunteerProfileBtnActionPerformed
         int selectedRow = helpRequestsJTable.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        NeedHelpWorkRequest nhwr = (NeedHelpWorkRequest)helpRequestsJTable.getValueAt(selectedRow, 1);
        if(nhwr.getReceiver() == null)
        {
       JOptionPane.showMessageDialog(this, "Request has not been processed yet", "warning", JOptionPane.PLAIN_MESSAGE);
       return;     
        }
        UserAccount volAccnt = (UserAccount)nhwr.getReceiver();
        
        ViewVolunteerProfile viewVolunteerProfile = new ViewVolunteerProfile(userProcessContainer, volAccnt);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ViewVolunteerProfileBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel LastName1;
    private javax.swing.JLabel LastName2;
    private javax.swing.JButton ViewVolunteerProfileBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel firstName1;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField helpNameTxtField;
    private javax.swing.JTable helpRequestsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JTextField serviceTypeTxtField;
    private javax.swing.JButton submitTestimnialBtn;
    private javax.swing.JTextArea testiTxtAreaField;
    private javax.swing.JLabel viewYourProfile;
    private javax.swing.JLabel viewYourProfile1;
    private javax.swing.JLayeredPane writeTestPanel;
    private javax.swing.JButton writeTestimonialBtn;
    // End of variables declaration//GEN-END:variables
}
