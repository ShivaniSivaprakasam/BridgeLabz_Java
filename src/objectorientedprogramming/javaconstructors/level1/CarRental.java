package objectorientedprogramming.javaconstructors.level1;
// Single-line comment: CarRental class for Car Rental System

/*
CarRental class demonstrates:
1. Attributes: customerName, carModel, rentalDays
2. Default, parameterized, and copy constructors
3. Method to calculate total rental cost
4. Method to display rental details
*/

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay;

    // Default constructor
    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Generic";
        this.rentalDays = 1;
        this.ratePerDay = 100; // default rate
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays, double ratePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.ratePerDay = ratePerDay;
    }

    // Copy constructor
    CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.ratePerDay = other.ratePerDay;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    // Method to display rental details
    void displayRental() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Rate per Day  : $" + ratePerDay);
        System.out.println("Total Cost    : $" + calculateTotalCost());
    }

    // Main method to test CarRental class
    public static void main(String[] args) {
        // Using default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRental();

        System.out.println();

        // Using parameterized constructor
        CarRental rental1 = new CarRental("Alice", "Toyota Camry", 5, 150);
        System.out.println("Rental 1:");
        rental1.displayRental();

        System.out.println();

        // Using copy constructor
        CarRental rental2 = new CarRental(rental1);
        rental2.customerName = "Bob"; // modify name for new customer
        System.out.println("Rental 2 (Copied from Rental 1):");
        rental2.displayRental();
    }
}
