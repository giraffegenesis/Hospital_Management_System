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
    class Working_connection_delete_later{  
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hms";
            con = DriverManager.getConnection(url, "root", " ");
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return con;
    }
    public static void main(String[] args) {
		Connection conn= null;
                try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hms";
            conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO prescription " + 
                "VALUES (1, 'Simpson',11, 'Mr.', 10, 2001)"); 
            

            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            e.printStackTrace(System.out);
            System.err.println(e.getMessage()); 
        } 
	}
}
