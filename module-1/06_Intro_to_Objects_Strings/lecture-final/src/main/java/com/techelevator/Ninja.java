package com.techelevator;

public class Ninja {

    //data - instance variables
    private boolean isVisible;
    private boolean canFight;
    private String name;
    private String favoriteWeapon;



    //methods - behaviors

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public boolean isCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteWeapon() {
        return favoriteWeapon;
    }

    public void setFavoriteWeapon(String favoriteWeapon) {
        this.favoriteWeapon = favoriteWeapon;
    }
}
