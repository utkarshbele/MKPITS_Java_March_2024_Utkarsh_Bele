package Assinment14.ArrayList.IMS;

//Inventory management System
public class Product{
    private int productID;
    private String name;
    private int quantity;
    private double price;

    public Product(int productID, String name, int quantity, double price) {
        this.productID = productID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductID: " + productID +
                ", Name: " + name +
                ", Quantity: " + quantity+
                ", Price: " + price;
    }

}