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


    public Student askUserForStudentInformation() {

        Student newStudent = new Student();

        System.out.println("Please enter the student's first name: ");
        String firstName = inputScanner.nextLine();
        newStudent.setFirstName(firstName);

        System.out.println("Please enter the student's last name: ");
        String lastName = inputScanner.nextLine();
        newStudent.setLastName(lastName);

        System.out.println("Please enter the student's age");
        int age = inputScanner.nextInt();
        inputScanner.nextLine();
        newStudent.setAge(age);

        System.out.println("Please enter the student's GPA: ");
        double gpa = inputScanner.nextDouble();
        inputScanner.nextLine();
        newStudent.setGpa(gpa);

        return newStudent;
    }


}
