/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shah's
 */
public class ManageCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersJPanel
     */
    public CustomerDirectory customerDirectory;
    public JPanel container;
    public EcoSystem system;

    public ManageCustomersJPanel(JPanel userProcessContainer, EcoSystem system, CustomerDirectory customerDirectory) {
        initComponents();
        this.system = system;
        this.customerDirectory = customerDirectory;
        this.container = userProcessContainer;
        populateCustomerList();
    }

    public void populateCustomerList() {
        DefaultTableModel model = (DefaultTableModel) jTbaleCustomerData.getModel();

        model.setRowCount(0);
        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            for (Customer customer : customerDirectory.getCustomerDirectory()) {
                if (customer.getCustomerNo().equalsIgnoreCase(ua.getEmployee().getName())) {
                    Object[] row = new Object[7];
                    row[0] = customer.getCustomerNo();
                    row[1] = ua.getUsername();
                    row[2] = customer.getCustomerName();
                    row[3] = customer.getCustomerContactNo();
                    row[4] = customer.getCustomerEmail();
                    row[5] = customer.getCustomerStreet();
                    row[6] = customer.getCustomerZipcode();
                    model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbaleCustomerData = new javax.swing.JTable();
        viewCustomer = new javax.swing.JButton();
        deleteCustomer = new javax.swing.JButton();
        addCustomerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel1.setText("Customer List");

        jTbaleCustomerData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer No", "Username", "Name", "Contact No", "Email", "Address", "Zipcode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbaleCustomerData);

        viewCustomer.setText("View Customer");
        viewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerActionPerformed(evt);
            }
        });

        deleteCustomer.setText("Delete Customer");
        deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerActionPerformed(evt);
            }
        });

        addCustomerBtn.setText("Add Customer");
        addCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addCustomerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteCustomer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addCustomerBtn, backBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerBtn)
                    .addComponent(viewCustomer)
                    .addComponent(deleteCustomer))
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTbaleCustomerData.getSelectedRow();
        int count = jTbaleCustomerData.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                CardLayout layout = (CardLayout) container.getLayout();
                Customer customer = customerDirectory.getCustomerId(selectedRow);
                ViewUpdateCustomersJPanel viewCustomersJPanel = new ViewUpdateCustomersJPanel(system, container, customer, customerDirectory);
                container.add(viewCustomersJPanel);
                layout.next(container);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_viewCustomerActionPerformed

    private void deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTbaleCustomerData.getSelectedRow();
        int count = jTbaleCustomerData.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                int selectionButton = JOptionPane.YES_NO_OPTION;
                int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
                if (selectionResult == JOptionPane.YES_OPTION) {
                    customerDirectory.deleteCustomer(selectedRow, system);
                    populateCustomerList();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteCustomerActionPerformed

    private void addCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        AddCustomerJPanel createCustomersJPanel = new AddCustomerJPanel(container, system, customerDirectory);
        container.add(createCustomersJPanel);
        layout.next(container);
    }//GEN-LAST:event_addCustomerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbaleCustomerData;
    private javax.swing.JButton viewCustomer;
    // End of variables declaration//GEN-END:variables
}
