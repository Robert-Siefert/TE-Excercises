package com.techelevator.jgcalc;

public class Calculator {

    //member variables, aka instance variables, aka class variables, aka properties
    private String brand;
    private String model;
    private boolean isOn;

    // methods that do the main work of the calculator (add, subtract, etc)

    public int add(int x, int y) {
        return x + y;
    }

    public int add(int[] numbers) {

        int sum = 0;

        for (int i = 0; i< numbers.length; i++) {
            sum += numbers[i];     // same as sum = sum + numbers[i]
        }

        return sum;

    }

    public int subtract (int bigNum, int littleNum) {
        return bigNum - littleNum;
    }





    // Getters and Setters
       // allow access to the member variables
       // always public


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
