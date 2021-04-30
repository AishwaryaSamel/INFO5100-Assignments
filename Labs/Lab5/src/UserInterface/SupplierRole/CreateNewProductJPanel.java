package UserInterface.SupplierRole;

import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Supplier supplier;
    public CreateNewProductJPanel(JPanel upc, Supplier s){
        initComponents();
        userProcessContainer = upc;
        supplier = s;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAvailability = new javax.swing.JLabel();
        txtAvailability = new javax.swing.JTextField();
        lblRemarks = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 130, 100, 30));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
        });
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Product Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 180, 110, 30));

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 160, 30));

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add Product");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 30));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 210, -1));

        lblAvailability.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAvailability.setText("Availability:");
        add(lblAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 110, 30));

        txtAvailability.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAvailability.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAvailabilityKeyReleased(evt);
            }
        });
        add(txtAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 160, 30));
        add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 400, 20));
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        Product p = supplier.getProductCatalog().addProduct();
        p.setProdName(txtName.getText());
        p.setAvail(Integer.parseInt(txtAvailability.getText()));
        String stringPrice = txtPrice.getText();
        if(stringPrice.isEmpty()==false){
            int price = Integer.parseInt(stringPrice);
            p.setPrice(price);
        }
        
        JOptionPane.showMessageDialog(null, "Product added!", "Info", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        String PATTERN = "^[a-zA-Z]{1,15}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtName.getText());
        if(!match.matches()){
            lblRemarks.setText("Please enter text for name");   
        }
        else{
            lblRemarks.setText(null); 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
//        String PATTERN = "^[0.0-9.0,.]{1,30}$";
//        Pattern pat = Pattern.compile(PATTERN);
//        Matcher match = pat.matcher(txtPrice.getText());
//        if(!match.matches()){
//            lblRemarks.setText("Please enter digits only for Price");   
//        }
//        else{
//            lblRemarks.setText(null); 
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyReleased

    private void txtAvailabilityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailabilityKeyReleased
        String PATTERN = "^[0-9]{1,30}$";
        Pattern pat = Pattern.compile(PATTERN);
        Matcher match = pat.matcher(txtAvailability.getText());
        if(!match.matches()){
            lblRemarks.setText("Please enter digits only for availability");   
        }
        else{
            lblRemarks.setText(null); 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailabilityKeyReleased

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
