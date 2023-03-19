package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

public class ClassroomTest {

    @Test
    public void testConstructorInt() {
        Classroom b = new Classroom(5);
        int a = b.getStudents().length;
        Assert.assertEquals(5, a);

    }

    @Test
    public void testNullary() {
        Double[] exam = {50.0, 25.0};
        Student stu = new Student("hi", "hello", exam);
        Classroom b = new Classroom();
        int length = b.getStudents().length;
        Assert.assertEquals(length, 30);
    }

    @Test
    public void testGetAverageExamScore() {
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();
        double ans = 125;

        System.out.println(output);
        Assert.assertEquals(ans, output, 0);
    }

    @Test
    public void testAddStudent() {
            // : Given
            int maxNumberOfStudents = 1;
            Classroom classroom = new Classroom(maxNumberOfStudents);
            Double[] examScores = { 100.0, 50.0, 250.0, 0.0 };
            Student student = new Student("Leon", "Hunter", examScores);

            // When
            Student[] preEnrollment = classroom.getStudents();
            classroom.addStudent(student);
            Student[] postEnrollment = classroom.getStudents();
            Student[] expectedEnrollment = new Student[]{student};

            // Then
            String preEnrollmentAsString = Arrays.toString(preEnrollment);
            String postEnrollmentAsString = Arrays.toString(postEnrollment);

            System.out.println("===========================");
            System.out.println(preEnrollmentAsString);
            System.out.println("===========================");
            System.out.println(postEnrollmentAsString);

            Assert.assertEquals(expectedEnrollment, postEnrollment);
    }

    @Test
    public void testGradeBook() {
        Student a = new Student("abc", "def", new Double[] {100.0});
        Student b = new Student("bcd", "cde", new Double[] {60.0});
        Student c = new Student("cde", "def", new Double[] {20.0});

        Classroom classroom = new Classroom(new Student[]{a, b, c});
        Map<Character, Student[]> gradeBook = classroom.getGradeBook();
        Student[] ab = new Student[]{a, b, c};

        Assert.assertEquals(ab, gradeBook.get('A'));


    }


}
