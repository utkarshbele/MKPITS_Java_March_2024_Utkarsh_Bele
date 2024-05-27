package Assignment16;

import java.util.Vector;

//Vector Operations: Implement a Java program that performs various operations on a vector,such as
// adding elements,removing elements, finding the size of the vector, and displaying its contents
public class Program1 {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        //adding elements
        vector.add(25);
        vector.add(17);
        vector.add(12);
        vector.add(10);
        vector.add(96);
        vector.add(1);
        vector.add(3);
        //removing elements
        vector.remove(1);
        //size
        System.out.println("Size of the vector is "+vector.size());
        //display
        System.out.println(vector);
    }
}
