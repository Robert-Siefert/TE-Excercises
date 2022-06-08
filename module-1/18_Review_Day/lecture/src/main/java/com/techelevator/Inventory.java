package com.techelevator;

import java.util.*;

public class Inventory {

    private Map<String, Home>  homesMap;

    public Inventory() {
        homesMap = new HashMap<>();
        loadHomes();
    }

    public List<Home> retrieveAllHomes() {

        List<Home> homes = new ArrayList<>();

        Set<String> keysInMap = homesMap.keySet();

        for (String key : keysInMap) {
            // grab the value out of the map and put the value in the list
            Home home = homesMap.get(key);
            homes.add(home);
        }


        return homes;

    }

    public void addHome (Home homeToAdd) {
        // TODO: implement me
    }

    public Home searchByMLSID (String mlsId) {
        // todo" build me
        return null;
    }

    public boolean deleteHome (String mlsId) {
        //todo
        return false;
    }


    private void loadHomes() {

        Address address1 = new Address("123 Elm Street", "Columbus", "Ohio", "43017");
        Home home1 = new Home("ABC123", 4, 4, address1);;
        home1.setListingPrice(40000.00);
        home1.setDescription("This is a house that needs work!");
        home1.setSquareFeet(2000);
        homesMap.put(home1.getMlsId(), home1);


        Address address2 = new Address("1223 Oak Street", "Columbus", "Ohio", "43022");
        Home home2 = new Home("ABC456", 2, 3, address2);;
        home2.setListingPrice(60000.00);
        home2.setDescription("This is a house in the middle of a street");
        home2.setSquareFeet(2500);
        homesMap.put(home2.getMlsId(), home2);


    }



}
