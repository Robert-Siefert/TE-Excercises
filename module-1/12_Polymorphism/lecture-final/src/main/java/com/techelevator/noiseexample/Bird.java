package com.techelevator.noiseexample;

public class Bird implements INoise{

    private boolean canFly;
    private boolean canSwim;
    private String[] colors;


    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String makeNoise() {
        return "Chirp Squack";
    }
}
