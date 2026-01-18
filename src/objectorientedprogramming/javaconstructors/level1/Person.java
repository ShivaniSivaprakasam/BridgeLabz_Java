package objectorientedprogramming.javaconstructors.level1;
// Single-line comment: Person class demonstrating a copy constructor

/*
This Person class demonstrates:
1. Attributes: name and age
2. Parameterized constructor
3. Copy constructor to clone attributes from another Person object
4. Method to display person details
*/

class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }

    // Main method to test copy constructor
    public static void main(String[] args) {
        // Original person
        Person original = new Person("Alice", 25);
        System.out.println("Original Person:");
        original.displayDetails();

        System.out.println();

        // Cloned person using copy constructor
        Person clone = new Person(original);
        System.out.println("Cloned Person:");
        clone.displayDetails();
    }
}
