package objectorientedprogramming.javaconstructors.level1;
// Single-line comment: Circle class demonstrating constructor chaining

/*
This Circle class demonstrates:
1. A single attribute: radius.
2. Constructor chaining to initialize radius:
   - Default constructor sets radius to 1.0
   - Parameterized constructor allows user-defined radius
3. A method to calculate and display area.
*/

class Circle {
    double radius;

    // Default constructor: calls parameterized constructor with default value
    Circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area  : " + getArea());
    }

    // Main method to test constructors
    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        defaultCircle.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Circle customCircle = new Circle(5.0);
        customCircle.displayDetails();
    }
}
