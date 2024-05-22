package Assinment14.LinkedList.COM;

public class Order implements Comparable<Order>
{
    int orderId ,quantity;
    String customerName, product, orderDate;

    public Order(int orderId, String customerName, String product,int quantity, String orderDate) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.customerName = customerName;
        this.product = product;
        this.orderDate = orderDate;
    }

//Getters
    public int getQuantity() {
        return quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProduct() {
        return product;
    }

    public String getOrderDate() {
        return orderDate;
    }

    //Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", quantity=" + quantity +
                ", customerName='" + customerName + '\'' +
                ", product='" + product + '\'' +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }

    @Override
    public int compareTo(Order order) {
        return orderDate.compareTo(((Order)order).orderDate);
    }
}
