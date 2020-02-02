
package kalkulator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class KalkulatorIT {
    
    public KalkulatorIT() {
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
     * Test of main method, of class Kalkulator.
     */
    

    @Test
    public void testDodajLiczby() {
        int a = 6 ;
        int b = 4 ; 
       
        Kalkulator test = new Kalkulator() ; 
         int result = test.dodajLiczby(a,b) ; 
         assertEquals(10,result) ; 
                 
         
    }
    @Test
    public void testOdejmowanieLiczby() {
        int a = 6 ;
        int b = 4 ; 
       
        Kalkulator test = new Kalkulator() ; 
         int result = test.odejmowanieLiczby(a,b) ; 
         assertEquals(2,result) ; 
                 
         
    }
    @Test
    public void testMozenieLiczby() {
        int a = 6 ;
        int b = 4 ; 
       
        Kalkulator test = new Kalkulator() ; 
         int result = test.mnozenieLiczby(a,b) ; 
         assertEquals(24,result) ; 
                 
         
    }
    @Test
    public void testDzielenieLiczby() {
        int a = 4 ;
        int b = 4 ; 
       
        Kalkulator test = new Kalkulator() ; 
         double result = test.dzielenieLiczby(a,b) ; 
         assertEquals(1,result , 0.00005) ;
         
         
    }

    
    
}
