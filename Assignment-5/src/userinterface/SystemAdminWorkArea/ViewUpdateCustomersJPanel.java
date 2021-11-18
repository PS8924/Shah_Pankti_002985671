/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Shah's
 */
public class ViewUpdateCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdateCustomersJPanel
     */
    public CustomerDirectory customerDirectory;
    public JPanel container;
    public Customer customer;
    private final EcoSystem system;

    public ViewUpdateCustomersJPanel(EcoSystem system, JPanel container, Customer customer, CustomerDirectory customerDirectory) {
        initComponents();
        this.customerDirectory = customerDirectory;
        this.container = container;
        this.customer = customer;
        this.system = system;

        txtCustomerNo.setText(customer.getCustomerNo());
        txtFullName.setText(customer.getCustomerName());
        txtMobileNo.setText(customer.getCustomerContactNo());
        txtStreetAddress.setText(customer.getCustomerStreet());
        txtZipcode.setText(customer.getCustomerZipcode());
        txtEmail.setText(customer.getCustomerEmail());
        setEdititableFalse();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUpdateCustomer = new javax.swing.JLabel();
        lblCustomerNo = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblMobileNo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        txtZipcode = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnEditCustomer = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        lblZipcode = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtCustomerNo = new javax.swing.JTextField();
        lblStreetAddress = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        lblUpdateCustomer.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblUpdateCustomer.setText("Update Customer");

        lblCustomerNo.setText("Customer No:");

        lblFullName.setText("Full Name:");

        lblMobileNo.setText("Mobile No:");

        txtZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipcodeActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEditCustomer.setText("Update Customer");
        btnEditCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCustomerActionPerformed(evt);
            }
        });

        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        lblZipcode.setText("Zipcode:");

        lblEmail.setText("Email:");

        lblStreetAddress.setText("Street Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerNo)
                            .addComponent(lblMobileNo)
                            .addComponent(lblStreetAddress)
                            .addComponent(btnBack))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(btnEditCustomer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(btnSaveChanges))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMobileNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtCustomerNo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStreetAddress))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblZipcode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFullName)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(lblUpdateCustomer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblUpdateCustomer)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerNo)
                    .addComponent(txtCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullName)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMobileNo)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreetAddress)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipcode)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnEditCustomer)
                    .addComponent(btnSaveChanges))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCustomerActionPerformed
        // TODO add your handling code here:
        txtEmail.setEditable(true);
        txtFullName.setEditable(true);
        txtMobileNo.setEditable(true);
        txtStreetAddress.setEditable(true);
        txtZipcode.setEditable(true);
    }//GEN-LAST:event_btnEditCustomerActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        String id = txtCustomerNo.getText();
        String name = txtFullName.getText();
        String phone = txtMobileNo.getText();
        String street = txtStreetAddress.getText();
        String zipcode = txtZipcode.getText();
        String email = txtEmail.getText();
        
        if (name.isEmpty() || phone.isEmpty() || street.isEmpty() | zipcode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        } else if (!system.checkValidPhoneFormat(phone)) {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        } else if (!system.checkValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "Email format incorrect!");
        }  else {
            customerDirectory.updateCustomer(id, name, phone, street, zipcode,email);
            JOptionPane.showMessageDialog(null, "Customer details updated!");
            setEdititableFalse();
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed
    public void setEdititableFalse(){
        txtCustomerNo.setEditable(false);
        txtEmail.setEditable(false);
        txtFullName.setEditable(false);
        txtMobileNo.setEditable(false);
        txtStreetAddress.setEditable(false);
        txtZipcode.setEditable(false);
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageCustomersJPanel manageCustomersJPanel = (ManageCustomersJPanel) component;
        manageCustomersJPanel.populateCustomerList();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipcodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditCustomer;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel lblCustomerNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblUpdateCustomer;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JTextField txtCustomerNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
