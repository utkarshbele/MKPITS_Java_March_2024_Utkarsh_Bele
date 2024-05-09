import programs.*;
import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AllPrograms num = new AllPrograms();

		//Program 1 to check whether the string is a palindrome or not
        System.out.println("Please enter a String");
        String str= input.next();
        num.palindromeString(str);

		//Program 2 to calculate factorial
        System.out.println("Please enter a Number for factorial");
        int num1= input.nextInt();
        int ans = num.factorialCal(num1);
        System.out.println("The factorial of "+num1+" is "+ans);

		//Program 3
        System.out.println("Please enter a Number for FizzBuzz");
        int num2= input.nextInt();
        System.out.println("The Fizz, Buzz, and FizzBuzz numbers are: ");
        num.fizzBuzz(num2);

       
		//Program 4 for Binary search
        System.out.println("Please enter the number of elements you want");
        int num4= input.nextInt();
        System.out.println("Please enter an Array");
        int[] arr= new int[num4];
        for(int i=0; i<num4;i++)
        {
            arr[i]= input.nextInt();
        }
        System.out.println("Please enter a Number");
        int num5= input.nextInt();
        System.out.println(num.binarySearch(arr, num5));


		//Program 5 for matrix multiplication
        System.out.println("Please enter the number of rows and columns needed for matrix multiplication");
        System.out.println("Enter number of rows");
        int row= input.nextInt();
        System.out.println("Enter number of columns");
        int col= input.nextInt();
        System.out.println("Enter the elements of first matrix");
        int row1, col1, row2, col2, i, j;
        int [] num1={};
        num.printMatrix();
    }
}



