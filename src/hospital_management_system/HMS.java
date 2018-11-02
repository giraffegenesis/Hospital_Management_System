/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;
import java.sql.*;
/**
 *
 * @author coolj
 */
public class HMS {
    private static final long serialVersionUID = 1L;
    private static HMS hms;
    
    private HMS(){
        
    }
    public static HMS instance() {
		if (hms == null) {
			
			return (hms = new HMS());
		} 
		return hms;
		
	}
    
    public Doctor addDoctor(String fName, String lName, int phoneNumber, String image){ // image to blob (see signup.java)
      Doctor doctor = new Doctor(fName, lName, phoneNumber,image);
      // CREATE CONNECTION HERE.......
      return doctor;
    }
    
    public String updateDoctor(int doctorId){
        return null;
    }
    
    public String deleteDoctor(int id){
        return null;
    }
    
    public boolean addPatient(String fName,String lName, int phoneNumber,int doctorId){
        Connection conn= MysqlCon.getConnection();
        try{
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO patient " + 
                "VALUES ("+13+",'"+fName+"','"+lName+"','failure','hater', 'death', 'pa',"+phoneNumber+",'purple')"); 
            conn.close(); 
            return true;
        }catch(Exception e){
            System.err.println("fuck");
            e.printStackTrace();
        }
        return false;
    }
    
    public String updatePatient(int patientId){
        return null;
    }
    
    public String deletePatient(int patientId){
        return null;
    }
    
    public String scheduleAppointment(Date date,Time time){
        return null;
    }
    
    public String scheduleTest(Date date, Time time){
        return null;
    }
    
    public String writePrescription(String name, float dosage, int quantity, String usage){
        return null;
    }
    
    public String addEvaluation(String department, Date date, String testType, String notes){
        return null;
    }
    public static void main(String[] args) {
       /* HMS purple = new HMS();
        byte[] array= {3,0};
        purple.addDoctor("jake","theSnake", 12034, array);
        
        purple.addPatient("john", "smith", 21242450, 0);
        */
    }
}
