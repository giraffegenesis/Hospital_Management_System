/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author coolj
 */
public class HMS {

    private static final long serialVersionUID = 1L;
    private static HMS hms;
  
    
    private Connection con;
    

    private HMS() {
     
    }

    public static HMS instance() {
        if (hms == null) {

            return (hms = new HMS());
        }
        return hms;

    }

    public int addDoctor(String fName, String lName, String phoneNumber, String image) { // image to blob (see signup.java)
        int id=-1;
        DoctorConnection dt= new DoctorConnection();
        ResultSet rs = dt.add(fName,lName,phoneNumber,image);
        try {
            if(rs.next()){
                id=rs.getInt(1);
            }
        
       } catch (SQLException ex) {
           System.out.println("failure");
       
       }
       return id;
    }
    
    public String getDoctor(int doctorId){
        String result;
        DoctorConnection dt= new DoctorConnection();
        result = dt.getARow(doctorId);
        return result;
    }
    
    public boolean updateDoctor(int doctorId, String fName,String lName,String phoneNumber,String image) {
        DoctorConnection dt= new DoctorConnection();
        return dt.updateRow(doctorId,fName,lName,phoneNumber,image);
    
    }

    public String deleteDoctor(int id) {
        DoctorConnection dt = new DoctorConnection();
        boolean result= dt.delete(id);
        if(result==true){
            return (""+id);
        }
        return null;
    }

    /**
     *
     * public boolean addPatient(String fName, String lName, int phoneNumber,
     * int doctorId) { Connection conn = MysqlCon.getConnection(); try {
     * Statement st = conn.createStatement(); st.executeUpdate("INSERT INTO
     * patient " + "VALUES (" + 13 + ",'" + fName + "','" + lName +
     * "','failure','hater', 'death', 'pa'," + phoneNumber + ",'purple')");
     * conn.close(); return true; } catch (Exception e) {
     * System.err.println("fuck"); e.printStackTrace(); } return false; }
     */

    public String updatePatient(int patientId) {
        return null;
    }

    public String deletePatient(int patientId) {
        return null;
    }

    public String scheduleAppointment(Date date, Time time) {
        return null;
    }

    public String scheduleTest(Date date, Time time) {
        return null;
    }

    public String writePrescription(String name, float dosage, int quantity, String usage) {
        return null;
    }

    public String addEvaluation(String department, Date date, String testType, String notes) {
        return null;
    }
    
    public static void main(String args[]) {
       HMS hms= HMS.instance();
       hms.deleteDoctor(24);
    }

}
