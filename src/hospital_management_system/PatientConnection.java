/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;



import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author general
 */
public class PatientConnection  {

    private Connection con;

    public PatientConnection() {
    }

    public ResultSet add(String fName, String lName, String phoneNumber, String primaryCarePhysician) {
        con = MyConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement("INSERT INTO `patient`(`fName`, `lName`, `phoneNumber`, `primaryCarePhysician`) VALUES (?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            // Sets the designated parameter to the given Java String value
            ps.setString(1, fName);
            ps.setString(2, lName);
            ps.setString(3, phoneNumber);
            ps.setString(4, primaryCarePhysician);

            ps.executeUpdate();
            return rs = ps.getGeneratedKeys();

        } catch (Exception ex) {
            Logger.getLogger(HMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean delete(int patientId) {
          con = MyConnection.getConnection();
        try {

            String query = "DELETE FROM `patient` WHERE `patientId`=?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, patientId);

            if (preparedStmt.executeUpdate() != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Failed");
    }

    public ResultSet getPatientResultSet(int patientId) throws SQLException {
        con = MyConnection.getConnection();
        PreparedStatement ps;

        ps = con.prepareStatement("SELECT `fName`,`lName`,`phoneNumber`,`primaryCarePhysician` FROM `patient` WHERE `patientId`=?");
        ps.setInt(1, patientId);

        return ps.executeQuery();
    }

    public boolean update(String firstName, String lastName, String phoneNumber, String primaryCarePhysician, int currentPatientId) throws SQLException, IOException {
        con = MyConnection.getConnection();
        PreparedStatement ps;
        String updateQuery = "";
        
        updateQuery = "UPDATE `patient` SET `fName`=?,`lName`=?,`phoneNumber`=?,`primaryCarePhysician`=? WHERE `patientId`=?";

            ps = con.prepareStatement(updateQuery);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, phoneNumber);
            ps.setString(4, primaryCarePhysician);
            ps.setInt(5,currentPatientId);

            if (ps.executeUpdate() != 0) {
                return true;
            } else {
                return false;
            }
    }
}
