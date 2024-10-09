package Assignment21;
import java.util.Scanner;
//Write a Java program to convert Integer value into Binary
public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num = sc.nextInt();
        System.out.println(num+" in binary is "+Integer.toBinaryString(num));
    }
}
