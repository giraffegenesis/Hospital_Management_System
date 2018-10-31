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
    
    public String addDoctor(String fName, String lName,String phoneNumber){
        return null;
    }
    
    public String updateDoctor(int doctorId){
        return null;
    }
    
    public String deleteDoctor(int id){
        return null;
    }
    
    public String addPatient(String fName,String lName, String phoneNumber,int doctorId){
        return null;
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
}
