package ch773;

/*
 * Write a class called Course that represents a course taken at a school.
 * Represent each student using the modified Student class from the previous
 * programming project. Use an ArrayList in the Course to store the students
 * taking that course. The constructor of the Course class should accept only
 * the name of the course. Provide a method called addStudent that accepts one
 * Students parameter. Provide a method called average that computes and returns
 * the average of all students' test score average. Provide a method called roll
 * that prints all students in the course. Create a driver class with a main
 * method that creates a course, adds several students, prints a roll, and
 * prints the overall course test average.
 */

import java.util.*;

public class Course {

    String courseName;
    ArrayList<Student> students = new ArrayList<Student>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).average();
        }
        return (double) sum / (students.size());
    }

    public void roll() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
