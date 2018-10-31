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
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/javacontactsapp?useTimezone=true&serverTimezone=UTC";
            con = DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return con;
    }
}
