package objectorientedprogramming.classobjects.level1;
/*
 * This program demonstrates the use of classes and objects in Java.
 * 
 * 1. The Employee class stores information about an employee: name, ID, and salary.
 *    - It has a constructor to initialize these fields.
 *    - Getter methods allow access to the fields.
 *    - Setter methods allow updating the fields, with validation for salary (>0).
 *
 * 2. The EmployeeDetails class displays the details of an Employee object.
 *    - The employeeDisplay method prints the employee's name, ID, and salary.
 *    - In the main method, user input is taken to create an Employee object,
 *      and its details are displayed.
 */

import java.util.Scanner;
// Created a class names employee
class Employee{
    String name;
    String id;
    double salary;
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setSalary(double salary){
        if (salary > 0) {     // validation
            this.salary = salary;
        }
    }
}
// Created a main class employee details
public class EmployeeDetails{
    public static void employeeDisplay(Employee employee){
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: " + employee.getSalary());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter Employee name: ");
        String name = input.nextLine();
        System.out.print("Enter Employee ID: ");
        String id = input.nextLine();
        System.out.print("Enter Employee salary: ");
        double salary = input.nextDouble();
        Employee employee = new Employee(name,id,salary);
        // Calling method
        employeeDisplay(employee);
    }
}
