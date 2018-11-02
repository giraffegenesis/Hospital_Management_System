/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

/**
 *
 * @author coolj
 */
    import java.sql.*;  
    class MysqlCon{  
    public static Connection getConnection() {
        Connection conn= null;
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hms";
            conn = DriverManager.getConnection(url, "root", "");
        }catch (Exception e) { 
            System.err.println("Got an exception! "); 
            e.printStackTrace(System.out);
            System.err.println(e.getMessage()); 
        }
        return conn;
    }
   

            
	
}
