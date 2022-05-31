package com.techelevator;

public class Home {

    private String mlsId;
    private int numberOfBedrooms;
    private double numberOfBathrooms;
    private boolean hasBasement;
    private boolean hasHOA;
    private double price;
    private Address address;

    public Home () {

    }

    public Home (String mlsId, int numberOfBedrooms, double price, Address address) {
        this.mlsId = mlsId;
        this.numberOfBedrooms = numberOfBedrooms;
        this.price = price;
        this.address = address;


    }

    public String getMlsId() {
        return mlsId;
    }

    public void setMlsId(String mlsId) {
        this.mlsId = mlsId;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(double numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public boolean isHasBasement() {
        return hasBasement;
    }

    public void setHasBasement(boolean hasBasement) {
        this.hasBasement = hasBasement;
    }

    public boolean isHasHOA() {
        return hasHOA;
    }

    public void setHasHOA(boolean hasHOA) {
        this.hasHOA = hasHOA;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
