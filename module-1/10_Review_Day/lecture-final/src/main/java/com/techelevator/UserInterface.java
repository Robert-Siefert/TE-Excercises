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
        System.out.println("3. Search for a home by MLSId");
        System.out.println("4. Delete a home");
        System.out.println("5. Exit\n");

        System.out.println("Please enter your choice");

        return scanner.nextLine();


    }

    public void printHomes(List<Home> homesToPrint) {

        System.out.println("Here are the list of homes that are for sale: ");

        for (Home home : homesToPrint) {

            //print stuff
            System.out.println("MLS ID " + home.getMlsId());
            System.out.println("NUmber of Bathrooms: " + home.getNumberOfBathrooms());


            System.out.println("**********************************");
        }

    }

    public void printMessage(String message) {
        System.out.println(message);
    }




}
