package Assignment21;
import java.util.Scanner;
//Write a Java Program to Find Sum of the Series 1/1! + 2/2! + 3/3! + ……N/N!
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num = sc.nextInt();
        double sum=0;
        double factorial=1;
        for(int i=1;i<=num;i++)
        {
            factorial =factorial *i;
            sum=sum+(i/factorial);
        }
        System.out.println("The sum of N/N! is "+sum);
    }
}
