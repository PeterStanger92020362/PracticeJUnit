/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Peter
 */
public class GradesTest {
    
    public GradesTest() {
        
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
     * Test of print method, of class Grades.
     */


 
    @Test
    public void testPrint() {
        Grades instance = new Grades();
              
        System.out.println("Testing the A Range");
        assertEquals("A test failed", "You got an A!", instance.print(100));
        assertEquals("A test failed","You got an A!", instance.print(94));

        System.out.println("Testing the B Range");
        assertEquals("B test failed", "You received a B", instance.print(85));
        assertEquals("B test failed","You received a B", instance.print(93));

        System.out.println("Testing the C Range");
        assertEquals("C test failed", "You received a C", instance.print(83));
        assertEquals("C test failed","You received a C", instance.print(75));
        
        System.out.println("Testing the D Range");
        assertEquals("D test failed", "You need to study more", instance.print(73));
        assertEquals("D test failed","You need to study more", instance.print(44));
          
    }
 
    
    
    
}
