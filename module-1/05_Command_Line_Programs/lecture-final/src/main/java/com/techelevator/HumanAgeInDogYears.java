package com.techelevator;


import java.sql.SQLOutput;
import java.util.Scanner;

public class HumanAgeInDogYears {

    public static void main(String[] args) {

        //need to calculate age in dog years 7 dog years = 1 human year

        Scanner myInputScanner = new Scanner(System.in);

        /************************** EXAMPLE 1 *****************************/

        System.out.println("How old are you human?");
        String answer = myInputScanner.nextLine();        //reads the entire string typed up to (and including newline)

        System.out.println(answer);


        int humanAge = Integer.parseInt(answer);   //converts the string value to its int value (must be a number)
        int ageInDogYears = 7 * humanAge;
        System.out.println("You are " + ageInDogYears + " old in dog years");


        /************************** EXAMPLE 2 *****************************/
        // Do the same example but using nextInt

        System.out.println("APPROACH2: Enter your age in human years ");

        int ageOfHuman = myInputScanner.nextInt();     // reads the int value only (NOT the newline)
        myInputScanner.nextLine();                     // reads the extra junk newline from the input stream and discards...

        System.out.println("Enter your favorite band:");
        String fav = myInputScanner.nextLine();

        System.out.println("I am here");


        /************************** EXAMPLE 3  *****************************/

        System.out.println("Enter a series of human ages separated by commas");
        String values = myInputScanner.nextLine();
        System.out.println("Starting " + values);

        String[] inputValues = values.split(",");

        for (int i = 0; i < inputValues.length; i++) {

            // calculate and print each human age in dog years
            String tempValue = inputValues[i];
            int valueAsInt = Integer.parseInt(tempValue);

            System.out.println(valueAsInt * 7);
        }




    }


}
