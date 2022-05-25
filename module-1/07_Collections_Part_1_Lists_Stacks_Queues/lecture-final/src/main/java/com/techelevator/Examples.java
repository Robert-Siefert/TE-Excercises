package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Examples {


    public static void main(String[] args) {

        // BE ABLE TO DECLARE A LIST OF VARIOUS TYPES
        List<String>  ninjaNames = new ArrayList<>();
        List<Integer> testScores = new ArrayList<>();
        List<Double> prices = new ArrayList<>();
        List<Ninja> ninjaGroup = new ArrayList<>();

        //BE ABLE TO PUT THINGS IN THE LIST
        ninjaNames.add("Dylan");  //0
        ninjaNames.add("Julia");  //1
        ninjaNames.add("Tigist"); //2
        ninjaNames.add("Aman");   //3
        ninjaNames.add("Tony");   //4
        ninjaNames.add("Rob");    //5


        //BE ABLE TO ADD AN ELEMENT AT A SPECIFIC INDEX
        ninjaNames.add(1, "Ashiyan");

        //LISTS TAKE REFERENCE TYPES - THIS NEXT LINE BOXES THE int INTO AN Integer
        testScores.add(6);   // behind the scenes is java takes the int and converts to Integer
        prices.add(1.50);


        //BE ABLE TO GET THINGS OUT OF A LIST
        String dylan = ninjaNames.get(0);
        System.out.println(dylan);

        //BE ABLE TO GET THE SIZE OF A LIST
        int ninjaListSize = ninjaNames.size();
        System.out.println(ninjaListSize);

        // tests to see if list is empty
        if (ninjaNames.isEmpty()) {
            //do something cool here....
        }

        // HARD WAY TO LOOP - USING WHILE
//        int counter = 0;
//        while (!ninjaNames.isEmpty()) {    //tests to see if list is not empty
//            //continue processing until finished
//           // ninjaNames.remove(counter);
//            counter++;
//        }

        //another way to test list size
        if (ninjaNames.size() == 0) {

        }

        //BE ABLE TO LOOP THROUGH A LIST USING A STANDARD FOR-LOOP  (OK)
        for (int i = 0; i < ninjaNames.size(); i++) {
            //print out each element
            System.out.println(ninjaNames.get(i));
        }

        System.out.println("*****************************");

        //BE ABLE TO LOOP THROUGH A LIST USING AN ENHANCED FOR-LOOP (BETTER)
        for (String name : ninjaNames) {    // for each 'String' in the list ninjaNames
            System.out.println(name);
        }


        //BE ABLE TO SEE IF LIST CONTAINS A CERTAIN VALUE
        for (String name : ninjaNames) {    // for each 'String' in the list ninjaNames
            if (name.equals("Aman")) {
                System.out.println("We found " + name + " He was hiding in the list like he is in the back of class");
                break;
            }
        }

        if (ninjaNames.contains("Aman")) {
            System.out.println("We found Aman at index: " + ninjaNames.indexOf("Aman"));

        }



        //NICE TO KNOW - BE ABLE TO REVERSE A LIST
        Collections.reverse(ninjaNames);

        for(String n : ninjaNames) {
            System.out.println(n);
        }

        System.out.println("*****************************");

        //NICE TO KNOW - BE ABLE TO SORT A LIST IN ASCENDING ORDER
        // Collections.sort(nameOfList)  will modify the original list
        Collections.sort(ninjaNames);

        for(String n : ninjaNames) {
            System.out.println(n);
        }


        //Loop through prices

        for (Double price : prices) {
            double priceAsPrimitive = price.doubleValue();

        }


        //HELPFUL FOR HOMEWORK - BE ABLE TO CONVERT AN ARRAY INTO A LIST
        String[] names = new String[] {"A", "B", "C", "D"};
        List<String> nameList = new ArrayList<>();
        for (int i=0; i < names.length; i++) {
            nameList.add(names[i]);
        }

        //HELPFUL FOR FUTURE LAZINESS - BE ABLE TO CONVERT A LIST INTO AN ARRAY (EASY WAY)
        String[] newNinjaArray = ninjaNames.toArray(new String[0]);



    }

}
