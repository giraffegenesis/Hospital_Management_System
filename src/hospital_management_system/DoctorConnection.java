
package hospital_management_system;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class that deletes a patient information from the system and DB
 * @author coolj
 * Date Created: 17th November, 2018 
 * Last Modified: 6th December, 2018
 */
public class DoctorConnection {

    // instance of the Connection class
    private Connection con;

    /**
     * Constructor
     */
    DoctorConnection() {

    }

    /**
     * Method uses SQL queries to add a doctor information to the DB
     * @param fName: First Name
     * @param lName: Last Name
     * @param phoneNumber: Phone Number
     * @param image: Image as String
     * @return ResultSet
     */
    public ResultSet add(String fName, String lName, String phoneNumber, String image) {
        con = MyConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        if(image==null){
            return null;
        }
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
    
    /**
     * Method uses SQL queries to update a doctor information to the DB
     * @param firstName: First Name
     * @param lastName: Last Name
     * @param phoneNum: Phone Number
     * @param image: Image as String
     * @return ResultSet
     */

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
  /**
     * Method uses SQL queries to delete a doctor information to the DB
     * @param doctorId: Id of the doctor
     * @return ResultSet
     */

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

      /**
     * Method uses SQL queries to select a doctor information from the DB
     * @param doctorId: Id of the Doctor
     * @return ResultSet
     */

    public ResultSet getDoctorResultSet(int doctorId) throws SQLException {
        con = MyConnection.getConnection();
        PreparedStatement ps;
        
        ps = con.prepareStatement("SELECT `fName`, `lName`, `phoneNumber`, `pic` FROM `doctor` WHERE `doctorId`= ?");
        ps.setInt(1, doctorId);
        return ps.executeQuery();
        
    }
    
}
