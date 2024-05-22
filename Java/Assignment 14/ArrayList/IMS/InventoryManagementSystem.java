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
}