/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Customer.CustomerDirectory;
import Business.Restaurant.RestaurantDirectory;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, RestaurantDirectory restaurantDirectory) {
        return new AdminWorkAreaJPanel(userProcessContainer);
    }
}