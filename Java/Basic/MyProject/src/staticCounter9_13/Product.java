package staticCounter9_13;
public class Product {
    // Static counter variable
    private static int instanceCounter = 0;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

        // Increment the static counter each time a new instance is created
        instanceCounter++;
    }

    // Static method to get the current count of instances
    public static int getInstanceCount() {
        return instanceCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

