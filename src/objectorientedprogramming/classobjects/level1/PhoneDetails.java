package objectorientedprogramming.classobjects.level1;
/*
 * This program demonstrates the use of classes and objects in Java.
 * 
 * 1. The MobilePhone class stores information about a mobile phone: brand, model, and price.
 *    - It has a constructor to initialize these fields.
 *    - Getter methods provide access to the fields.
 *    - Setter methods allow updating the fields, with validation for price (>0).
 *
 * 2. The PhoneDetails class displays the details of a MobilePhone object.
 *    - The phoneDetails method prints the brand, model, and price of the phone.
 *    - In the main method, user input is taken to create a MobilePhone object,
 *      and its details are displayed.
 */

import java.util.Scanner;
// Created mobile phone class
class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
// Created a main class phone details
public class PhoneDetails {

    public static void phoneDetails(MobilePhone mobilePhone) {
        System.out.println("Brand: " + mobilePhone.getBrand());
        System.out.println("Model: " + mobilePhone.getModel());
        System.out.println("Price: " + mobilePhone.getPrice());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter your mobile phone brand: ");
        String brand = input.nextLine();

        System.out.print("Enter your mobile phone model: ");
        String model = input.nextLine();

        System.out.print("Enter your mobile phone price: ");
        double price = input.nextDouble();

        MobilePhone mobilePhone = new MobilePhone(brand, model, price);
        // Calling methods
        phoneDetails(mobilePhone);

        input.close();
    }
}
