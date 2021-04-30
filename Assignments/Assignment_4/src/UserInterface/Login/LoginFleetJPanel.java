/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Login;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Fleet.Fleet;
import UserInterface.Flight.ManageFlightsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rishab
 */
public class LoginFleetJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginFleetJPanel
     */
    AirlinerDirectory airDir;
    JPanel rightPanel;
    
    public LoginFleetJPanel(JPanel rightPanel, AirlinerDirectory airDir) {
        this.rightPanel = rightPanel;
        this.airDir = airDir;
        initComponents();
        populateAirlinerComboBox();
    }

    public void populateAirlinerComboBox()
    {
       airlinerComboBox.removeAllItems();
       for(Airliner a : airDir.getAirlinerDirectory())
       {
           airlinerComboBox.addItem(a);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        airlinerComboBox = new javax.swing.JComboBox();
        goBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add your Flights");

        jLabel2.setText("Select Airliner:");

        airlinerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        goBtn.setText("Next");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goBtn)
                    .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(airlinerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(goBtn)
                .addContainerGap(378, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        // TODO add your handling code here:
        Airliner airliner = (Airliner) airlinerComboBox.getSelectedItem();
        CardLayout cardlayout = (CardLayout)rightPanel.getLayout();
        ManageFlightsJPanel manageFlightsPanel = new ManageFlightsJPanel(rightPanel, airliner);
        rightPanel.add("ManageFlightsJPanel",manageFlightsPanel);
        cardlayout.next(rightPanel);
    }//GEN-LAST:event_goBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinerComboBox;
    private javax.swing.JButton goBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
