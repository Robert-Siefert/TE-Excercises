package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeFileReader {

    public Map<String, Home> loadHomesFromFile() {

        //read the file and populate a map
        Map<String, Home> homeMap = new HashMap<>();

        // read the file, create home/address objects and add to the map
        File inventoryFile = new File("homes.csv");
        try {
            Scanner scanner = new Scanner(inventoryFile);

            while(scanner.hasNextLine()) {

                String record = scanner.nextLine();
                String[] fields = record.split(",");

                //MLS456,3,2,1500,240000.50,124 Elm Street,Columbus,Ohio,43223,Formerly owned by the legendary Mr. Krueger... This home is sure to be your next dream nightmare.

                //String addressLine1, String city, String state, String zip
                Address address = new Address(fields[5],fields[6], fields[7], fields[8] );

                //String mls, double numberOfBathrooms, int numberOfBedrooms, Address address
                Home home = new Home(fields[0], Double.parseDouble(fields[2]), Integer.parseInt(fields[1]), address);
                home.setSquareFeet(Integer.parseInt(fields[3]));
                home.setDescription(fields[9]);
                home.setListingPrice(Double.parseDouble(fields[4]));

                homeMap.put(fields[0], home);


            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //return map to inventory
        return homeMap;
    }


}
