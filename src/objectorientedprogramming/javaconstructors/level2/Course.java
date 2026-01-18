// Single-line comment: Course class with instance and class variables

/*
Course class demonstrates:
1. Instance variables: courseName, duration, fee
2. Class variable: instituteName (shared across all courses)
3. Instance method: displayCourseDetails() to show details of a specific course
4. Class method: updateInstituteName() to change the institute name for all courses
*/

class Course {
    String courseName;          // Instance variable
    int duration;               // Duration in weeks
    double fee;                 // Fee for the course
    static String instituteName = "Global Institute"; // Class variable

    // Parameterized constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " weeks");
        System.out.println("Fee            : $" + fee);
        System.out.println("Institute Name : " + instituteName);
    }

    // Class method to update institute name for all courses
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Creating courses
        Course c1 = new Course("Java Programming", 8, 500);
        Course c2 = new Course("Data Science", 12, 1200);

        // Display individual course details
        System.out.println("Course 1 Details:");
        c1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("Tech Academy");

        System.out.println("\nAfter updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}


