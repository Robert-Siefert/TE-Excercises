package com.techelevator;

public class MovieRental {
    private String title;
    private String format;
    private boolean isPremium;
    private double rentalPrice;

    public MovieRental(String title, String format, boolean isPremium){
        this.title = title;
        this.format = format;
        this.isPremium = isPremium;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public double getRentalPrice() {
        if (format.equals("VHS")) {
            rentalPrice = .99;
        }
        else if (format.equals("DVD")) {
            rentalPrice = 1.99;
        } else if (format.equals("BLUERAY")) {
            rentalPrice = 2.99;
        }
        if (isPremium) {
            rentalPrice += 1;
        }
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

   public String toString(){
       String toString = "MOVIE: " + title +" - " + "FORMAT: " + format + " PRICE: $" + this.getRentalPrice();
        return toString;
   }


}




