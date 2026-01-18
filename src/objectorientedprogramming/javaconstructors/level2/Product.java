package objectorientedprogramming.javaconstructors.level2;
// Single-line comment: Product class with instance and class variables

/*
Product class demonstrates:
1. Instance variables: productName, price
2. Class variable: totalProducts (shared across all products)
3. Instance method: displayProductDetails()
4. Class method: displayTotalProducts()
*/

class Product {
    String productName;           // Instance variable
    double price;                 // Instance variable
    static int totalProducts = 0; // Class variable shared by all objects

    // Parameterized constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;          // Increment totalProducts for each new product
    }

    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : $" + price);
    }

    // Class method to display total number of products
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Creating products
        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Smartphone", 800);

        // Display individual product details
        System.out.println("Product 1 Details:");
        p1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        p2.displayProductDetails();

        System.out.println();
        // Display total products created
        Product.displayTotalProducts();
    }
}
