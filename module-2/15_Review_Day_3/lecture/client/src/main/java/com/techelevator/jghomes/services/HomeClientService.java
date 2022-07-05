package com.techelevator.jghomes.services;

import com.techelevator.homes.model.Home;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


public class HomeClientService {

    private static final String API_BASE_URL = "http://localhost:8080/homes";
    private final RestTemplate restTemplate = new RestTemplate();



    /**
     * Retrieve a home based off of its mlsId
     */
    public Home getHomeByMLSID(String mlsId) {

        try {
            return restTemplate.getForObject(API_BASE_URL + "/" + mlsId,Home.class);
        }
        catch (RestClientResponseException ex){
            return null;
        }



    }

    /**
     * Retrieve a List of all homes
     * (hint: web service returns an array of homes... how could you convert it to an ArrayList so you don't have to change
     *  the return type to a Home[]? - If you don't know, ask Google... ie. Don't change return type to an Home[])
     */
    public List<Home> retrieveAllHomes() {
        try {
            Home[] homesArray = restTemplate.getForObject(API_BASE_URL,Home[].class);
            return Arrays.asList(homesArray);
        }
        catch (RestClientResponseException ex){
            return null;
        }



    }

    public Home addHome(Home newHome) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Home> entity = new HttpEntity<>(newHome,headers);

        return restTemplate.postForObject(API_BASE_URL,entity,Home.class);
    }

    /**
     * Delete an existing home
     */
    public boolean deleteHome(String mlsId) {
        boolean success = false;
        try {
            restTemplate.delete(API_BASE_URL+"/"+mlsId);
            success = true;
        }catch (RestClientResponseException ex){
            success = false;
        }

        return success;
    }




}
