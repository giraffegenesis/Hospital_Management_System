/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source_code;

import hospital_management_system.HMS;
import hospital_management_system.MyConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Doctor {
    private String fName;
    private String lName;
    private String phoneNumber;
    private String image;
    private Integer doctorId;
    private Connection con;
 

    public Doctor(String fName, String lName, String phoneNumber, String image) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.image = image;
        DoctorTable dt= new DoctorTable();
        ResultSet rs = dt.add(fName,lName,phoneNumber,image);
        try {
            if(rs.next()){
                setDoctorId(rs.getInt(1));
            }
            /*con = MyConnection.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            try {
            ps = con.prepareStatement("INSERT INTO `doctor`(`fName`, `lName`, `phoneNumber`, `pic`) VALUES (?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            // Sets the designated parameter to the given Java String value
            ps.setString(1, fName);
            ps.setString(2, lName);
            ps.setString(3, phoneNumber);

            InputStream img = new FileInputStream(new File(image)); // string to blob
            ps.setBlob(4, img);

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            
            if (rs.next()){
            setDoctorId(rs.getInt(1));
            }
            
            con.close();
            System.exit(0);
            //setDoctorId(temp);
            }catch (Exception ex) {
            Logger.getLogger(HMS.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        } catch (SQLException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
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

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    
    public void removeDoctor(int doctorId){
    /*    DoctorTable dt= new DoctorTable();
        if(dt.delete(doctorId)){
            System.out.println("We did it");
        }*/
    }
}
