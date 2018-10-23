/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;


// FACADE
import javax.swing.JFrame;

/**
 *
 * @author general
 */
public class HospitalManagementSystem {
    
    
    
public void adminLogin(){
    AdminLogin adminLogin = new AdminLogin();  //facade -> AdminLogin
    adminLogin.setVisible(true);
    adminLogin.pack();
    adminLogin.setLocationRelativeTo(null);
    adminLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}   

    
    
    
}
