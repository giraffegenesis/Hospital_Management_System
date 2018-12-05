/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
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
public class PatientConnection {

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

    boolean delete(int patientId) {
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
}
