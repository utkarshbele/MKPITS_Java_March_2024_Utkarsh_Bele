package Assignment21;
import java.util.Scanner;
//Prime or not
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num = sc.nextInt();
        int flag=0;
        for (int i=2;i<=num/2;i++) {
            if (num % i==0)
            {
                System.out.println(num+" is not a prime number");
                flag=1;
                break;
            }
        }
        if (flag==0)
        {
            System.out.println(num + " is a prime number");
        }
    }
}