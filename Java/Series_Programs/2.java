//Java Program to Find Sum of the Series 1/1! + 2/2! + 3/3! + ……1/N!
import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n terms");
        int n = scanner.nextInt();
        double sum=0;
        double factorial =1;
        //loop will run till n terms and simply divide the number by its factorial.
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += (i/ factorial);
        }
        System.out.println("The sum of the series is "+sum);
    }
}