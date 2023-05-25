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
 * This java class is responsible for testing functionality for the main
 * page of the application.
 * @author Darwish Chahbar
 */
public class MainPageTest {
    
    public MainPageTest() {
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
     * Test for the displayPOIInfo method of the main page.
     */
    @Test
    public void testDisplayPOIInfo() {
        System.out.println("displayPOIInfo");
        POI instance = new POI("110", "Ground", "MC", "Classroom", "Classroom", "Teaches CS2208", 123.45, 67.890, false, false);
        String expResult = "110";
        String result = instance.getRoomNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test for the clearPOIInfo method for the main page.
     */
    @Test
    public void testClearPOIInfoBuildingName() {
        System.out.println("clearPOIInfo");
        MainPage inst = new MainPage();
        POI instance = new POI("110", "Ground", "MC", "Classroom", "Classroom", "Teaches CS2208", 123.45, 67.890, false, false);
        inst.clearPOIInfo();
        String expResult = inst.buildingName;
        String result = "";
        assertEquals(expResult, result);
    }
    
    /**
     * Test for the clearPOIInfoName method for the main page.
     */
    @Test
    public void testClearPOIInfoName() {
        System.out.println("clearPOIInfo");
        MainPage inst = new MainPage();
        POI instance = new POI("110", "Ground", "MC", "Classroom", "Classroom", "Teaches CS2208", 123.45, 67.890, false, false);
        inst.clearPOIInfo();
        String expResult = "frame0";
        String result = inst.getName();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of main method for class MainPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainPage.main(args);
    }
}
