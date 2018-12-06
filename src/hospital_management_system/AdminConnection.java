/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author general
 */
public class AdminConnection {

    private Connection con;
    private int adminId;
    
    public AdminConnection() {
        adminId = 1;
    }

    public ResultSet verifyAdmin(String keyword, String password) throws SQLException {
      
        con = MyConnection.getConnection();
        PreparedStatement ps;

        ps = con.prepareStatement("SELECT `keyword`,`password` FROM `hms_login_info` WHERE `adminId`=?");
        ps.setInt(1, adminId);

        return ps.executeQuery();
        

    }

}
