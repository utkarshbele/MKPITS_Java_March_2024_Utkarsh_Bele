package emp;

import java.util.Scanner;
public class Employee
{
    private int id, salary;
    private String name;
    Scanner scanner = new Scanner(System.in);

    public void employeeDetails()
    {
        System.out.print("Please enter your employee id: ");
        id = scanner.nextInt();
        System.out.print("Please enter your employee Name: ");
        name = scanner.next();
        System.out.print("Please enter your employee Salary: ");
        salary = scanner.nextInt();
    }
    public void employeeDisplay()
    {
        System.out.println("Your Employee ID is: "+id);
        System.out.println("Your Employee Name is: "+name);
        System.out.println("Your Employee Salary is: "+salary);
    }

    public void greaterThan()
    {
        int a,b;
        System.out.println("Please enter 2 numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a>b)
            System.out.println(a+" is greater");
        else
            System.out.println((b+" is greater"));
    }

    public void totalDigits()
    {
        int count=0;
        System.out.println("Type a number:");
        long number = scanner.nextLong();
        while(number!=0)
        {
            number = number/10;
            count++;
        }
        System.out.println("The total number of digits in this number are:" +count);
    }

    public int sumArray(int[] num)
    {
        int sum=0, i;
        for(i=0; i< num.length; i++)
        {
            sum = sum + num[i];
        }
        return sum;
    }

    public void evenOdd()
    {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

    public void factorialNum()
    {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; i++)
        {
            factorial = factorial * i;
        }
        System.out.printf("Factorial of "+num+" is =" +factorial);
    }

    public void fiboNum()
    {
        long i=1,a,b,c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of fibonacci values needed : ");
        long num = scanner.nextLong();

        a=0;
        b=1;
        System.out.println("The fibonacci series is : ");
        do
        {
            i++;
            System.out.print(" "+a);
            c = a+b;
            a=b;
            b=c;

        }
        while(i<=num);
    }

    public void exponentNum()
    {
        long i,z=1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long x = scanner.nextLong();
        System.out.print("Enter the power: ");
        long y = scanner.nextLong();
        for(i=1; i<=y; i++)
        {
            z= z*x;
        }

        System.out.println("The powered number is : " +z);
    }


    public static char[] alphabets={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    public static char[] masked_alphabets={ 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };

    public static String encryptedString(String str)
    {

        String encrypt_str="";
        for(int i=0; i<str.length();i++)
        {
            for(int j=0;j<26; j++)
            {
                if(str.charAt(i) == alphabets[i])
                {
                    encrypt_str= encrypt_str + masked_alphabets[j];
                    break;
                }
                if(str.charAt(i)<'a' || str.charAt(i)>'z')
                {
                    encrypt_str=encrypt_str + str.charAt(i);
                    break;
                }
            }
        }
        return encrypt_str;
    }
    public static String decryptString(String str)
    {
        String decrypt_str ="";
        for(int i=0; i<str.length();i++)
    {
        for(int j=0;j<26; j++)
        {
            if(str.charAt(i) == masked_alphabets[j])
            {
                decrypt_str = decrypt_str + alphabets[j];
                break;
            }
            if(str.charAt(i)<'A' || str.charAt(i)>'Z')
            {
                decrypt_str = decrypt_str + str.charAt(i);
                break;
            }
        }
    }
        return decrypt_str;
    }
}
