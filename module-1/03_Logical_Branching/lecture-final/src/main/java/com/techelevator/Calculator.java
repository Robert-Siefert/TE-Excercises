package com.techelevator;

public class Calculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator();   //skip for now

        int product = calc.multiply(2, 2);
        System.out.println("Result = " + product);

        product = calc.multiply(4, 2);
        System.out.println("Result = " + product);

        String grade = calc.calculateLetterGrade(95, false);
        System.out.println(grade);

        grade = calc.calculateLetterGrade(83, true);
        System.out.println(grade);

    }

    /**
     * This method multiplies 2 numbers
     *
     * @param num1
     * @param num2
     * @return integer value after multiplication
     */
    public int multiply(int num1, int num2) {
        System.out.println();
        return num1 * num2;
    }


    public String calculateLetterGrade(int score, boolean isTeachersPet) {

        String grade = "";

        if (isTeachersPet) {
            return "A";
        }


        if (score >= 90) {
            grade = "A";
        }
        else if (score >= 80 && score <90) {
            grade = "B";
        }
        else {
            grade = "unknown. please finish the rest some other time";
        }

        return grade;



    }


}
