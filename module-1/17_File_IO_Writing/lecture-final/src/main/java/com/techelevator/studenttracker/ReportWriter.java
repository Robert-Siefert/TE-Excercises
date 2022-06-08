package com.techelevator.studenttracker;

import java.io.*;

public class ReportWriter {

    private File reportFile;

    public ReportWriter(String fileName) {

        reportFile = new File(fileName);
    }

    // this version will overwrite the file each time the program runs
    public void writeStudentDataToFile(Student student) throws FileNotFoundException {

        //write the data to a file
        try (PrintWriter writer = new PrintWriter(reportFile)) {
            writer.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge() + " " + student.getGpa());
        }

    }

    // This version will append to the end of the file each time
    public void writeStudentDataToFile2(Student student, String outputFile) throws FileNotFoundException, IOException {

            try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile, true)))) {
                writer.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge() + " " + student.getGpa());
            }

    }




}
