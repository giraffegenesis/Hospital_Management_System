/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import hospital_management_system.HMS;
import hospital_management_system.MyConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import source_code.DatabaseInteraction;

/**
 *
 * @author coolj
 */
public class DoctorConnection extends DatabaseInteraction {

    private Connection con;

    DoctorConnection() {

    }

    public ResultSet add(String fName, String lName, String phoneNumber, String image) {
        con = MyConnection.getConnection();
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
            return rs = ps.getGeneratedKeys();

        } catch (Exception ex) {
            Logger.getLogger(HMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    public boolean update(String firstName, String lastName, String phoneNum, String image, int currentUserId) throws SQLException, IOException {
        con = MyConnection.getConnection();
        PreparedStatement ps;
        String updateQuery = "";

        //test
        if (image != null) {   //change with new profile picture
            byte[] img = null;
            Path pth;
            pth = Paths.get(image);
            img = Files.readAllBytes(pth);

            updateQuery = "UPDATE `doctor` SET `fName`= ?,`lName`= ?,`phoneNumber`= ?,`pic`= ? WHERE `doctorId`= ?";

            ps = con.prepareStatement(updateQuery);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, phoneNum);
            ps.setBytes(4, img);
            ps.setInt(5, currentUserId);

            if (ps.executeUpdate() != 0) {
                return true;
            } else {
                return false;
            }

        } else {
            updateQuery = "UPDATE `doctor` SET `fName`=?,`lName`=?,`phoneNumber`=? WHERE `doctorId` =?";

            ps = con.prepareStatement(updateQuery);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, phoneNum);
            ps.setInt(4, currentUserId);

            if (ps.executeUpdate() != 0) {
                return true;

            } else {
                return false;
            }
        }     
    }

    public boolean delete(int doctorId) {
        con = MyConnection.getConnection();
        try {

            String query = "DELETE FROM `doctor` WHERE doctorId= ?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, doctorId);

            if (preparedStmt.executeUpdate() != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Failed"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] getAllRows() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet getDoctorResultSet(int doctorId) throws SQLException {
        con = MyConnection.getConnection();
        PreparedStatement ps;

        ps = con.prepareStatement("SELECT `fName`, `lName`, `phoneNumber`, `pic` FROM `doctor` WHERE `doctorId`= ?");
        ps.setInt(1, doctorId);

        return ps.executeQuery();

    }

    /**
     *
     * @return
     */
    @Override
    public String[] getRowInRange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void remove(int doctorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getARow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateRow(int doctorId, String fName, String lName, String phoneNumber, String image) {
        boolean result = false;
        try {
            result = true;
        } catch (Exception ex) {
            System.out.println("WHY GOD WHY...");
        }
        return result;
    }

}
