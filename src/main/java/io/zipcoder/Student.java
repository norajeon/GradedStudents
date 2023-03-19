package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student>{
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.examScores = new ArrayList<>();  // (Arrays.asList(testScores));

    for (int i = 0; i < testScores.length; i++) {
        this.examScores.add(testScores[i]);
    }

    }

    public Integer getNumberOfExamsTaken() {

        if(examScores != null) {
            return this.examScores.size();
        }
        return 0;
    }

    public String getExamScores() {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < examScores.size(); i++) {
             ans.append(examScores.get(i) + "\n");
        }
        return ans.toString();
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public void setExamScore(int examNumber, double newScore) {

        examScores.set(examNumber-1, newScore);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverageExamScore() {
        double sum = 0;
        for (int i = 0; i < examScores.size(); i++) {
            sum += examScores.get(i);
        }
        return sum/examScores.size();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name: " + this.firstName + " " + this.lastName +
                "\n > Average Score : " + this.getAverageExamScore() + "\n > Exam Scores: \n");
        int exam = 0;
        double examScore = 0;
        for(int i = 1; i <= examScores.size(); i++) {
            exam = i;
            examScore = examScores.get(i-1);
            sb.append(String.format("Exam %d -> %.2f \n", exam, examScore));
        }

    return sb.toString();

    }

    @Override
    public int compareTo(Student a) {
        if(this.getAverageExamScore() > a.getAverageExamScore()) {
            return -1;
        }
             else if (this.getAverageExamScore() < a.getAverageExamScore()) {
                 return 1;
             } else {
                String name1 = a.getLastName() + a.getFirstName();
                String name2 = this.getLastName() + this.getFirstName();
                return name1.compareTo(name2);
        }

    }

} //class
