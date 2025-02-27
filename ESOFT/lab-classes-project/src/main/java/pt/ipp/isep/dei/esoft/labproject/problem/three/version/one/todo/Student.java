package pt.ipp.isep.dei.esoft.labproject.problem.three.version.one.todo;

import java.sql.Struct;

public class Student {

    // Attributes
    private int number;
    private String name;
    private int grade;
    private boolean didEvaluation = false;
    // Constructor
    public Student(int number, String name) {
        if (!isValidNumber(number)) {
            throw new IllegalArgumentException("Student number needs to be 7 digits number (e.g. 1190001).");
        }
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Student name cannot be shorter than 5 chars.");
        }
        this.number = number;
        this.name = name;
        this.grade = 0;
        //throw new UnsupportedOperationException(); //it means that the constructor is not implemented yet
        //TODO: Students should implement this constructor
    }

    // Operations
    private boolean isValidNumber(int number) {
        if (number < 0) {
            return false;
        }
        if (number > 9999999) {
            return false;
        }
        return true;
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
    }
    private boolean isValidName(String name) {
        if (name == null) {
            return false;
        }
        if (name.trim().isEmpty()) {
            return false;
        }
        if (name.length() < 5) {
            return false;
        }
        return true;
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
    }

    private boolean isValidGrade(int grade) {

        if (grade < 0 || grade > 20) {
            return false;
        }
        return true;
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
    }

    private boolean isEvaluated() {
        return didEvaluation;
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
    }

    public void doEvaluation(int grade) {
        this.grade = grade;
        didEvaluation = true;
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
    }

    public boolean isApproved() {
        return (this.grade >= 10);
    }
}