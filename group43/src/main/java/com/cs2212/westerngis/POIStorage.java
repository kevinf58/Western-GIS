/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This method is to store poi with its hashed id, into the HashMap, then load the poi with new id into the JSON file
 * @author Vladislav
 */

package com.cs2212.westerngis;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class POIStorage {
    public static Map<String, POI> poiMap = new HashMap<>();
/**
 * This method takes a POI object as parameter and put in the HashMap
 * @param poi This a POI object
 */
    public static Map<String, POI> userMap = new HashMap<>();

    public static void addPOI(POI poi) {
        poiMap.put(poi.getId(), poi);
    }
    
/**
 * This method takes a string of id and get the POI object from HashMap
 * @param id This is the id of a POI
 * @return a POI object from the HashMap
 */
    public static POI getPOI(String id) {
        return poiMap.get(id);
    }
    
/**
 * This method is to remove a POI object with its id
 * @param id this is the id of a POI
 */
    public static void removePOI(String id) {
        poiMap.remove(id);
    }

/**
 * This method will create a new file folder and load the POIs info to each JSON files
 */
    public static void loadPOIs() {
        POIStorage.poiMap = new HashMap<>();
        File directory = new File("poi_data");
        if (!directory.exists()) {
            directory.mkdirs();
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            try {
                String json = Files.readString(file.toPath());
                Gson gson = new Gson();
                POI poi = gson.fromJson(json, POI.class);
                POIStorage.poiMap.put(poi.getId(), poi);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Loads the POI info into JSON files for users.
     */
        public static void loadUserPOIs() {
        File directory = new File("poi_UserData");
        if (!directory.exists()) {
            directory.mkdirs();
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            try {
                String json = Files.readString(file.toPath());
                Gson gson = new Gson();
                POI poi = gson.fromJson(json, POI.class);
                POIStorage.poiMap.put(poi.getId(), poi);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
