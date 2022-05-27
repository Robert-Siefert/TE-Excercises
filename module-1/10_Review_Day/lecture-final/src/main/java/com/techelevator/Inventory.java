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


        Home home1 = new Home();

        Address address1 = new Address();
        address1.setCity("Columbus");
        address1.setState("OH");
        address1.setStreetName("Elm Street");
        address1.setStreetNUmber("123");
        address1.setZip("43035");
        home1.setAddress(address1);
        home1.setHasBasement(true);
        home1.setHasHOA(true);
        home1.setMlsId("ABC123");
        home1.setNumberOfBathrooms(12.5);
        home1.setNumberOfBedrooms(5);
        home1.setPrice(5.56);

        homesMap.put(home1.getMlsId(), home1);


        Home home2 = new Home();

        Address address2 = new Address();
        address2.setCity("Columbus");
        address2.setState("OH");
        address2.setStreetName("Oak Street");
        address2.setStreetNUmber("456");
        address2.setZip("43099");
        home2.setAddress(address2);
        home2.setHasBasement(false);
        home2.setHasHOA(false);
        home2.setMlsId("ABC456");
        home2.setNumberOfBathrooms(12.5);
        home2.setNumberOfBedrooms(5);
        home2.setPrice(115.56);

        homesMap.put(home2.getMlsId(), home2);


     //   Home home3 = new Home("123222", 12, 100.00, address1);




    }



}
