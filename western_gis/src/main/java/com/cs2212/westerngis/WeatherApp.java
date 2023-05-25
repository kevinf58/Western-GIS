/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs2212.westerngis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 * This weatherApp class is responsible for pulling the general temperature, humidity,
 * the temperature it currently feels like, and the weather condition info from an API
 * using its API link and a key.
 * 
 * @author Vladislav
 */
public class WeatherApp {
    private double temperature;
    private double feelsLike;
    private int humidity;
    private String weatherCondition;

    /**
     * This method is responsible for pulling the general temperature, humidity,
     * the temperature it currently feels like, and the weather condition info from an API
     * using its API link and a key based on the string provided in the parameters.
     * 
     * @param location
     * @throws Exception
     */
    public WeatherApp(String location) throws Exception {
        String apiKey = "0901cf623b9109a58151a9fbc5fb679f";
        
        //Concatenating the API URL, location, and key to form the full URL used to pull info
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + apiKey;

        //Getting the API info needed in JSON format and storing it in 'main'
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        JSONObject json = new JSONObject(response.toString());
        JSONObject main = json.getJSONObject("main");
        
        //Assigning variables to only the info that is needed from what is returned from the API
        temperature = main.getDouble("temp") - 273.15;
        feelsLike = main.getDouble("feels_like") - 273.15;
        humidity = main.getInt("humidity");

        JSONObject weather = json.getJSONArray("weather").getJSONObject(0);
        weatherCondition = weather.getString("main");
    }

    /**
     * Getter method for getting the temperature
     * 
     * @return temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Getter method for getting the temperature it currently feels like
     * 
     * @return feelsLike
     */
    public double getFeelsLike() {
        return feelsLike;
    }

    /**
     * Getter method for getting the humidity 
     * 
     * @return humidity
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * Getter method for getting the weather condition (cloudy, rainy, foggy etc...)
     * 
     * @return weatherCondition
     */
    public String getWeatherCondition() {
        return weatherCondition;
    }

    /**
     * Main method that is responsible displaying the pulled API info
     * 
     * @param args 
     */
    public static void main(String[] args) {
        try {
            String location = "London";
            WeatherApp weatherData = new WeatherApp(location);
            System.out.println("Temperature: " + weatherData.getTemperature() + "°C");
            System.out.println("Feels like: " + weatherData.getFeelsLike() + "°C");
            System.out.println("Humidity: " + weatherData.getHumidity() + "%");
            System.out.println("Weather condition: " + weatherData.getWeatherCondition());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


