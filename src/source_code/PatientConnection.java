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
public final class PatientConnection extends DatabaseInteraction{
    Connection con;
    private PatientConnection(){
        
    }

   
    public boolean add(String fName) {
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
            return rs = ps.getGeneratedKeys();
            
           /* if (rs.next()){
                setDoctorId(rs.getInt(1));
            }
            
             con.close();
             System.exit(0);
            //setDoctorId(temp); */
        /*}catch (Exception ex) {
            Logger.getLogger(HMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         */ 
        return false;
    }

    
    public boolean delete(int patientId) {
       con = MyConnection.getConnection();
      
        try {
           
            String query = "DELETE FROM `patient` WHERE patientId= ?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, patientId);
            preparedStmt.execute();
            return true;
        }catch (SQLException ex) {
            Logger.getLogger(PatientConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("YOU ARE A FAILURE."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String[] getAllRows() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getARow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] getRowInRange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}