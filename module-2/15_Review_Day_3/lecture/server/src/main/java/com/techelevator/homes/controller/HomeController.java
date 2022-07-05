package com.techelevator.homes.controller;


import com.techelevator.homes.dao.HomeDAO;
import com.techelevator.homes.dao.JDBCHomeDAO;
import com.techelevator.homes.exception.HomeNotFoundException;
import com.techelevator.homes.model.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/homes")
public class HomeController {

    @Autowired
    private HomeDAO dao;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path="", method= RequestMethod.POST)
    public Home addHome(@RequestBody @Valid Home homeToAdd) {

        return dao.addHome(homeToAdd);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path="/{id}", method= RequestMethod.DELETE)
    public void deleteHome(@PathVariable String id) throws HomeNotFoundException {

        dao.deleteHome(id);
    }

    @RequestMapping(path = "",method =  RequestMethod.GET)
    public List<Home> retrieveHomes(){

        return dao.retrieveHomesForSale();

    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Home getHomeById(@PathVariable String id) throws HomeNotFoundException {
        return  dao.retrieveHomeByMLSId(id);
    }





}
