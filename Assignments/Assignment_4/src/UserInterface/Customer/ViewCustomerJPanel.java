/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aishwarya
 */
public class ViewCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomerJPanel
     */
    JPanel rightPanel;
    CustomerDirectory cusDir;
    Customer customer;
    
    public ViewCustomerJPanel(JPanel rightPanel, Customer customer, CustomerDirectory cusDir) {
        this.rightPanel = rightPanel;
        this.cusDir = cusDir;
        this.customer = customer;
        initComponents();
        customerIDTextField.setText(customer.getCustomerID());
        customerNameTextField.setText(customer.getCustomerName());
        customerAddressTextField.setText(customer.getCustomerAddress());
        idTypeTextField.setText(customer.getIdType());
        mobileNumberTextField.setText(String.valueOf(customer.getMobileNumber()));
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
        backBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        customerAddressTextField = new javax.swing.JTextField();
        idTypeTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customerIDTextField = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        customerNameTextField = new javax.swing.JTextField();
        mobileNumberTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();

        setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Details");

        backBtn.setText("<  Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Customer ID:");

        customerAddressTextField.setEnabled(false);

        idTypeTextField.setEnabled(false);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Mobile Numer:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Customer Name:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Address:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ID Type:");

        customerIDTextField.setEnabled(false);
        customerIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDTextFieldActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        customerNameTextField.setEnabled(false);

        mobileNumberTextField.setEnabled(false);

        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(551, 551, 551)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(updateBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customerIDTextField)
                            .addComponent(customerNameTextField)
                            .addComponent(customerAddressTextField)
                            .addComponent(idTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileNumberTextField))))
                .addContainerGap(457, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(backBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(customerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(customerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(idTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBtn)
                            .addComponent(saveBtn))))
                .addContainerGap(273, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout cardLayout = (CardLayout)rightPanel.getLayout();
        cardLayout.previous(rightPanel);

        Component[] components = rightPanel.getComponents();
        for(Component c: components)
        {
            if(c instanceof ManageCustomerJPanel){
                ManageCustomerJPanel m = (ManageCustomerJPanel)c;
                m.populate();
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void customerIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDTextFieldActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
       customerAddressTextField.setEnabled(true);
       customerAddressTextField.setEnabled(true);
       idTypeTextField.setEnabled(true);
       customerNameTextField.setEnabled(true);
       mobileNumberTextField.setEnabled(true);
       updateBtn.setEnabled(false);
       saveBtn.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        if(customerIDTextField.getText().isEmpty() || customerAddressTextField.getText().isEmpty() || idTypeTextField.getText().isEmpty() || customerNameTextField.getText().isEmpty() || mobileNumberTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Field(s) cannot be Empty.","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }

        try{
            Integer.parseInt(mobileNumberTextField.getText());
            //Integer.parseInt(customerIDTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Invalid Mobile Number.","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            Integer.parseInt(customerIDTextField.getText());
            //Integer.parseInt(customerIDTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Invalid Customer ID","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }

        customer.setCustomerName(customerNameTextField.getText());
        customer.setCustomerAddress(customerAddressTextField.getText());
        customer.setCustomerID(customerIDTextField.getText());
        customer.setMobileNumber(Integer.parseInt(mobileNumberTextField.getText()));
        customer.setIdType(idTypeTextField.getText());
        JOptionPane.showMessageDialog(this,"Customer updated sucessfully!!","SUCESS",JOptionPane.INFORMATION_MESSAGE);
       
        customerAddressTextField.setEnabled(false);
       customerAddressTextField.setEnabled(false);
       idTypeTextField.setEnabled(false);
       customerNameTextField.setEnabled(false);
       mobileNumberTextField.setEnabled(false);
       updateBtn.setEnabled(true);
       saveBtn.setEnabled(false);
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField customerAddressTextField;
    private javax.swing.JTextField customerIDTextField;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JTextField idTypeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mobileNumberTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
