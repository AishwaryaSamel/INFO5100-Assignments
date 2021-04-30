/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import Business.Helper;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sriram
 */
public class ManageAirlinersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersJPanel
     */
    private AirlinerDirectory airDir;
    private JPanel rightPanel;
    private Helper helper;

    public ManageAirlinersJPanel(JPanel rightPanel, AirlinerDirectory airDir, Helper helper) {
        this.rightPanel = rightPanel;
        this.helper = helper;
        this.airDir = airDir;
        initComponents();
        populate();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void populate(){
         
        int rowCount = airlinerTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airlinerTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        DefaultTableModel dtm = (DefaultTableModel)airlinerTable.getModel();
        dtm.setRowCount(0);
        
        for(Airliner a : helper.getAirlinerDirectory().getAirlinerDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getAddress();
            row[2]=a.getOriginCountry();
            row[3]=a.getTotalFlights();
            dtm.addRow(row);
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
        newAirlinerBtn = new javax.swing.JButton();
        viewAirlinerBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        airlinerTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Airliners");

        newAirlinerBtn.setText("Add Airliner");
        newAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAirlinerBtnActionPerformed(evt);
            }
        });

        viewAirlinerBtn.setText("View Airliner");
        viewAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlinerBtnActionPerformed(evt);
            }
        });

        airlinerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Address", "Origin Country", "Total Flights/Day"
            }
        ));
        jScrollPane1.setViewportView(airlinerTable);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(374, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newAirlinerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewAirlinerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(374, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAirlinerBtn)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(viewAirlinerBtn)
                .addContainerGap(267, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAirlinerBtnActionPerformed
        // TODO add your handling code here:
        CardLayout cardlayout = (CardLayout)rightPanel.getLayout();
        CreateNewAirlinerJPanel amPanel = new  CreateNewAirlinerJPanel(rightPanel, airDir);
        rightPanel.add(amPanel);
        cardlayout.next(rightPanel);
    }//GEN-LAST:event_newAirlinerBtnActionPerformed

    private void viewAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlinerBtnActionPerformed
    int SelectedRow = airlinerTable.getSelectedRow();
        if(SelectedRow >= 0)
        {
            Airliner airliner = (Airliner) airlinerTable.getValueAt(SelectedRow, 0);
            ViewAirlinerJPanel viewpanel = new ViewAirlinerJPanel(rightPanel, airliner, airDir);
            CardLayout cardLayout = (CardLayout)rightPanel.getLayout();
            rightPanel.add(viewpanel);
            cardLayout.next(rightPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select an Airline","Alert",JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
        
    }//GEN-LAST:event_viewAirlinerBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = airlinerTable.getSelectedRow();
        if(row<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Airliner p = (Airliner)airlinerTable.getValueAt(row, 0);
        helper.getAirlinerDirectory().removeAirliner(p);
        populate();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airlinerTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newAirlinerBtn;
    private javax.swing.JButton viewAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}
