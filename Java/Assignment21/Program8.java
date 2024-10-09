package Assignment21;
import java.util.Arrays;

//Write a Java Program to Count the Number of Occurrence of a number in an Array
public class Program8 {
    public static void main(String[] args) {
       int[] array={7,5,7,5,6,2,1,4,5,6,8,9,5,36,5,16,5,4,6544,4,15,54,1,4,465,46,4685,46,64,64,64};
       int num=64;
       long count=Arrays.stream(array).filter(n->n==num).count();
       System.out.println("The number of times "+num+" occurs is "+count);
    }
}
