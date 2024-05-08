//Java Program to Add the nth Square Series
import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = scanner.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i);
        }
        System.out.println("The sum of the square of the entered "+n+" terms is "+sum);
    }
}