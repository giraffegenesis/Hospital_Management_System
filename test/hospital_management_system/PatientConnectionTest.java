/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author coolj
 */
public class PatientConnectionTest {
    
    public PatientConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class PatientConnection.
     */
    @Test
    public void testAdd() {
        System.out.println("add --Good Input--");
        String fName = "purple";
        String lName = "rain";
        String phoneNumber = "2107023509";
        String primaryCarePhysician = "5";
        PatientConnection instance = new PatientConnection();
        ResultSet result = instance.add(fName, lName, phoneNumber, primaryCarePhysician);
        assertNotNull(result);
        ;
    }

    /**
     * Test of delete method, of class PatientConnection.
     */
    @Test
    public void testBadDelete() {
        System.out.println("delete--Bad Input--");
        int patientId = 0;
        PatientConnection instance = new PatientConnection();
        boolean result = instance.delete(patientId);
        assertFalse(result);
    }
    
     /**
     * Test of delete method, of class PatientConnection.
     */
    @Test
    public void testGoodDelete() {
        try {
            System.out.println("delete--Good Input--");
            int patientId = 0;
            PatientConnection instance = new PatientConnection();
            ResultSet rs=instance.add("Delete","Me", "Now", "3");
            if (rs.next()) {
                patientId = rs.getInt(1);
            }
            boolean result = instance.delete(patientId);
            assertTrue(result);
        } catch (SQLException ex) {
            Logger.getLogger(PatientConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    /**
     * Test of getPatientResultSet method, of class PatientConnection.
     */
    @Test
    public void testBadGetPatientResultSet() throws Exception {
        System.out.println("getPatientResultSet--Bad Input");
        int patientId = 0;
        boolean results=true;
        PatientConnection instance = new PatientConnection();
        ResultSet result = instance.getPatientResultSet(patientId);
        if(!result.next()){
                results=false;
        }
        assertFalse(results);   
    }
    /**
     * Test of getPatientResultSet method, of class PatientConnection.
     */
    @Test
    public void testGetPatientResultSet() throws Exception {
        System.out.println("getPatientResultSet-- Good Input");
        int patientId = 3;
        PatientConnection instance = new PatientConnection();
        ResultSet result = instance.getPatientResultSet(patientId);
        assertNotNull(result);
    }

    /**
     * Test of update method, of class PatientConnection.
     */
    @Test
    public void testBadUpdate() throws Exception {
        System.out.println("update-- Bad Input--");
        String firstName = "";
        String lastName = "";
        String phoneNumber = "";
        String primaryCarePhysician = "";
        int currentPatientId = 0;
        PatientConnection instance = new PatientConnection();
        boolean result = instance.update(firstName, lastName, phoneNumber, primaryCarePhysician, currentPatientId);
        assertFalse(result);
    }
    
    /**
     * Test of update method, of class PatientConnection.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update-- Good Input--");
        String firstName = "something";
        String lastName = "";
        String phoneNumber = "";
        String primaryCarePhysician = "";
        int currentPatientId = 3;
        PatientConnection instance = new PatientConnection();
        boolean result = instance.update(firstName, lastName, phoneNumber, primaryCarePhysician, currentPatientId);
        assertTrue(result);
    }
}
