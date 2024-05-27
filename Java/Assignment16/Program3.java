package Assignment16;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Program3 {
    public static int searchElement(Vector<Integer> vector, int element) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == element) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static int linearSearch(Vector<Integer> vector, int element) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == element) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    public static int binarySearch(Vector<Integer> vector, int element) {
        int left = 0;
        int right = vector.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (vector.get(mid) == element) {
                return mid; // Element found, return its index
            } else if (vector.get(mid) < element) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<Integer>();
        //adding elements
        vector.add(25);
        vector.add(17);
        vector.add(12);
        vector.add(10);
        vector.add(96);
        vector.add(1);
        vector.add(3);
        vector.add(24);
        vector.add(68);
        //searches for a specific element within a vector using the Vector class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose search method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        int searchElement = 8;

        switch (choice) {
            case 1:
                linearSearch(vector, searchElement);
                break;
            case 2:
                Collections.sort(vector);
                binarySearch(vector, searchElement);
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}
