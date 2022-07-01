package com.techelevator.jghomes.exceptions;

public class ServiceException extends Exception{

    public ServiceException(Exception e){
        super("Something Bad Service Exception", e);
    }

}
