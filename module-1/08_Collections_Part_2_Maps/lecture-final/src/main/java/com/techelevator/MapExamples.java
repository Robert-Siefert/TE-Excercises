package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {


    public static void main(String[] args) {

        // BE ABLE TO DECLARE AND INSTANTIATE A MAP  <KEY, VALUE>
        Map<String, Integer> homesForSale = new HashMap<>();
        Map<Integer, String> errorCodes = new HashMap<>();


        //BE ABLE TO PUT THINGS INSIDE THE MAP
        homesForSale.put("43035", 10);
        homesForSale.put("43021", 2);
        homesForSale.put("43016", 5);
        homesForSale.put("43022", 0);

        errorCodes.put(404, "Not Found");
        errorCodes.put(403, "Forbidden");
        errorCodes.put(418, "I am a teapot");

        //BE ABLE TO GET THINGS OUT OF A MAP
        String errorTeapot = errorCodes.get(418);
        System.out.println(errorTeapot);
        errorCodes.put(418, errorTeapot + " and I am short and stout");

        //WHAT HAPPENS IF I TRY TO ACCESS A KEY THAT DOES NOT EXIST?

        String whatHappens = errorCodes.get(500);
        System.out.println(whatHappens);

        if (whatHappens == null) {
            //lets add it to the map
            errorCodes.put(500, "Internal Error");
        }

        // CONTAINS KEY
        if (errorCodes.containsKey(403)) {
            System.out.println(errorCodes.get(403));
        }

     // BE ABLE TO ITERATE THROUGH A MAP = USING SET OF KEYS TO LOOP THROUGH A MAP
        Set<Integer> mySetOfKeys = errorCodes.keySet();   // keyset returns my set of keys

        for (Integer key : mySetOfKeys) {
            System.out.println("Key Value: " + key + " has a value of" + errorCodes.get(key));
        }

        // BE ABLE TO ITERATE THROUGH A MAP = USING MAP.ENTRY

        for (Map.Entry<Integer, String> row : errorCodes.entrySet()) {
            Integer key = row.getKey();
            String value = row.getValue();

            System.out.println(row.getKey() + " is my key, " + row.getValue() + " is my value..." );

        }


        //REMOVE AND ENTRY FROM THE MAP
        errorCodes.remove(418);




    }

}
