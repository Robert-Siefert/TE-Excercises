package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
    public String getLetterGrade(){
        double gradePercent = (double)earnedMarks/(double)possibleMarks;
        if (gradePercent>= .90) {
            return "A";
        }
        if (gradePercent>= .80) {
            return "B";
        }
        if (gradePercent>= .70) {
            return "C";
        }
        if (gradePercent>= .60) {
            return "D";
        }
        return  "F";
    }
    }
