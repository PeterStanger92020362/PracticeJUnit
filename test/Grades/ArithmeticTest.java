package Grades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Computer Power Plus
 */
public class ArithmeticTest {
    
    public ArithmeticTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of add method, of class Arithmetic.
     */
    @Test
    public void testAdd() {
        System.out.println("testing add");
        Arithmetic arithmetic = new Arithmetic(); 
        
        assertEquals("unexpected result of addition", 8, arithmetic.add(3,5));
        assertEquals("unexpected result of addition", 6, arithmetic.add(0,6));
        assertEquals("unexpected result of addition", -14, arithmetic.add(0,-14));
        assertEquals("unexpected result of addition", 0, arithmetic.add(-5,5));
        assertEquals("unexpected result of addition", -6, arithmetic.add(-12,6));
        
    }
    
}
