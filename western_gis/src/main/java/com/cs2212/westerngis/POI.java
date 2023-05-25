/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs2212.westerngis;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * This class is to store the info of each POI
 * @author Vladislav
 */
public class POI {
    private String id;
    public String roomNumber;
    private String floor;
    public String building;
    private String category;
    private String name;
    private String description;
    private double xcoord;
    private double ycoord;
    private boolean mapping;
    private boolean fav;
    private boolean useFav;
    
    /**
     * Constructor for POI object
     * @param roomNumber
     * @param floor
     * @param building
     * @param category
     * @param name
     * @param description
     * @param xcoord
     * @param ycoord
     * @param fav
     * @param useFav 
     */
    public POI(String roomNumber, String floor, String building, String category, String name, String description, double xcoord, double ycoord, boolean fav, boolean useFav) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.building = building;
        this.category = category;
        this.name = name;
        this.description = description;
        this.xcoord = xcoord;
        this.ycoord = ycoord;
        this.mapping = false;
        this.id = String.format("%.0f%.0f", xcoord, ycoord);
        this.fav = fav;
        this.useFav = useFav;
    }
    
/**
 * A getter method of POI's id
 * @return id
 */    
    public String getId() {
        return id;
    }

/**
 * A getter method of POI's room number
 * @return room number
 */    
    public String getRoomNumber() {
        return roomNumber;
    }

/**
 * A getter method of POI's floor
 * @return the floor POI located
 */    
    public String getFloor() {
        return floor;
    }

/**
 * A getter method of POI's building
 * @return the building POI located
 */    
    public String getBuilding() {
        return building;
    }
    
/**
 * A getter method of POI's category
 * @return the category of the POI
 */    
    
    public String getCategory() {
        return category;
    }

/**
 * A getter method of POI's name
 * @return POI's name
 */    
    public String getName() {
        return name;
    }

/**
 * A getter method of POI's x coordinate
 * @return x coordinate of the POI
 */    
    public double getX() {
        return xcoord;
    }
    
/**
 * A getter method of POI's y coordinate
 * @return y coordinate of the POI
 */
    public double getY() {
        return ycoord;
    }

/**
 * A getter method of POI's Mapping
 * @return mapping of POI
 */    
    public boolean getMapping() {
        return mapping;
    }

/**
 * A getter method of POI's description
 * @return description of the POI
 */  
    public String getDescription() {
        return description;
    }

/**
 * A setter method of POI's Mapping
 * @param change  check the change of POI
 */    
    public void setMapping(boolean change) {
        this.mapping = change;
    }
    
/**
 * A getter method of POI's favorite status
 * @return true if POI is set favorite false otherwise
 */    
    public boolean getFav() {
        return fav;
    }
    
    /**
     * Getter method for user favorite
     * @return 
     */
    public boolean getUseFav() {
        return useFav;
    }
    
    /**
     * Setter method for setting a favorite
     * @param change 
     */
    public void setFav(boolean change) {
        this.fav = change;
        this.save();
    }
    
    /**
     * Setter method for setting a user's favorite
     * @param change 
     */
    public void setUseFav(boolean change) {
        this.useFav = change;
        this.saveUser();
    }
    
    /**
     * This method is responsible for writing the new POI to a local file in JSON format.
     */
    public void save() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        
        try {
            File directory = new File("poi_data");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            
            //Creating a new file writer to write the POI info to the JSON file.
            FileWriter writer = new FileWriter(directory.getPath() + File.separator + id.toString() + ".json");
            writer.write(json);
            writer.flush();
            writer.close();
            POIStorage.poiMap.put(this.id, this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is responsible for writing a new user's POI to a newly created
     * local file in JSON format.
     */
        public void saveUser() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        try {
            File directory = new File("poi_UserData");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            FileWriter writer = new FileWriter(directory.getPath() + File.separator + id.toString() + ".json");
            writer.write(json);
            writer.flush();
            writer.close();
            POIStorage.poiMap.put(this.id, this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
