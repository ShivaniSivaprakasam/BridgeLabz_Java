package objectorientedprogramming.javaconstructors.level3;
// Single-line comment: Employee and Manager demonstration

/*
Employee Management System:
1. Employee class with:
   - public employeeID
   - protected department
   - private salary
2. Public method to modify/get salary
3. Manager subclass demonstrates access to public and protected members
*/

class Employee {
    public int employeeID;      // Public: accessible anywhere
    protected String department; // Protected: accessible in subclass
    private double salary;      // Private: accessible only in this class

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : ₹" + salary);
    }
}

// Subclass demonstrating access to public and protected members
class Manager extends Employee {
    private int teamSize;

    Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Display manager details
    public void displayManagerDetails() {
        System.out.println("\n--- Manager Details ---");
        System.out.println("Employee ID : " + employeeID);     // public
        System.out.println("Department  : " + department);    // protected
        System.out.println("Salary      : ₹" + getSalary());  // private via getter
        System.out.println("Team Size   : " + teamSize);
    }
}

// Main class to test
public class EmployeeSystem {
    public static void main(String[] args) {
        // Creating Employee object
        Employee e1 = new Employee(101, "Finance", 50000);
        e1.displayEmployeeDetails();

        // Modify salary
        e1.setSalary(55000);
        e1.displayEmployeeDetails();

        // Creating Manager object
        Manager m1 = new Manager(201, "IT", 80000, 5);
        m1.displayManagerDetails();
    }
}
