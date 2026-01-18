package objectorientedprogramming.classobjects.level1;
/*
 * This program demonstrates the use of classes and objects in Java for inventory tracking.
 * 
 * 1. The Item class stores information about an inventory item: item code, item name, and price.
 *    - It has a constructor to initialize these fields.
 *    - Getter methods allow access to the fields.
 *    - Setter methods allow updating the fields, with validation for price (>0).
 *
 * 2. The TrackInventory class performs operations on an Item object.
 *    - The itemDisplay method prints the item's name, code, and price.
 *    - The itemPice method calculates the total price based on user-provided quantity.
 *    - In the main method, user input is taken to create an Item object,
 *      its details are displayed, and the total price is calculated and shown.
 */

import java.util.Scanner;
// Created a class named item
class Item{
    int itemCode;
    String itemName;
    double price;
    public Item(int itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public int getItemCode(){
        return this.itemCode;
    }
    public String getItemName(){
        return this.itemName;
    }
    public double getPrice(){
        return this.price;
    }
    public int setItemCode(int itemCode){
        return this.itemCode;
    }
    public String setItemName(String itemName){
        return this.itemName;
    }
    public double setPrice(double price){
        if ( price > 0 ){
            this.price = price;
        }
        return price;
    }
}
// Created a main class called track inventory
public class TrackInventory {
    public static double itemPice(Item item){
        System.out.print("Enter quantity: ");
        int quantity = new Scanner(System.in).nextInt();
        double totalPrice = item.getPrice()*quantity;
        return totalPrice;
    }
    public static void itemDisplay(Item item){
        System.out.println("Item Name: " + item.getItemName());
        System.out.println("Item Code: " + item.getItemCode());
        System.out.println("Item Price: " + item.getPrice());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter item name: ");
        String name = input.nextLine();
        System.out.print("Enter item code: ");
        int code = input.nextInt();
        System.out.print("Enter item price: ");
        double price = input.nextDouble();
        Item item = new Item(code, name, price);
        // Calling method
        itemDisplay(item);
        double result = itemPice(item);
        System.out.println("The total price of the item is: " + result);
    }
}
