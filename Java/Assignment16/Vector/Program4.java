package Assignment16.Vector;

import java.util.Vector;

//Create a Java program that manipulates two vectors, performing operations like vector addition,
// subtraction, scalar multiplication, and dot product calculation using the Vector class.
public class Program4 {

    public static void main(String[] args) {
        Vector<Integer> vector1 =new Vector<Integer>();
        //adding elements
        vector1.add(25);
        vector1.add(17);
        vector1.add(12);
        vector1.add(10);
        vector1.add(96);
        Vector<Integer> vector2 =new Vector<>();
        vector2.add(1);
        vector2.add(3);
        vector2.add(24);
        vector2.add(68);
        vector2.add(69);
        //addition
        vector1.addAll(vector2);
        System.out.println(vector1);
        //subtraction
        vector1.removeAll(vector2);
        System.out.println(vector1);
        //scalar multiplication
        int scalar = 3;
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < vector1.size(); i++) {
            result.add(vector1.get(i) * scalar);
        }
        System.out.println("Scalar Multiplication"+result);
        //Dot product
        int[] vector3={25,17,12,10,96};
        int[] vector4={1,3,24,69,68};
        double dotProduct = 0.0;
        for (int i = 0; i < vector3.length; i++) {   //both vectors should be of same length
            dotProduct += vector3[i] * vector4[i];
        }
        System.out.println("Vector1: " + java.util.Arrays.toString(vector3));
        System.out.println("Vector2: " + java.util.Arrays.toString(vector4));
        System.out.println("Dot product of vectors: " + dotProduct);
    }
}
