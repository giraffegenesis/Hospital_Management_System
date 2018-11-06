/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import source_code.Doctor;
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
    private static DoctorList doc;
    
    private Connection con;
    

    private HMS() {
        doc= DoctorList.instance();
    }

    public static HMS instance() {
        if (hms == null) {

            return (hms = new HMS());
        }
        return hms;

    }

    public Doctor addDoctor(String fName, String lName, String phoneNumber, String image) { // image to blob (see signup.java)
        Doctor doctor = new Doctor(fName, lName, phoneNumber, image);
        doc.add(doctor.getDoctorId(), doctor);
        // CREATE CONNECTION HERE.......
       /* con = MyConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = con.prepareStatement("INSERT INTO `doctor`(`fName`, `lName`, `phoneNumber`, `pic`) VALUES (?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            // Sets the designated parameter to the given Java String value
            ps.setString(1, doctor.getfName());
            ps.setString(2, doctor.getlName());
            ps.setString(3, doctor.getPhoneNumber());

            InputStream img = new FileInputStream(new File(doctor.getImage())); // string to blob
            ps.setBlob(4, img);

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Action Failed");
               System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "The new doctor id is: " + rs.getInt(1));
            System.exit(0);

        } catch (Exception ex) {
            Logger.getLogger(HMS.class.getName()).log(Level.SEVERE, null, ex);
        }

        return doctor; */
       System.out.println(doctor);
       Iterator it= doc.getIterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
       return doctor;
    }

    public String updateDoctor(int doctorId) {
        return null;
    }

    public String deleteDoctor(int id) {
        
       /* Doctor doctor;
        doctor = (Doctor)doc.remove(id);
        doctor.removeDoctor(id);
        */return null;
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
