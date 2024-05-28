package Assignment16.Vector;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Program3 {
//    public static void searchElement(Vector<Integer> vector, int element) {
//        for (int i = 0; i < vector.size(); i++) {
//            if (vector.get(i) == element) {
//                System.out.println(i);
//            }
//        }
//    }

    public static int linearSearch(Vector<Integer> vector, int target) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == target) {
                return i; // Target found
            }
        }
        return -1; // Target not found
    }

    public static int binarySearch(Vector<Integer> vector, int target) {
        int left = 0;
        int right = vector.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = vector.get(mid);

            if (midVal == target) {
                return mid; // Target found
            } else if (midVal < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
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
        int searchElement = 24;

        switch (choice) {
            case 1:
                int index = linearSearch(vector, searchElement);
                if (index != -1) {
                    System.out.println("Target " + searchElement + " found at index: " + index);
                } else {
                    System.out.println("Target " + searchElement + " not found in the vector.");
                }
                break;
            case 2:
                Collections.sort(vector);
                int index1 = binarySearch(vector, searchElement);
                if (index1 != -1) {
                    System.out.println("Target " + searchElement + " found at index: " + index1);
                } else {
                    System.out.println("Target " + searchElement + " not found in the vector.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}
