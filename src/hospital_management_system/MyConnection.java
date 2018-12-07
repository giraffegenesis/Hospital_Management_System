
package hospital_management_system;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Class that creates a connection with DB
 * @author AbrarZawed
 * Date Created: 10th September, 2018 
 * Last Modified: 6th December, 2018
 */
public class MyConnection {
    
    /**
     * Method that connects to the DB
     * @return a Connection instance for other connection classes to use
     */
    public static Connection getConnection() {
        Connection connect = null;
        try {
            // loading and initializing the class that represents the MySQL driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            // javacontactsapp is the name of database in the MySQL Database Management System
            String url = "jdbc:mysql://localhost:3306/hospitalmanagementsystem";
            connect = DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            System.out.print("Not Connected to MySQL Database");
        }
        return connect;
    }
}
