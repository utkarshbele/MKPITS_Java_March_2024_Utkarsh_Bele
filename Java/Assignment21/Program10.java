package Assignment21;

import java.util.Scanner;

//Write a Java program to convert days into Year, Months and Days
public class Program10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number of days");
        int days=sc.nextInt();
        int years= days/365;
        int months=(days%365)/30;
        int day=(days%365)%30;
        System.out.println(days+" Days is "+years+" years "+months+" months "+day+" days ");
    }
}
