package com.techelevator.jghomes.services;

import com.techelevator.homes.model.Home;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class HomeClientService {

    private static final String API_BASE_URL = "http://localhost:8080/";
    private final RestTemplate restTemplate = new RestTemplate();



    /**
     * Retrieve a home based off of its mlsId
     */
    public Home getHomeByMLSID(String mlsId) {
        //TODO
        return null;
    }

    /**
     * Retrieve a List of all homes
     * (hint: web service returns an array of homes... how could you convert it to an ArrayList so you don't have to change
     *  the return type to a Home[]? - If you don't know, ask Google... ie. Don't change return type to an Home[])
     */
    public List<Home> retrieveAllHomes() {
         //TODO
        return null;
    }

    public Home addHome(Home newHome) {
        //TODO
        return null;
    }

    /**
     * Delete an existing home
     */
    public boolean deleteHome(int mlsId) {
        //TODO
        return false;
    }




}
