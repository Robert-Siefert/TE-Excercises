package com.techelevator.polymorphismbyinterfaces;

public class Superman implements Flyable{


    public boolean fly(String destination) {

        if (destination.equals("tall buildings")) {
            return true;
        }
        return false;
    }

}
