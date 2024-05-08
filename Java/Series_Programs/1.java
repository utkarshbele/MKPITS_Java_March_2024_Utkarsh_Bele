//Java Program to Find Sum of Series 1^2 + 2^2 + …. + n^2.
import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();
        int sum=0;
        //Basically run a loop for squaring every number(i) and adding their sum.
        for (int i=0; i<=n; i++)
        {
            sum+=(i*i);
        }
        System.out.println("The sum of series for "+n+" elements to the power of 2 is "+sum);
    }
}
//Sum of series = 1^2 + 2^2 + …. + n^2= n(n + 1)(2n + 1) / 6 OR sum+(number*number)