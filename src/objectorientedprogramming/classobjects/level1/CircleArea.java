package objectorientedprogramming.classobjects.level1;
/*
 * This program demonstrates the use of classes and objects in Java.
 * 
 * 1. The Circle class stores the radius of a circle as a private field.
 *    It has a constructor to initialize the radius, a getter to access it,
 *    and a setter to update it (only if the value is positive).
 *
 * 2. The CircleArea class calculates and displays the area of a Circle object.
 *    - The area method takes a Circle object and returns its area using the formula π*r^2.
 *    - In the main method, the user inputs the radius, a Circle object is created,
 *      and its area is printed.
 */

import  java.util.Scanner;
// Created a circle class
class Circle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        if (radius > 0){
            this.radius = radius;
        }
    }
}
// Created a main class called circle area
public class CircleArea{
    public static double area(Circle circle){
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        return area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of circle: " + area(circle));
    }
}
