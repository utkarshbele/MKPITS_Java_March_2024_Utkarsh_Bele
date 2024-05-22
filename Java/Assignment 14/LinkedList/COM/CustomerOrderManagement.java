package Assinment14.LinkedList.COM;
import java.util.Collections;
import java.util.LinkedList;

public class CustomerOrderManagement {
    public static LinkedList<Order> orderLinkedList = new LinkedList<Order>();
    public static void addOrder(int orderId, String customerName, String product, int quantity, String orderDate)
        {
            orderLinkedList.add(new Order(orderId, customerName, product, quantity, orderDate));
            System.out.println("Order added successfully.");
        }
        //update the quantity based on order id
        public static void updateQuantity(int orderId, int quantity) {
            for (Order order : orderLinkedList) {
                if (order.getOrderId() == orderId) {
                    order.setQuantity(quantity);
                    System.out.println("Order Quantity updated successfully.");
                    break;
                }
            }
            System.out.println("Order not found");
        }
        //remove order based on order id
        public static void removeOrder(int orderId) {
            boolean found = false;
            for (Order order : orderLinkedList) {
                if (order.getOrderId() == orderId)
                {
                    System.out.println("Order removed Successfully:");
                    System.out.println(order);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Order not found.");
            }
        }

        public static void displayOrder() {
            if (orderLinkedList.isEmpty()) {
                System.out.println("No Orders to display.");
            } else {
                //Sort Orders by order date
                Collections.sort(orderLinkedList);
                for (Order order : orderLinkedList) {
                    System.out.println(order);
                }
            }
        }
    }