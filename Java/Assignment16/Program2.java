package Assignment16;
import java.util.*;

//Write a Java program that sorts a vector of integers in ascending order using the Vector class.
//Implement sorting algorithms such as bubble sort, selection sort, or insertion sort
public class Program2 {
    public static void bubbleSort(Vector<Integer> vector) {
        int n = vector.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector.get(j) > vector.get(j + 1)) {
                    // Swap vector[j] and vector[j+1]
                    int temp = vector.get(j);
                    vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, temp);
                }
            }
        }
    }
    public static void insertionSort(Vector<Integer> vector) {
        int n = vector.size();
        for (int i = 1; i < n; i++) {
            int key = vector.get(i);
            int j = i - 1;

            while (j >= 0 && vector.get(j) > key) {
                vector.set(j + 1, vector.get(j));
                j = j - 1;
            }
            vector.set(j + 1, key);
        }
    }
    public static void selectionSort(Vector<Integer> vector) {
        int n = vector.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vector.get(j) < vector.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap vector[i] and vector[minIndex]
            int temp = vector.get(minIndex);
            vector.set(minIndex, vector.get(i));
            vector.set(i, temp);
        }
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
        //sorted in ascending order
        Collections.sort(vector);
        System.out.println(vector);
        //Bubble sort
        bubbleSort(vector);
        System.out.println(vector);
        //selection sor
        selectionSort(vector);
        System.out.println(vector);
        //insertion sort
        insertionSort(vector);
        System.out.println(vector);

    }
}
