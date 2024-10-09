package staticCounter9_13;

public class Main {
    // Main method for testing
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);
        Product product3 = new Product("Tablet", 299.99);

        // Display the number of instances created
        System.out.println("Number of Product instances created: " + Product.getInstanceCount());
    }
}
