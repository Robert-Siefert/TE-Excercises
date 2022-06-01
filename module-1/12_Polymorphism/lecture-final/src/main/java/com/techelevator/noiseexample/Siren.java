package com.techelevator.noiseexample;

public class Siren implements INoise, ISellable {


    public String makeNoise() {
        return "Wee ewe Wee oooh";
    }

    @Override
    public int getInventoryCount() {
        return 0;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
