package com.techelevator.jghomes.services;

import com.techelevator.homes.model.Home;
import com.techelevator.jghomes.exceptions.ServiceException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.rmi.ServerException;
import java.util.Arrays;
import java.util.List;


public class HomeClientService {

    private static final String API_BASE_URL = "http://localhost:8080/";
    private final RestTemplate restTemplate = new RestTemplate();



    /**
     * Retrieve a home based off of its mlsId
     */
    public Home getHomeByMLSID(String mlsId) throws ServiceException {

        Home home = null;
        try {
            home = restTemplate.getForObject(API_BASE_URL + "homes/" + mlsId, Home.class);
        }
        catch (ResourceAccessException ex) {
            ex.printStackTrace();
            throw new ServiceException(ex);
        }
        catch (RestClientResponseException ex1) {
            ex1.printStackTrace();
            throw new ServiceException(ex1);
        }
        return home;
    }

    /**
     * Retrieve a List of all homes
     * (hint: web service returns an array of homes... how could you convert it to an ArrayList so you don't have to change
     *  the return type to a Home[]? - If you don't know, ask Google... ie. Don't change return type to an Home[])
     */
    public List<Home> retrieveAllHomes() {

        Home[] homes = null;
        try {
            homes = restTemplate.getForObject(API_BASE_URL + "homes", Home[].class);
        }
        catch (ResourceAccessException ex) {
            ex.printStackTrace();
        }
        catch (RestClientResponseException ex1) {
            ex1.printStackTrace();
        }

        //convert array into a List
        return  Arrays.asList(homes);

    }

    public Home addHome(Home newHome) {

        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Home> entity = new HttpEntity<Home>(newHome, header);

        Home returnedHome = null;
        try {
             returnedHome = restTemplate.postForObject(API_BASE_URL + "/homes", entity, Home.class);
        }
        catch (ResourceAccessException ex) {
            ex.printStackTrace();
        }
        catch (RestClientResponseException ex1) {
            ex1.printStackTrace();
        }

        return returnedHome;
    }

    /**
     * Delete an existing home
     */
    public boolean deleteHome(String mlsId) {

        try {
            restTemplate.delete(API_BASE_URL + "/homes/" + mlsId);
            return true;
        }
        catch (ResourceAccessException ex) {
            return false;
        }
        catch (RestClientResponseException ex1) {
            return false;
        }
    }




}
