package com.techelevator.polymorphismbyinterfaces;

public class Frisbee implements Flyable {


    @Override
    public boolean fly(String destination) {

        if (destination.equals("air")) {
            return true;
        }
        return false;
    }
}
