package com.techelevator.studenttracker;

public class BobException extends Exception {

   private String specialMessage;
   private int errorCode = 418;

    public String getSpecialMessage() {
        return specialMessage;
    }

    public void setSpecialMessage(String specialMessage) {
        this.specialMessage = specialMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
