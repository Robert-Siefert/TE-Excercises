package com.techelevator;

public class HelloWorld {
    public static void main(String[] args) {
        String name = "Rob";
        double myHourlyRate = 3.50;
        int numberOfHoursWorked = 40;
        double paycheck = myHourlyRate*numberOfHoursWorked;
        int currentAge = 32;
        int numberOfLeapYears = currentAge/4;

        System.out.println("Hello " + name);
        System.out.println("My hourly rate is " + myHourlyRate);
        System.out.println("weekly earnings is " + paycheck);
        System.out.println(numberOfLeapYears);

    }
}

