/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cs2212.westerngis;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Darwish Chahbar
 */
public class POITest {
    
    public POITest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class POI.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        String expResult = String.valueOf((int)instance.getX())+String.valueOf((int)instance.getY());
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRoomNumber method, of class POI.
     */
    @Test
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        String expResult = "321";
        String result = instance.getRoomNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFloor method, of class POI.
     */
    @Test
    public void testGetFloor() {
        System.out.println("getFloor");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        String expResult = "1";
        String result = instance.getFloor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBuilding method, of class POI.
     */
    @Test
    public void testGetBuilding() {
        System.out.println("getBuilding");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        String expResult = "AH";
        String result = instance.getBuilding();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategory method, of class POI.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        String expResult = "Lab";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class POI.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        String expResult = "Lab Room";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getX method, of class POI.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        double expResult = 222.22;
        double result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class POI.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        double expResult = 333.33;
        double result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMapping method, of class POI.
     */
    @Test
    public void testGetMapping() {
        System.out.println("getMapping");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        instance.setMapping(true);
        boolean expResult = true;
        boolean result = instance.getMapping();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class POI.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        String expResult = "N/A";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMapping method, of class POI.
     */
    @Test
    public void testSetMapping() {
        System.out.println("setMapping");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  false, false);
        instance.setMapping(true);
        boolean expResult = true;
        boolean result = instance.getMapping();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFav method, of class POI.
     */
    @Test
    public void testGetFav() {
        System.out.println("getFav");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  true, false);
        boolean expResult = true;
        boolean result = instance.getFav();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUseFav method, of class POI.
     */
    @Test
    public void testGetUseFav() {
        System.out.println("getUseFav");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  true, false);
        boolean expResult = false;
        boolean result = instance.getUseFav();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFav method, of class POI.
     */
    @Test
    public void testSetFav() {
        System.out.println("setFav");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  true, false);
        boolean expResult = true;
        boolean result = instance.getFav();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUseFav method, of class POI.
     */
    @Test
    public void testSetUseFav() {
        System.out.println("setUseFav");
        POI instance = new POI("321", "1", "AH", "Lab", "Lab Room", "N/A",  222.22, 333.33,  true, false);
        boolean expResult = false;
        boolean result = instance.getUseFav();
        assertEquals(expResult, result);
    }
    
}
