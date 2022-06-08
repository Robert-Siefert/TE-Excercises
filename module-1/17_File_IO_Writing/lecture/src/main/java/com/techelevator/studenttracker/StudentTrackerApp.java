package com.techelevator.studenttracker;

import java.io.FileNotFoundException;
import java.util.List;

public class StudentTrackerApp {

    public static void main(String[] args) {

        StudentTrackerApp app = new StudentTrackerApp();
        app.run();

    }

    private void run() {


        //Create a reference to the UserInterface and FileReader
        FileReader reader = new FileReader();
        UserInterface ui = new UserInterface();

        //Call the ui to get the filename
        String fileName = ui.askUserForFileName();

        try {
            List<Student> students = reader.readStudentFile(fileName);
            ui.printStudents(students);
        }
        catch (FileNotFoundException ex ) {
            ui.printMessage("Bad file name");
        }
        catch (BobException bob) {
            ui.printMessage("we don't like bob");
        }




    }


}
