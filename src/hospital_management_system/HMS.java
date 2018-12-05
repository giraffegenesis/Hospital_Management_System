/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;


import java.io.IOException;
import java.sql.*;


/**
 *
 * @author coolj
 */
public class HMS {

    private static final long serialVersionUID = 1L;
    private static HMS hms;

    private HMS() {

    }

    public static HMS instance() {
        if (hms == null) {

            return (hms = new HMS());
        }
        return hms;

    }

    public int addDoctor(String fName, String lName, String phoneNumber, String image) {
        int id = -1;
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
     *
     * @param doctorId
     * @return
     */
    public ResultSet getDoctor(int doctorId) throws SQLException {
        ResultSet result;
        DoctorConnection dt = new DoctorConnection();
        result = dt.getDoctorResultSet(doctorId);
        return result;
    }
     public ResultSet getPatient(int patientId) throws SQLException {
        ResultSet result;
        PatientConnection pc = new PatientConnection();
        result = pc.getPatientResultSet(patientId);
        return result;
    }

    public boolean updateDoctor(String firstName, String lastName, String phoneNum, String image, int currentUserId) throws SQLException, IOException {
        DoctorConnection dt = new DoctorConnection();
        return dt.update(firstName, lastName, phoneNum, image, currentUserId);
    }

    public String deleteDoctor(int id) {
        DoctorConnection dt = new DoctorConnection();
        boolean result = dt.delete(id);
        if (result == true) {
            return ("" + id);
        }
        return null;
    }

    public String updatePatient(int patientId) {
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

    public String deletePatient(int patientId) {
         PatientConnection pc = new PatientConnection();
        boolean result = pc.delete(patientId);
        if (result == true) {
            return ("" + patientId);
        }
        return null;
    }

    public boolean updatePatient(String firstName, String lastName, String phoneNumber, String primaryCarePhysician, int currentPatientId) throws SQLException, IOException{
        PatientConnection pc = new PatientConnection();
        return pc.update(firstName, lastName, phoneNumber, primaryCarePhysician, currentPatientId);
    }

   

}
