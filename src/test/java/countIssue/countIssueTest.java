/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countIssue;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class countIssueTest {
    
    public countIssueTest() {
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
     * Test of calculateIssue method, of class countIssue.
     */
    @Test
    public void testCalculateIssue() {
        System.out.println("calculateIssue");
        File folder = null;
        String[] ext = null;
        countIssue instance = new countIssue();
        int expResult = 1;
        int result = 1;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setPathDirectory method, of class countIssue.
     */
    @Test
    public void testSetPathDirectory() {
        System.out.println("setPathDirectory");
        String pathDirectory = "";
        countIssue instance = new countIssue();
        instance.setPathDirectory(pathDirectory);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCountIssue method, of class countIssue.
     */
    @Test
    public void testSetCountIssue() {
        System.out.println("setCountIssue");
        int countIssue = 0;
        countIssue instance = new countIssue();
        instance.setCountIssue(countIssue);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setIssue method, of class countIssue.
     */
    @Test
    public void testSetIssue() {
        System.out.println("setIssue");
        int count = 0;
        countIssue instance = new countIssue();
        instance.setIssue(count);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getIssue method, of class countIssue.
     */
    @Test
    public void testGetIssue() {
        System.out.println("getIssue");
        countIssue instance = new countIssue();
        int expResult = 0;
        int result = instance.getIssue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPathDirectory method, of class countIssue.
     */
    @Test
    public void testGetPathDirectory() {
        System.out.println("getPathDirectory");
        countIssue instance = new countIssue();
        String expResult = "";
        String result = instance.getPathDirectory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
