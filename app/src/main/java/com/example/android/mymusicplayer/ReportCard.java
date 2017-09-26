package com.example.android.mymusicplayer;

import java.util.ArrayList;

/**
 * Created by guido on 27/06/2017.
 */

public class ReportCard {

    //Variables
    private static final String MATH = "Math";
    private static final String PHYSICS = "Physics";
    private static final String BIOLOGY = "Biology";

    private ArrayList<Integer> marksMath = new ArrayList<>();
    private ArrayList<Integer> marksPhysics = new ArrayList<>();
    private ArrayList<Integer> marksBiology = new ArrayList<>();
    private String studentName;

    //Constructors
    //simple
    public ReportCard(String studentName) {
        this.studentName = studentName;
    }

    //complete
    public ReportCard(ArrayList<Integer> marksMath, ArrayList<Integer> marksPhysics, ArrayList<Integer> marksBiology, String studentName) {
        this.marksMath = marksMath;
        this.marksPhysics = marksPhysics;
        this.marksBiology = marksBiology;
        this.studentName = studentName;
    }

    //setters
    public void setMarksMath(ArrayList<Integer> marksMath) {
        this.marksMath = marksMath;
    }

    public void setMarksPhysics(ArrayList<Integer> marksPhysics) {
        this.marksPhysics = marksPhysics;
    }

    public void setMarksBiology(ArrayList<Integer> marksBiology) {
        this.marksBiology = marksBiology;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //add grade
    public void addMarksMath(int grade) {
        this.marksMath.add(grade);
    }

    public void addMarksPhysics(int grade) {
        marksPhysics.add(grade);
    }

    public void addMarksBiology(int grade) {
        marksBiology.add(grade);
    }

    //average
    public double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        double average = sum / grades.size();
        return average;
    }

    //getters
    public ArrayList<Integer> getMarksMath() {
        return marksMath;
    }

    public ArrayList<Integer> getMarksPhysics() {
        return marksPhysics;
    }

    public ArrayList<Integer> getMarksBiology() {
        return marksBiology;
    }

    public double getAverageMath() {
        return calculateAverage(marksMath);
    }

    public double getAveragePhysics() {
        return calculateAverage(marksPhysics);
    }

    public double getAverageBiology() {
        return calculateAverage(marksBiology);
    }

    public String getStudentName() {
        return studentName;
    }

    private String getReport() {
        return toString();
    }

    //toString()
    @Override
    public String toString() {
        return "Student: " + getStudentName() + "\n" + MATH + ": " + getAverageMath() +
                "\n" + PHYSICS + ": " + getAveragePhysics() + "\n" + BIOLOGY + ": " + getAverageBiology();

    }


    //The Subject object for the different subjects

    private class Subject {

        //The name of the subject

        private String mSubjectName;

        //The grade reached by the student in the subject

        private int mSubjectGrade;

        /*Default constructor of the Subject object
        * @param subject is the name of the subject
        * @param grade is the grade reached by the student
        */

        private Subject(String subjectName, int subjectGrade) {
            mSubjectName = subjectName;
            mSubjectGrade = subjectGrade;
        }

        //Get the grade

        private int getGrade() {
            return mSubjectGrade;
        }

        //Set the grade

        private void setGrade(int grade) {
            mSubjectGrade = grade;
        }

        //Get the name

        private String getName() {
            return mSubjectName;
        }

        //Set the name

        private void setName(String name) {
            mSubjectName = name;
        }

    }

}