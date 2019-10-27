/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestowanieOprogramowania;

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
public class TestowanieTest {
    
    public TestowanieTest() {
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
     * Test of dodawanie method, of class Testowanie.
     */
    @Test
    public void testDodawanie() {
        System.out.println("dodawanie");
        int x = 2;
        int y = 2;
        Testowanie t = new Testowanie();
        int expResult = 4;
        int result = t.dodawanie(x, y);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sprawdzZakres method, of class Testowanie.
     */
    @Test
    public void testSprawdzZakres() {
        System.out.println("sprawdzZakres");
        int zakresMin = 2;
        int zakresMax = 9;
        int liczba = 5;
        Testowanie t = new Testowanie();
      
        
        assertTrue(t.sprawdzZakres(zakresMin, zakresMax, liczba));
    }
    
}
