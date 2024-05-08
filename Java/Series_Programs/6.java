//Java Program to Generate Harmonic Series
import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = scanner.nextInt();
        double result=0;
        System.out.println("The harmonic series is: ");
        //loop runs from n to 0, calculating and displaying all the harmonic values
        for (int i = n; i > 0; i--) {
            result += (double)1 / i;
            System.out.print(result+", ");
        }
    }
}