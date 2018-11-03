/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.sql.*;

/**
 *
 * @author AbrarZawed
 */
public class Doctor {
    private String fName;
    private String lName;
    private String phoneNumber;
    private String image;
 

    public Doctor(String fName, String lName, String phoneNumber, String image) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.image = image;

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
