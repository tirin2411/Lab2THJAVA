/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2thjava;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Bai13Test {
    
    public Bai13Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of modifyFile method, of class Bai13.
     */
    @Test
    public void testModifyFile() {
        System.out.println("modifyFile");
        String filePath = "";
        String oldString = "bai 13";
        String newString = "bai 13 lab 2";
        Bai13.modifyFile(filePath, oldString, newString);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Bai13.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bai13.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
