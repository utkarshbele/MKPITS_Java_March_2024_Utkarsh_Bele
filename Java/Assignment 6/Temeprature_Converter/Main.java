import java.util.Scanner;
import degree.*;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        double result, num;
        Converter con = new Converter();
        Scanner scan = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("Here are your options:");
        System.out.println("1) Celsius to Fahrenheit");
        System.out.println("2) Fahrenheit to Celsius");
        int choice = scan.nextInt();
        System.out.println("Enter the Temperature");
        num = scan.nextDouble();
        switch(choice)
        {
            case 1:
                result =con.c_F(num);
                System.out.println(num + "degree Celsius to Fahrenheit is "+result+"degree");
                break;
            case 2:
                result =con.f_C(num);
                System.out.println(num + "degree Fahrenheit to Celsius is "+result+"degree");
                break;
            default:
                System.out.println("You entered wrong option");
    }}}
