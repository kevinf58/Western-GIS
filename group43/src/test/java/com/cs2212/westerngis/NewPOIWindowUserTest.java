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
 * This class is responsible for testing the functionality of the 'newPOIWindow' class
 * @author Darwish Chahbar
 */
public class NewPOIWindowUserTest {
    
    public NewPOIWindowUserTest() {
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
     * Testing the main method.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewPOIWindow.main(args);
    }
    
    /**
     * Testing the x coordinates for newly created POI's.
     */
    @Test
    public void testNewPOIWindowX(){
        System.out.println("NewPOIWindow");
        NewPOIWindowUser instance = new NewPOIWindowUser(111, 222, "MC", "Ground");
        int expResult = 111;
        int result = instance.getThisX();
        assertEquals(expResult, result);
    }
    
    /**
     * Testing the x coordinates for newly created POI's.
     */
    @Test
    public void testNewPOIWindowY(){
        System.out.println("NewPOIWindow");
        NewPOIWindowUser instance = new NewPOIWindowUser(111, 222, "MC", "Ground");
        int expResult = 222;
        int result = instance.getThisY();
        assertEquals(expResult, result);
    }
    
    /**
     * Testing the building names for newly created POI's.
     */
    @Test
    public void testNewPOIWindowBuildingName(){
        System.out.println("NewPOIWindow");
        NewPOIWindowUser instance = new NewPOIWindowUser(111, 222, "MC", "Ground");
        String expResult = "MC";
        String result = instance.getThisBuildName();
        assertEquals(expResult, result);
    }
    
    /**
     * Testing the building floors for newly created POI's.
     */
    @Test
    public void testNewPOIWindowBuildingFloor(){
        System.out.println("NewPOIWindow");
        NewPOIWindowUser instance = new NewPOIWindowUser(111, 222, "MC", "Ground");
        String expResult = "Ground";
        String result = instance.getThisBuildFloor();
        assertEquals(expResult, result);
    }
}
