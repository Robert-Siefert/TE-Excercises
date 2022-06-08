package com.techelevator;

import java.util.*;

public class Inventory {

    private Map<String, Home>  homesMap;

    public Inventory() {
        HomeFileReader reader = new HomeFileReader();
        this.homesMap = reader.loadHomesFromFile();
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
        homesMap.put(homeToAdd.getMlsId(), homeToAdd);
    }

    public Home searchByMLSID (String mlsId) {
        // todo" build me
        return null;
    }

    public boolean deleteHome (String mlsId) {
        //todo
        return false;
    }





}
