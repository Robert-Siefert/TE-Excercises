package com.techelevator;

public class Television {
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void turnOff(){
        isOn = false;
    }
    public void turnOn(){
        isOn = true;
    }
    public void changeChannel(int newChannel) {
        if (isOn) {
            if (2 < newChannel && newChannel < 19) {
                currentChannel = newChannel;
            }
        }
    }
    public void channelUp(){
        if(isOn) {
            currentChannel++;
            if (currentChannel == 19) {
                currentChannel = 3;
            }
        }
    }
    public void channelDown() {
        if (isOn) {
            currentChannel--;
            if (currentChannel == 2) {
                currentChannel = 18;
            }
        }
    }
    public void raiseVolume(){
        if(isOn){
            currentVolume++;
        }
        // there is not a test to account for max volume
        if(currentVolume>10){
            currentVolume = 10;
        }
    }
    public void lowerVolume(){
        if(isOn){
            currentVolume--;
        }
        if(currentVolume<0){
            currentVolume=0;
        }

    }
}
