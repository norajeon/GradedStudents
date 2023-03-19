package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetNumberOfExamsTaken() {
        Double[] examScore = {100.0, 200.0};
        int expectedExamTaken = 2;

        Student student = new Student("", "", examScore);
        int actual = student.getNumberOfExamsTaken();

        Assert.assertEquals(actual, expectedExamTaken);
    }

    @Test
    public void testAddExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

// When
        student.addExamScore(100.0);
        String output = student.getExamScores();
        String exam = "100.0\n";

// Then
        System.out.println(output);
        Assert.assertEquals(exam, output);
    }

    @Test
    public void testSetExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

// When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();
        String exam = "150.0\n";

// Then
        System.out.println(output);
        Assert.assertEquals(exam, output);
    }

    @Test
    public void testGetExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test
    public void testGetAverageExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double output = student.getAverageExamScore();
        Double answer = 125.0;

        // Then
        System.out.println(output);
        Assert.assertEquals(answer, output);
    }

    @Test
    public void testToString() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);
    }

}