/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.sql.*;

/**
 *
 * @author coolj
 */
public class Doctor {

    String fName;
    String lName;
    int phoneNumber;
    String image;

    public Doctor(String fName, String lName, int phoneNumber, String image) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.image = image;

    }
}
