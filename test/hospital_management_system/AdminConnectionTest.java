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
public class AdminConnectionTest {
    
    public AdminConnectionTest() {
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
     * Test of verifyAdmin method, of class AdminConnection.
     */
    @Test
    public void testVerifyAdmin() throws Exception {
        System.out.println("verifyAdmin-- Good Input");
        String keyword = "ics";
        String password = "499";
        AdminConnection instance = new AdminConnection();
        boolean result = instance.verifyAdmin(keyword, password);
        assertTrue(result);
    }
    
    /**
     * Test of verifyAdmin method, of class AdminConnection.
     */
    @Test
    public void testBadVerifyAdmin() throws Exception {
        System.out.println("verifyAdmin-- Bad Input");
        String keyword = "";
        String password = "";
        AdminConnection instance = new AdminConnection();
        boolean result = instance.verifyAdmin(keyword, password);
        assertFalse(result);
    }
    
}
