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
public class DoctorConnectionTest {
    
    public DoctorConnectionTest() {
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
     * Test of add method, of class DoctorConnection.
     */
    @Test
    public void testAdd() {
        System.out.println("add-- Good Input--");
        String fName = "me";
        String lName = "myself";
        String phoneNumber = "8459345664";
        String image = null;
        DoctorConnection instance = new DoctorConnection();
        ResultSet result = instance.add(fName, lName, phoneNumber, image);
        assertNull(result);
    }

    /**
     * Test of update method, of class DoctorConnection.
     */
    @Test
    public void testBadUpdate() throws Exception {
        System.out.println("update--Bad Input--");
        String firstName = "";
        String lastName = "";
        String phoneNum = "";
        String image = null;
        int currentUserId = 0;
        DoctorConnection instance = new DoctorConnection();
        boolean result = instance.update(firstName, lastName, phoneNum, image, currentUserId);
        assertFalse(result);
    }
    
    /**
     * Test of update method, of class DoctorConnection.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update--Good Input");
        String firstName = "woof";
        String lastName = "bark";
        String phoneNum = "3294167865";
        String image = null;
        int currentUserId = 3;
        DoctorConnection instance = new DoctorConnection();
        boolean result = instance.update(firstName, lastName, phoneNum, image, currentUserId);
        assertTrue(result);
    }
    
    /**
     * Test of delete method, of class DoctorConnection.
     */
    @Test
    public void testBadDelete() {
        System.out.println("delete--Bad Input");
        int doctorId = 0;
        DoctorConnection instance = new DoctorConnection();
        boolean result = instance.delete(doctorId);
        assertFalse(result);
    }
    
    
    /**
     * Test of getDoctorResultSet method, of class DoctorConnection.
     */
    @Test
    public void testBadGetDoctorResultSet() throws Exception {
        System.out.println("getDoctorResultSet--Bad Input--");
        int doctorId = 0;
        DoctorConnection instance = new DoctorConnection();
        ResultSet result = instance.getDoctorResultSet(doctorId);
        assertNull(result);
    }
    
    /**
     * Test of getDoctorResultSet method, of class DoctorConnection.
     */
    @Test
    public void testGetDoctorResultSet() throws Exception {
        System.out.println("getDoctorResultSet--Good Input--");
        int doctorId = 2;
        DoctorConnection instance = new DoctorConnection();
        ResultSet result = instance.getDoctorResultSet(doctorId);
        assertNotNull(result);
    }
}
