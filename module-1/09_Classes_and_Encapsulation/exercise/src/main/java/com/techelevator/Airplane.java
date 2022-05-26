package com.techelevator;

public class Airplane {

    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;




    public Airplane(String planeNumber, int totalFirstClassSeats,int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalCoachSeats = totalCoachSeats;
        this.totalFirstClassSeats = totalFirstClassSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }
    public int getAvailableFirstClassSeats(){
        return totalFirstClassSeats - bookedFirstClassSeats;
    }
    public int getAvailableCoachSeats(){
        return totalCoachSeats - bookedCoachSeats;
    }
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats){
        if (forFirstClass && totalNumberOfSeats > this.getAvailableFirstClassSeats()) {
            return false;
        }
        else if (!forFirstClass && totalNumberOfSeats > this.getAvailableCoachSeats()) {
            return false;
        }
        else if (forFirstClass) {
            bookedFirstClassSeats += totalNumberOfSeats;
            return true;
        }
        else {
            bookedCoachSeats += totalNumberOfSeats;
            return true;
        }

    }
}
