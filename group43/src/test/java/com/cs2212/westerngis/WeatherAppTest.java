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
public class WeatherAppTest {
    
    public WeatherAppTest() {
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
     * Test of getTemperature method, of class WeatherApp.
     */
    @Test
    public void testGetTemperature() throws Exception {
        System.out.println("getTemperature");
        WeatherApp instance = new WeatherApp("london, ontario");
        double expResult = instance.getTemperature();
        double result = instance.getTemperature();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFeelsLike method, of class WeatherApp.
     */
    @Test
    public void testGetFeelsLike() throws Exception {
        System.out.println("getFeelsLike");
        WeatherApp instance = new WeatherApp("london, ontario");
        double expResult = instance.getFeelsLike();
        double result = instance.getFeelsLike();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHumidity method, of class WeatherApp.
     */
    @Test
    public void testGetHumidity() throws Exception {
        System.out.println("getHumidity");
        WeatherApp instance = new WeatherApp("london, ontario");
        double expResult = instance.getHumidity();
        double result = instance.getHumidity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWeatherCondition method, of class WeatherApp.
     */
    @Test
    public void testGetWeatherCondition() throws Exception {
        System.out.println("getWeatherCondition");
        WeatherApp instance = new WeatherApp("london, ontario");
        String expResult = instance.getWeatherCondition();
        String result = instance.getWeatherCondition();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class WeatherApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainPage.main(args);
    }
    
}
