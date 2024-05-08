//Java Program to Find Sum of the Series 1/1+1/4+1/9+…1/N^2
import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n terms");
        int n = scanner.nextInt();
        double sum=0;
        //divide 1 by the square of the value of i till n
        for (double i=1; i<=n; i++)
        {
            sum+=1/(i*i);
        }
        System.out.println("The sum is "+sum);
    }
}