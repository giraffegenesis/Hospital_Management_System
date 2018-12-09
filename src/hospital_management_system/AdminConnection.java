
package hospital_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class that connects to the database to check administrator login
 * @author AbrarZawed
 * Date Created: 6th December, 2018
 * Last Modified: 6th December, 2018
 */
public class AdminConnection {

    // private instant variables
    private Connection con;
    private int adminId;
    
    /**
     * Constructor for the class
     */
    public AdminConnection() {
        adminId = 1;
    }

    /**
     * Method that verifies the keyword and password for the system.
     * Method that allows administrator to login to the system.
     * @param keyword-> the username for the system (currently "ics")
     * @param password-> the password for the system (currently "499")
     * @return ResultSet from the DB
     * @throws SQLException 
     */
    public boolean verifyAdmin(String keyword, String password) throws SQLException {
      
        con = MyConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT `keyword`,`password` FROM `hms_login_info` WHERE `adminId`=?");
        ps.setInt(1, adminId);
        rs=ps.executeQuery();
        if (rs.next()) {
                String keyword_from_db = rs.getString(1);   //output from db
                String password_from_db = rs.getString(2);  //output from db

                // compare the user input with db output
                if (keyword_from_db.equalsIgnoreCase(keyword) && password_from_db.equalsIgnoreCase(password)) {
                    return true;
                }
        }
        return false;
    }

}
