/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.util.HashMap;
import java.util.List;
import source_code.Doctor;

/**
 *
 * @author coolj
 */
public class DoctorList extends GenericList<Integer, Doctor>{
    private static DoctorList doctorList;
    
    private DoctorList() {
		setList(new HashMap<Integer, Doctor>());
	}
	
	/**
	 * Creates an instance of TransactionList.
	 */
	public static DoctorList instance() {
		if (doctorList == null) {

			return (doctorList = new DoctorList());
		} else {
			return doctorList;
		}
	}
        
        
}
