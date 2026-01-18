package objectorientedprogramming.nonaccessmodifiers.level1;
/*
This program demonstrates the use of non-access modifiers: static and final in Java.
It defines an Employee class with:
1. A static companyName shared by all employees.
2. A final id that cannot be changed once assigned.
3. A private static totalEmployees counter to track the number of Employee objects.

The Employee class has methods to:
- Display individual employee details.
- Display the total number of employees using a static method.

The main class EmployeeManagement:
- Gets user input for employee name and designation.
- Creates an Employee object.
- Displays employee details and total employees.
*/

import  java.util.Scanner;
// Created a class called Employee
class Employee{
    static String companyName = "HiAnime";
    String name;
    final int id;
    String designation;
    private static int totalEmployees = 0;
    Employee(String name, String designation, int id){
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }
    // Created a method 
    static void displayTotalEmployees(){
        System.out.println("Total Employees: " +totalEmployees);
    }
    // Created a method to display methods
    public void display(){
        System.out.println("Company Name: " +companyName);
        System.out.println("Name: " +name);
        System.out.println("Designation: " +designation);
        System.out.println("ID: " +id);
    }
}
// Created a main class called employee management
public class EmployeeManagement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Getting user input
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();
        Employee employee = new Employee(name, designation, 12345);
        // Calling method
        if (employee instanceof Employee){
            employee.display();
            Employee.displayTotalEmployees();
        }
    }
}
