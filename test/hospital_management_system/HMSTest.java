/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.sql.ResultSet;
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
public class HMSTest {
    
    public HMSTest() {
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
     * Test of instance method, of class HMS.
     */
    @Test
    public void testInstance() {
        System.out.println("instance");
        HMS result = HMS.instance();
        assertNotNull(result);
      
    }

    /**
     * Test of addDoctor method, of class HMS.
     */
    @Test
    public void testBadAddDoctor() {
        System.out.println("addDoctor--Bad Input--");
        String fName = "john";
        String lName = "myth";
        String phoneNumber = "6121115846";
        String image = null;
        HMS instance = HMS.instance();
        int expResult = 0;
        int result = instance.addDoctor(fName, lName, phoneNumber, image);
        assertTrue(expResult >= result);
       
    }

    /**
     * Test of getDoctor method, of class HMS.
     */
    @Test
    public void testBadGetDoctor() throws Exception {
        System.out.println("getDoctor--BadInput--");
        boolean results=true;
        int doctorId = 0;
        HMS instance = HMS.instance();
        ResultSet result = instance.getDoctor(doctorId);
        if(result.next()){
            String temp=result.getString(1);
            if(temp==""){
                results=false;
            }
        }
       
        assertTrue(results);
        
    }
    
    /**
     * Test of getDoctor method, of class HMS.
     */
    @Test
    public void testGetDoctor() throws Exception {
        System.out.println("getDoctor--Good Input--");
        int doctorId = 3;
        HMS instance = HMS.instance();
        ResultSet result = instance.getDoctor(doctorId);
        assertNotNull(result);
        
    }
    /**
     * Test of getPatient method, of class HMS.
     */
    @Test
    public void testGetPatient() throws Exception {
        System.out.println("getPatient--Good Input");
        int patientId = 3;
        HMS instance = HMS.instance();
        ResultSet result = instance.getPatient(patientId);
        assertNotNull(result);
    }
    
    /**
     * Test of getPatient method, of class HMS.
     */
    @Test
    public void testBadGetPatient() throws Exception {
        System.out.println("getPatient--Bad Input");
        boolean results=true;
        int patientId = 0;
        HMS instance = HMS.instance();
        ResultSet result = instance.getPatient(patientId);
        if(result.next()){
            String temp=result.getString(1);
            if(temp==""){
                results=false;
            }
        }
       
        assertTrue(results);
    }

    /**
     * Test of updateDoctor method, of class HMS.
     */
    @Test
    public void testUpdateDoctor() throws Exception {
        System.out.println("updateDoctor--Good Input");
        String firstName = "james";
        String lastName = "king";
        String phoneNum = "5646";
        String image = null;
        int currentUserId = 3;
        HMS instance = HMS.instance();
        boolean result = instance.updateDoctor(firstName, lastName, phoneNum, image, currentUserId);
        assertTrue(result);
    }
    
    /**
     * Test of updateDoctor method, of class HMS.
     */
    @Test
    public void testBadUpdateDoctor() throws Exception {
        System.out.println("updateDoctor--Bad Input");
        String firstName = "james";
        String lastName = "king";
        String phoneNum = "5646";
        String image = null;
        int currentUserId = 0;
        HMS instance = HMS.instance();
        boolean result = instance.updateDoctor(firstName, lastName, phoneNum, image, currentUserId);
        assertFalse(result);
    }
    /**
     * Test of deleteDoctor method, of class HMS.
     */
    @Test
    public void testBadDeleteDoctor() {
        System.out.println("deleteDoctor-- Bad Input--");
        int id = 0;
        HMS instance = HMS.instance();
        String expResult = null;
        String result = instance.deleteDoctor(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addPatient method, of class HMS.
     */
    @Test
    public void testAddPatient() {
        System.out.println("addPatient");
        String firstName = "j";
        String lastName = "k";
        String phoneNum = "3456789222";
        String primaryCarePhysicianId = "4";
        HMS instance = HMS.instance();
        int expResult = 0;
        int result = instance.addPatient(firstName, lastName, phoneNum, primaryCarePhysicianId);
        assertTrue(expResult <= result);
    }

    /**
     * Test of deletePatient method, of class HMS.
     */
    @Test
    public void testBadDeletePatient() {
        System.out.println("deletePatient--Bad Input");
        int patientId = 0;
        HMS instance = HMS.instance();
        String expResult = null;
        String result = instance.deletePatient(patientId);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of deletePatient method, of class HMS.
     */
    @Test
    public void testDeletePatient() {
            System.out.println("deletePatient--Good Input--");
            int patientId = 0;
            HMS instance = HMS.instance();
            patientId=instance.addPatient("Delete","Me", "Now", "3");
            String expResult = ""+patientId;
            String result = instance.deletePatient(patientId);
            assertEquals(expResult,result);
    }

    
    /**
     * Test of updatePatient method, of class HMS.
     */
    @Test
    public void testBadUpdatePatient() throws Exception {
        System.out.println("updatePatient--Bad Input");
        String firstName = "";
        String lastName = "";
        String phoneNumber = "";
        String primaryCarePhysician = "";
        int currentPatientId = 0;
        HMS instance = HMS.instance();
        boolean result = instance.updatePatient(firstName, lastName, phoneNumber, primaryCarePhysician, currentPatientId);
        assertFalse(result);
    }
    
    /**
     * Test of updatePatient method, of class HMS.
     */
    @Test
    public void testUpdatePatient() throws Exception {
        System.out.println("updatePatient--Good Input");
        String firstName = "meow";
        String lastName = "updated";
        String phoneNumber = "2222222222";
        String primaryCarePhysician = "3";
        int currentPatientId = 3;
        HMS instance = HMS.instance();
        boolean result = instance.updatePatient(firstName, lastName, phoneNumber, primaryCarePhysician, currentPatientId);
        assertTrue(result);
    }
    /**
     * Test of getAdminVerification method, of class HMS.
     */
    @Test
    public void testGetAdminVerification() throws Exception {
        System.out.println("getAdminVerification--Good Input--");
        String keyword = "ics";
        String password = "499";
        HMS instance = HMS.instance();
        boolean result = instance.getAdminVerification(keyword, password);
        assertTrue(result);
        
    }
    
    /**
     * Test of getAdminVerification method, of class HMS.
     */
     @Test
    public void testBadGetAdminVerification() throws Exception {
        System.out.println("getAdminVerification--Bad Input--");
        String keyword = "";
        String password = "";
        HMS instance = HMS.instance();
        boolean result = instance.getAdminVerification(keyword, password);
        assertFalse(result);
        
    }
}
