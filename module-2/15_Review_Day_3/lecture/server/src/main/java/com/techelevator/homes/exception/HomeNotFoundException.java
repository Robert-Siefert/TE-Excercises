package com.techelevator.homes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Home not found.")
public class HomeNotFoundException extends Exception{

    public HomeNotFoundException(){
        super("Home not Found");
    }
}
