package objectorientedprogramming.encapsulation.level1;
/*
This program simulates a basic food delivery ordering system using encapsulation, inheritance, and interfaces.
It allows a user to:
1. Choose between Veg and Non-Veg food items.
2. Enter item details: name, price, and quantity.
3. Calculate the total price, apply discounts, and display the final price.
The FoodItem abstract class stores common information and declares a method to calculate total price.
VegItem and NonVegItem extend FoodItem and implement the Discountable interface for discount calculations.
The FoodDelivery class handles user input, processes orders, and prints item details along with discounts and final price.
*/

import java.util.Scanner;
// Created an interface
interface Discountable {
    double applyDiscount(double totalAmount);
    String getDiscountDetails();
}
// Created an abstract class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }
    // Creating a method for getting item details
    public void getItemDetails() {
        System.out.println("\nItem: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }
    public abstract double calculateTotalPrice();
}
// Extending a class
class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.10; // 10% discount
    }

    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}
// Extending a class
class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + (50 * getQuantity());
    }

    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.05; // 5% discount
    }

    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}
// Creating a main class called Food Delivery
public class FoodDelivery {
    // Create a method to process orders
    public static void processOrder(FoodItem item) {
        item.getItemDetails();

        double total = item.calculateTotalPrice();
        System.out.println("Total Price (before discount): ₹" + total);
        // Looping to display details
        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            double discount = d.applyDiscount(total);
            System.out.println(d.getDiscountDetails());
            System.out.println("Discount Amount: ₹" + discount);
            System.out.println("Final Price: ₹" + (total - discount));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting user input
        System.out.println("Choose Food Type:");
        System.out.println("1. Veg Item");
        System.out.println("2. Non-Veg Item");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        FoodItem item;
        // Looping to conform choice
        if (choice == 1) {
            item = new VegItem(name, price, qty);
        } else {
            item = new NonVegItem(name, price, qty);
        }
        processOrder(item);

    }
}
