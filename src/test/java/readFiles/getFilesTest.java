/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readFiles;

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
public class getFilesTest {
    
    public getFilesTest() {
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
     * Test of listFolderFile method, of class getFiles.
     */
    @Test
    public void testListFolderFile() {
        System.out.println("listFolderFile");
        File folder = null;
        getFiles instance = null;
        instance.listFolderFile(folder);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of addFile method, of class getFiles.
     */
    @Test
    public void testAddFile() {
        System.out.println("addFile");
        String fileExt = "";
        getFiles instance = null;
        instance.addFile(fileExt);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of javaExt method, of class getFiles.
     */
    @Test
    public void testJavaExt() {
        System.out.println("javaExt");
        String ext = "";
        getFiles instance = null;
        boolean expResult = false;
        boolean result = instance.javaExt(ext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getFileList method, of class getFiles.
     */
    @Test
    public void testGetFileList() {
        System.out.println("getFileList");
        getFiles instance = null;
        String[] expResult = null;
        String[] result = instance.getFileList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of displayFile method, of class getFiles.
     */
    @Test
    public void testDisplayFile() {
        System.out.println("displayFile");
        getFiles instance = null;
        String expResult = "";
        String result = instance.displayFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of numFiles method, of class getFiles.
     */
    @Test
    public void testNumFiles() {
        System.out.println("numFiles");
        getFiles instance = null;
        int expResult = 0;
        int result = instance.numFiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
