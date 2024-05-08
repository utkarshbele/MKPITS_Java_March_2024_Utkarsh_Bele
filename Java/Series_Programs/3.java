//Java Program to Find Sum of the Series 1/1!+1/2!+1/3!+…1/N!
import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n terms");
        int n = scanner.nextInt();
        double sum=0;
        double factorial =1;
        //calculate factorial of n and divide 1 by the factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += (1/ factorial);
        }
        System.out.println("The sum of the series is "+sum);
    }
}