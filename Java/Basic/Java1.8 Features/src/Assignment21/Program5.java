package Assignment21;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            sum=sum+(i*i);
        }
        System.out.println("The sum of "+num+" square numbers is "+sum);
    }
}
