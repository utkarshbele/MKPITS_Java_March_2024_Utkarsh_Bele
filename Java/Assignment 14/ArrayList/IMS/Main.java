package Assinment14.ArrayList.IMS;

public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();

        // Adding products to the inventory
        inventorySystem.addProduct(new Product(1, "Laptop", 10, 999.99));
        inventorySystem.addProduct(new Product(2, "Smartphone", 20, 499.99));
        inventorySystem.addProduct(new Product(3, "Tablet", 15, 299.99));
        inventorySystem.addProduct(new Product(4, "flexTab", 150, 600.00));
        // Updating quantity of a product
        inventorySystem.updateQuantity(7, 30);

        // Removing a product
        inventorySystem.removeProduct(6);

        // Displaying all products
        inventorySystem.displayAllProducts();

        //Sorting
        inventorySystem.sortCollectionOnPrice();
    }
}
