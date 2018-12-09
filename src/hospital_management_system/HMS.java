
package hospital_management_system;

import java.io.IOException;
import java.sql.*;


/**
 * Class that starts the Hospital Management System
 * @author AbrarZawed
 * Date Created: 10th September, 2018 
 * Last Modified: 6th December, 2018
 */
public class HMS {

    // private static varibales
    private static final long serialVersionUID = 1L;
    private static HMS hms;

    /**
     * Private constructor for Singleton pattern
     */
    private HMS() {

    }
    /**
     * Public constructor for Singleton pattern
     * Ensures that there is only one instance of the HMS
     */
    public static HMS instance() {
        if (hms == null) {

            return (hms = new HMS());
        }
        return hms;

    }

    /**
     * Method that adds a doctor information to the DB using Connection class
     * @param fName: First Name
     * @param lName: Last Name
     * @param phoneNumber: Phone Number
     * @param image: Image
     * @return integer value >=1, otherwise returns -1
     */
    public int addDoctor(String fName, String lName, String phoneNumber, String image) {
        int id = -1;
        if(image==null){
            return id;
        }
        DoctorConnection dt = new DoctorConnection();
        ResultSet rs = dt.add(fName, lName, phoneNumber, image);
        
        try {
            if (rs.next()) {
                id = rs.getInt(1);
            }

        } catch (SQLException ex) {
            System.out.println("failure");

        }
        return id;
    }

    /**
     * Method that Returns a resultSet from the DB
     * @param doctorId: Id
     * @return
     */
    public ResultSet getDoctor(int doctorId) throws SQLException {
        ResultSet result;
        DoctorConnection dt = new DoctorConnection();
        result = dt.getDoctorResultSet(doctorId);
        return result;
    }
    /**
     * Method that Returns a resultSet from the DB
     * @param patientId
     * @return
     * @throws SQLException 
     */
     public ResultSet getPatient(int patientId) throws SQLException {
        ResultSet result;
        PatientConnection pc = new PatientConnection();
        result = pc.getPatientResultSet(patientId);
        return result;
    }

     /**
      * Method that returns confirmation that doctor information is updated.
      * @param firstName
      * @param lastName
      * @param phoneNum
      * @param image
      * @param currentUserId
      * @return
      * @throws SQLException
      * @throws IOException 
      */
    public boolean updateDoctor(String firstName, String lastName, String phoneNum, String image, int currentUserId) throws SQLException, IOException {
        DoctorConnection dt = new DoctorConnection();
        return dt.update(firstName, lastName, phoneNum, image, currentUserId);
    }

    /**
     * Method that deletes a doctor information from the system
     * @param id
     * @return 
     */
    public String deleteDoctor(int id) {
        DoctorConnection dt = new DoctorConnection();
        boolean result = dt.delete(id);
        if (result == true) {
            return ("" + id);
        }
        return null;
    }

    /**
     * Method that adds a patient information to the DB
     * @param firstName
     * @param lastName
     * @param phoneNum
     * @param primaryCarePhysicianId
     * @return 
     */
    public int addPatient(String firstName, String lastName, String phoneNum, String primaryCarePhysicianId) {
        int id = -1;
        PatientConnection pc = new PatientConnection();
        ResultSet rs = pc.add(firstName, lastName, phoneNum, primaryCarePhysicianId);
        try {
            if (rs.next()) {
                id = rs.getInt(1);
            }

        } catch (SQLException ex) {
            System.out.println("failure");

        }
        return id;
    }

    /**
     * Method that deletes a patient information from the DB
     * @param patientId
     * @return 
     */
    public String deletePatient(int patientId) {
         PatientConnection pc = new PatientConnection();
        boolean result = pc.delete(patientId);
        if (result == true) {
            return ("" + patientId);
        }
        return null;
    }

    /**
     * Method that updates a patient's information to the DB
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param primaryCarePhysician
     * @param currentPatientId
     * @return
     * @throws SQLException
     * @throws IOException 
     */
    public boolean updatePatient(String firstName, String lastName, String phoneNumber, String primaryCarePhysician, int currentPatientId) throws SQLException, IOException{
        PatientConnection pc = new PatientConnection();
        return pc.update(firstName, lastName, phoneNumber, primaryCarePhysician, currentPatientId);
    }

    /**
     * Method that returns a ResultSet with Administrator's keyword and password
     * @param keyword
     * @param password
     * @return
     * @throws SQLException 
     */
    public boolean getAdminVerification(String keyword, String password) throws SQLException {
        boolean result;
        AdminConnection ac = new AdminConnection();
        result = ac.verifyAdmin(keyword,password);
                 
        return result;
    }

   

}
