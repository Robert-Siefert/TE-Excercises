package com.techelevator;

import java.util.List;
import java.util.Scanner;

public class UserInterface {


    private Scanner scanner ;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public String displayMenu() {

        System.out.println("Welcome to Vinny's Slumlord Application");
        System.out.println("***************************************\n");

        System.out.println("1. List all Homes For Sale");
        System.out.println("2. Add a home");
        System.out.println("3. Search");
        System.out.println("4. Delete a home");
        System.out.println("5. Exit\n");

        System.out.println("Please enter your choice");

        return scanner.nextLine();


    }


    public String displaySubMenu() {

        System.out.println("Welcome to our custom search sub-menu");
        System.out.println("***************************************\n");

        System.out.println("1. Search By MLS ID");
        System.out.println("2. Search By Zip Code");
        System.out.println("3. Return to Previous Menu\n");

        System.out.println("Please enter your choice");

        return scanner.nextLine();


    }

    /**
     * This method loops through the list of homes and then for each home calls the printHome() method below.
     *
     * @param homes
     */
    public void printHomes(List<Home> homes) {

        for (Home home : homes) {
            printHome(home);
        }

    }


    /**
     * This method prints out a single home.  We 'could' have put this up in the for each loop above, but breaking
     * it out on it's own keeps the code above cleaner AND we can also reuse when printing out a single home with the search
     * option.
     *
     * @param home
     */
    public void printHome(Home home) {


        System.out.println("\nMLS Number: " + home.getMlsId());

        if (home.getAddress() != null) {
            System.out.println("Street Address: "
                    + home.getAddress().getAddressLine1() + " "
                    + home.getAddress().getCity() + " "
                    + home.getAddress().getState() + " "
                    + home.getAddress().getZip() + "\n");
        }

        System.out.println(String.format("%-25s %s", "Bedrooms: ", home.getNumberOfBedrooms()));
        System.out.println(String.format("%-25s %s", "Bathrooms: ", home.getNumberOfBathrooms()));
        System.out.println(String.format("%-25s %s", "Square Feet: ", home.getSquareFeet()));
        System.out.println(String.format("%-25s $%s", "Price: ", String.format("%.2f", home.getListingPrice())));
        System.out.println("\nDescription: " + home.getDescription());

    }

    public void printStatusMessage(String message) {
        System.out.println(message);
    }


    public void printMessage(String message) {
        System.out.println(message);
    }




}
