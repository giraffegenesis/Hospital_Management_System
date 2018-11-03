/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author AbrarZawed
 */
public class MyConnection {
    public static Connection getConnection() {
        Connection connect = null;
        try {
            // loading and initializing the class that represents the MySQL driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            // javacontactsapp is the name of database in the MySQL Database Management System
            String url = "jdbc:mysql://localhost:3306/hospitalmanagementsystem?useTimezone=true&serverTimezone=UTC";
            connect = DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            System.out.print("Not Connected to MySQL Database");
        }
        return connect;
    }
}
