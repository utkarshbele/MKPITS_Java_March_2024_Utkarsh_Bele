package Assinment14.ArrayList.IMS;
import java.util.ArrayList;
import java.util.Collections;
//Simple Inventory Management System using array list
public class InventoryManagementSystem {
    ArrayList<Product> inventory = new ArrayList<Product>();

    // Add a new product to the inventory
    public void addProduct(Product product) {
        inventory.add(product);
    }

    // Update the quantity of an existing product
    public void updateQuantity(int productID, int newQuantity) {
        for (Product product : inventory) {
            if (product.getProductID() == productID) {
                product.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("Product with ID " + productID + " not found.");
    }

    // Remove a product from the inventory by productID
    public void removeProduct(int productID) {
        for (Product product : inventory) {
            if (product.getProductID() == productID) {
                inventory.remove(product);
                return;
            }
        }
        System.out.println("Product with ID " + productID + " not found.Therefor, update not done");
    }

    // Displaying all products
    public void displayAllProducts() {
        System.out.println("Inventory:");
        for (Product product : inventory) {
            System.out.println(product);
        }
        System.out.println();
    }

    //Sorting using Comparator interface on "price" key
    public void sortCollectionOnPrice()
    {
        System.out.println("Inventory Sorted on the basis of Price is: ");
        Collections.sort(inventory,new PriceComparator());
        for(Product product: inventory)
        {
            System.out.println(product);
        }
    }

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