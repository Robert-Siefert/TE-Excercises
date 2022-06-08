package com.techelevator.studenttracker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentTrackerApp {

    //Create a reference to the UserInterface and FileReader
    private String outputFile = "new_student_file.txt";
    private ReportWriter reportWriter = new ReportWriter(outputFile);
    private UserInterface ui = new UserInterface();
    private FileReader reader = new FileReader();

    public static void main(String[] args) {

        StudentTrackerApp app = new StudentTrackerApp();
        app.run();

    }

    private void run() {


        // This is where the loop/menu handling

        //Call the ui to get the filename
        String inputFileName = ui.askUserForFileName();
        ui.printStudents(readStudentFile(inputFileName));   //calling private method below and take the result to pass to UI

        Student student = ui.askUserForStudentInformation();
        writeToFile(student);    //call private method below


    }

    private List<Student> readStudentFile(String inputFileName) {


        List<Student> students = new ArrayList<>();
        try {
            students = reader.readStudentFile(inputFileName);

        }
        catch (FileNotFoundException ex ) {
            ui.printMessage("Bad file name");
        }


        return students;
    }


    private void writeToFile(Student student) {
        try {
            reportWriter.writeStudentDataToFile2(student, outputFile);    //send to report writer
        }
        catch (FileNotFoundException ex ) {
            ui.printMessage("Bad file name");
        }
        catch (IOException ex1) {
            ui.printMessage("Something bad happened call tech support");
        }
    }


}
