package objectorientedprogramming.classobjects.level2;
/*
This program simulates a student report system.
It allows a user to:
1. Enter student details: name, roll number, and marks.
2. Determine the student's grade based on marks.
3. Display the student's details and grade.
The Student class stores student information, and StudentReport handles grade calculation and display.
*/

import java.util.Scanner;
// Created a student class
class Student {
    private String name;
    private String rollNumber;
    private float marks;

    public Student(String name, String rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
// Created a main class student report
public class StudentReport {

    public static void studentMarks(Student student) {
        float marks = student.getMarks(); // use getter
        if (marks > 90 && marks <= 100) {
            System.out.println("Student grade: O");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Student grade: A+");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("Student grade: A");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("Student grade: B+");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("Student grade: B");
        } else if (marks > 40 && marks <= 50) {
            System.out.println("Student grade: C");
        } else if (marks >= 0 && marks <= 40) {
            System.out.println("Student grade: Fail");
        } else {
            System.out.println("Invalid marks");
        }
    }
    // Method to display result
    public static void studentDisplay(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Roll Number: " + student.getRollNumber());
        System.out.println("Student Marks: " + student.getMarks());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Student Roll Number: ");
        String rollNumber = input.nextLine();
        System.out.print("Enter Student Marks: ");
        float marks = input.nextFloat();
        Student student = new Student(name, rollNumber, marks);
        // Calling method
        studentMarks(student);
        studentDisplay(student);
    }
}

