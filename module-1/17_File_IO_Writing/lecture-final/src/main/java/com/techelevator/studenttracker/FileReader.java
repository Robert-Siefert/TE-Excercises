package com.techelevator.studenttracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {



    public List<Student> readStudentFile(String fileName) throws FileNotFoundException {

        //read in the file, and convert each record into a student object and add student object to the List
        List<Student> students = new ArrayList<>();

        //Creates a file object that represents the info about the file
        File file = new File(fileName);

        //Create a File Scanner and connected it to the file.
//        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                // read in each row as a (String) record
                String record = scanner.nextLine();

                //parse the record into individual strings and assign to a Student object
                String[] fields = record.split(",");

                Student student = new Student();
                student.setFirstName(fields[0]);
                student.setLastName(fields[1]);
                student.setAge(Integer.parseInt(fields[2]));
                student.setGpa(Double.parseDouble(fields[3]));

               //add Student object to the list
                students.add(student);
            }

//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }



        return students;

    }


}
