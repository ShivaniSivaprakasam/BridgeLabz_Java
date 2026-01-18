package objectorientedprogramming.javaconstructors.level3;
// Single-line comment: Student and PostgraduateStudent demonstration

/*
Student Management System:
1. Student class with:
   - public rollNumber
   - protected name
   - private CGPA
2. Public methods to access/modify CGPA
3. PostgraduateStudent subclass demonstrates access to public and protected members
*/

class Student {
    public int rollNumber;      // Public: accessible anywhere
    protected String name;      // Protected: accessible in subclass
    private double CGPA;        // Private: accessible only in this class

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
    }
}

// Subclass demonstrating access to public and protected members
class PostgraduateStudent extends Student {
    private String researchArea;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String researchArea) {
        super(rollNumber, name, CGPA);
        this.researchArea = researchArea;
    }

    // Display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("\n--- Postgraduate Student Details ---");
        System.out.println("Roll Number  : " + rollNumber);       // public
        System.out.println("Name         : " + name);            // protected
        System.out.println("CGPA         : " + getCGPA());      // private via getter
        System.out.println("Research Area: " + researchArea);
    }
}

// Main class to test
public class StudentSystem {
    public static void main(String[] args) {
        // Creating Student object
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayStudentDetails();

        // Modify CGPA
        s1.setCGPA(8.8);
        s1.displayStudentDetails();

        // Creating PostgraduateStudent object
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 9.2, "Artificial Intelligence");
        pg1.displayPostgraduateDetails();
    }
}

