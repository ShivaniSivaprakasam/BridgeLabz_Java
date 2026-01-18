package objectorientedprogramming.nonaccessmodifiers.level2;
/*
This program demonstrates the use of non-access modifiers: static and final in Java.
It defines a Vehicle class with:
1. A final registrationNumber that cannot be changed once assigned.
2. A static registrationFee shared by all vehicles.
3. A static method updateRegistrationFee() to modify the registration fee.
4. A static method displayDetails() to display vehicle information.

The main class Registration:
- Gets user input for registration fee, vehicle details.
- Creates a Vehicle object.
- Displays the details of the entered vehicle including the shared registration fee.
*/

import java.util.Scanner;
// Created a vehicle class
class Vehicle {
    static double registrationFee = 0.0;
    String ownerName;
    String vehicleType;
    final int registrationNumber;

    Vehicle(int registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newRegistrationFee) {
        if (newRegistrationFee > 0) {
            registrationFee = newRegistrationFee;
        }
    }
    // Created method
    static void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Object is not a Vehicle");
        }
    }
}
// Created a main class called regestration
public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter registration fee: ");
        Vehicle.updateRegistrationFee(sc.nextDouble());
        System.out.print("Enter Registration Number: ");
        int regNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Owner Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();
        Vehicle v1 = new Vehicle(regNo, name, type);
        // Calling method
        Vehicle.displayDetails(v1);
    }
}

