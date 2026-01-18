package objectorientedprogramming.javaconstructors.level2;
// Single-line comment: Vehicle class with instance and class variables

/*
Vehicle class demonstrates:
1. Instance variables: ownerName, vehicleType
2. Class variable: registrationFee (shared across all vehicles)
3. Instance method: displayVehicleDetails() to show details of a specific vehicle
4. Class method: updateRegistrationFee() to change the registration fee for all vehicles
*/

class Vehicle {
    String ownerName;                  // Instance variable
    String vehicleType;                // Instance variable
    static double registrationFee;     // Class variable shared by all vehicles

    // Parameterized constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Vehicle Type    : " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Setting initial registration fee
        Vehicle.updateRegistrationFee(150.0);

        // Creating vehicle objects
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");

        // Display vehicle details
        System.out.println("Vehicle 1 Details:");
        v1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(200.0);

        System.out.println("\nAfter updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
