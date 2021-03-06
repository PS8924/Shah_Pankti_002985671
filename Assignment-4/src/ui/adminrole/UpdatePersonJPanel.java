/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.adminrole;

import java.awt.CardLayout;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Shah's
 */
public class UpdatePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePersonJPanel
     */
    private JPanel userProcessContainer;
    private Person person;
    private PersonDirectory personDirectory;
    public UpdatePersonJPanel(JPanel userProcessContainer,Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person=person;
        this.personDirectory=personDirectory;
        populatePersonDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcomboCity = new javax.swing.JComboBox<>();
        lblAge = new javax.swing.JLabel();
        jcomboCommunity = new javax.swing.JComboBox<>();
        lblCity = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        lblHouse = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        lblZipcode = new javax.swing.JLabel();
        btnUpdatePersonSubmit = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBackUpdatePerson = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();

        jcomboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston" }));

        lblAge.setText("Age:");

        jcomboCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Huntington Avenue", "Long wood", "City View" }));

        lblCity.setText("City:");

        lblCommunity.setText("Community:");

        lblHouse.setText("House:");

        lblZipcode.setText("Zipcode:");

        btnUpdatePersonSubmit.setText("Submit");
        btnUpdatePersonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonSubmitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Person Details");

        btnBackUpdatePerson.setText("<< Back");
        btnBackUpdatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUpdatePersonActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnBackUpdatePerson))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName)
                            .addComponent(lblAge)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHouse)
                            .addComponent(lblZipcode)
                            .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(jcomboCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcomboCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHouse)
                            .addComponent(txtZipcode)
                            .addComponent(txtAge)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btnUpdatePersonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBackUpdatePerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity)
                    .addComponent(jcomboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunity)
                    .addComponent(jcomboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHouse)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZipcode)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnUpdatePersonSubmit)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackUpdatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUpdatePersonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackUpdatePersonActionPerformed

    private void populatePersonDetails() {
        txtName.setText(person.getPersonName());
        txtAge.setText(person.getAge().toString());
        txtHouse.setText(person.getHouse().toString());
        txtZipcode.setText(person.getZipcode().toString());
        jcomboCommunity.setSelectedItem(person.getCommunity());
    }
    
    private void btnUpdatePersonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonSubmitActionPerformed
        // TODO add your handling code here:
//        String personName = txtName.getText();
//        Integer age = Integer.parseInt(txtAge.getText());
//        String city = jcomboCity.getSelectedItem().toString();
//        String community = jcomboCommunity.getSelectedItem().toString();
//        Integer house = Integer.parseInt(txtHouse.getText());
//        Integer zipcode = Integer.parseInt(txtZipcode.getText());
//        
//        person.setPersonName(personName);
//        person.setAge(age);
//        person.setCity(city);
//        person.setCommunity(community);
//        person.setHouse(house);
//        person.setZipcode(zipcode);
//       
//        JOptionPane.showMessageDialog(this,"Person data updated!!");
//        
//        clearField();
//        
        
                String personName = txtName.getText();
//        Integer age = Integer.parseInt(txtAge.getText());
        String city = jcomboCity.getSelectedItem().toString();
        String community = jcomboCommunity.getSelectedItem().toString();
//        Integer house = Integer.parseInt(txtHouse.getText());
//        Integer zipcode = Integer.parseInt(txtZipcode.getText());
        
        //regex pattern for a valid Person name
        String carname_pattern = "^[a-zA-Z]{0,30}+";
        Pattern exp = Pattern.compile(carname_pattern);
        
        //regex pattern for a valid serial number
        String serialnum_pattern = "^[1-9]{2}+";
        Pattern exp1 = Pattern.compile(serialnum_pattern);
        
        //regex pattern for a valid zipcode number
        String zipcode_pattern = "^[0-9]{5}+";
        Pattern exp2 = Pattern.compile(zipcode_pattern);
        
        if(personName.isEmpty() || txtAge.getText().isEmpty() || city.isEmpty() || 
            community.isEmpty() ||  txtHouse.getText().isEmpty() || txtZipcode.getText().isEmpty() ){
                JOptionPane.showMessageDialog(this,"All Fields are required!");
        }else{
            Matcher match = exp.matcher(personName);
            if(!match.matches()){
               JOptionPane.showMessageDialog(this,"Name is Incorrect!!");
            }else{
               Matcher match1 = exp1.matcher(txtAge.getText()); 
               if(!match1.matches()){
                    JOptionPane.showMessageDialog(this,"Age is Incorrect!!");
               }else{
                   Matcher match2 = exp1.matcher(txtHouse.getText());
                   if(!match2.matches()){
                        JOptionPane.showMessageDialog(this,"House Number is Incorrect!!");
                   }else{
                      Matcher match3 = exp2.matcher(txtZipcode.getText()); 
                      if(!match3.matches()){
                        JOptionPane.showMessageDialog(this,"Zipcode Number is Incorrect!!");
                      }else{
                        person.setPersonName(personName);
                        //person.setAge(age);
                        person.setCity(city);
                        person.setCommunity(community);
                        //person.setHouse(house);
                        //person.setZipcode(zipcode);
                        //person.setPatientID(count);
                        try{
                            person.setAge(Integer.parseInt(txtAge.getText()));
                            person.setHouse(Integer.parseInt(txtHouse.getText()));
                            person.setZipcode(Integer.parseInt(txtZipcode.getText()));
                        }catch(NumberFormatException e){// handle your exception
                            e.printStackTrace();
                        }
                        JOptionPane.showMessageDialog(this,"Person Data Updated!!");
        
                        clearField();
                      }
                   } 
               }
            }
        }
    }//GEN-LAST:event_btnUpdatePersonSubmitActionPerformed

    private void clearField()
    {
        txtName.setText("");
        txtAge.setText("");
        txtHouse.setText("");
        txtZipcode.setText("");
        jcomboCity.setSelectedItem("Boston");
        jcomboCommunity.setSelectedItem("Huntington Avenue");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackUpdatePerson;
    private javax.swing.JButton btnUpdatePersonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jcomboCity;
    private javax.swing.JComboBox<String> jcomboCommunity;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
