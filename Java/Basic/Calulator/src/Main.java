import java.util.Scanner;
import calc.*;
public class Main
{
    public static void main(String args[])
    {
        Cal_methods cal = new Cal_methods();
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("Enter first number");
        int firstNumber = scan.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scan.nextInt();

        int choice, result;
        System.out.println("Here are your options:");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");

        System.out.print("What would you like to do?: ");
        choice = scan.nextInt();
        switch(choice)
        {
            case 1:
                result =cal.add(firstNumber, secondNumber);
                System.out.println("Addition is "+result);
                break;
            case 2:
                result =cal.subtract(firstNumber, secondNumber);
                System.out.println("Subtraction is "+result);
                break;
            case 3:
                result =cal.multiply(firstNumber, secondNumber);
                System.out.println("Multiplication is "+result);
                break;
            case 4:
                result =cal.divide(firstNumber, secondNumber);
                System.out.println("Division is "+result);
                break;
        }

    }
}
