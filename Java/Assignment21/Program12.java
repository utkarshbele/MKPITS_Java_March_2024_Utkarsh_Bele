package Assignment21;

import java.util.Arrays;

//Write a Java program to remove duplicate values from array
public class Program12 {
    public static void main(String[] args) {
        int[] array={7,5,7,5,6,2,1,4,5,6,8,9,5,36,5,16,5,4,6544,4,15,54,1,4,465,46,4685,46,64,64,64};
        Arrays.stream(array).distinct().forEach(n-> System.out.print(" "+n));
    }
}
