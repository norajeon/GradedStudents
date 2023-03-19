package io.zipcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Classroom {
    Student[] students;
    private int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(Student[] students) {
        //The class Classroom should define an additional constructor which takes an argument of
        //Student[] representative of the collection of Student objects this Classroom will store.
        this.students = students;

    }

    public Classroom() {
        students = new Student[30];
//        The class Classroom should define a nullary
//        constructor which initializes the composite students
//        object to be an empty array of 30 Student objects.
    }

    public void addStudent(Student student) {
      int i = 0;
      for(Student stu : students) {
          if( stu == null) {
              students[i] = student;
              break;
          }
          i++;
        }
    }

    public void removeStudent(String firstName, String lastName) {
        for(Student stu : students) {
            if (stu.getFirstName().equals(firstName) && stu.getLastName().equals(lastName)) {
                stu = students[students.length-1];
                students[students.length-1] = null;
                }
            }

    }

    public void getStudentsByScore() {
       Arrays.sort(students);
    }

    public Student[] getStudents() {
        return this.students;
    }

    public double getAverageExamScore() {
        double ans = 0;
        for(Student stu : students) {
            ans += stu.getAverageExamScore();
        }
        return ans/students.length;
    }

    public HashMap<Character, Student[]> initialize(){
        HashMap<Character,Student[]> map = new HashMap<>();
        map.put('A', new Student[]{});
        map.put('B', new Student[]{});
        map.put('C', new Student[]{});
        map.put('D', new Student[]{});
        map.put('F', new Student[]{});
        return map;
    }

        public Map<Character, Student[]> getGradeBook() {
            Map<Character, Student[]> gradeBook = initialize();
            double avg = this.getAverageExamScore();
            for (Student stu : students) {
                if (stu.getAverageExamScore() > avg * 0.9) {
                    gradeBook.put('A', students);
                } else if (stu.getAverageExamScore() > avg * 0.71) {
                    gradeBook.put('B', students);
                } else if (stu.getAverageExamScore() > avg * 0.5) {
                    gradeBook.put('C', students);
                } else if (stu.getAverageExamScore() > avg * 0.11) {
                    gradeBook.put('D', students);
                } else {
                    gradeBook.put('F', students);
                }
            }
            return gradeBook;
        }




} //class
