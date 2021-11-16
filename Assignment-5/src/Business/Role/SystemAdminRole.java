/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.RestaurantDirectory;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, CustomerDirectory CustomerDirectory, DeliveryManDirectory deliveryManDirectory, RestaurantDirectory restaurantDirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system, CustomerDirectory, deliveryManDirectory, restaurantDirectory);
    }
    
}