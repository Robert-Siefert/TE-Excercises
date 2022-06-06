package com.techelevator.studenttracker;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner inputScanner;


    public UserInterface () {
        inputScanner = new Scanner(System.in);
    }

    public String askUserForFileName() {

        System.out.println("Please enter the filename for the student file");
        return inputScanner.nextLine();

    }

    public void printStudents(List<Student> studentsList) {

        for (Student student : studentsList) {

            System.out.println(student.getFirstName() + " " + student.getLastName() + " age: " + student.getAge() + " has a gpa of: " + student.getGpa());
        }

    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }


}
