import banking9_5.CurrentAccount;
import banking9_5.SavingsAccount;
import calc9_6.Calculator;
import const9_10.Constants;
import ems9_11.HourlyEmployee;
import ems9_11.SalariedEmployee;
import geometric9_9.Cube;
import geometric9_9.Cylinder;
import geometric9_9.Sphere;
import interface9_4.*;
import multiinterface.C;
import java.lang.String;
import paracons.Z;
import programs.*;
import calculate.*;
import interfaceeg.*;
import java.util.Scanner;
import java.lang.Math;
import shape9_1.*;
import final9_2.*;
import string9_3.StringUtils;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AllPrograms num = new AllPrograms();
 /*
        Circle c=new Circle();
        c.radius(5);
        System.out.println(c.area());
        System.out.println(c.perimeter());
        Rectangle rec=new Rectangle();
        rec.sides(5,8);
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        Triangle tri=new Triangle();
        tri.side(5,10);
        System.out.println(tri.area());
        System.out.println(tri.perimeter());


        //default constructors inheritance
       // C c= new C();
       // c.disp();

        //Paramaterized constructors with inheritance
       // Z z=new Z(100,200,300);

        //interface eg
        //Sub s = new Sub();
        //System.out.println(s.calculate(10,5));

        //interface exteding eg
       // C c=new C();
       // c.display1();
       // c.display2();

        //AllPrograms.disp();

        Calculation cal;
        System.out.println("Enter 2 numbers");
        int a= input.nextInt();
        int b= input.nextInt();
        System.out.println("your choice is 1)Addition, 2)Subtract, 3)Division, 4)Multiply");
        int choice= input.nextInt();
        switch(choice)
        {
            case 1:
                cal=new Addition();
                int res= cal.calculate(a,b);
                System.out.println(res);
            case 2:
                cal=new Substraction();
                int res1= cal.calculate(a,b);
                System.out.println(res1);
            case 3:
                cal=new Division();
                int res2= cal.calculate(a,b);
                System.out.println(res2);
            case 4:
                cal=new Multiplication();
                int res3= cal.calculate(a,b);
                System.out.println(res3);
        }

        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        AllPrograms.checkPrime(n);

        System.out.println("Please enter a String");
        String str= input.next();
        num.palindromeString(str);


        System.out.println("Please enter a Number for factorial");
        int num1= input.nextInt();
        int ans = num.factorialCal(num1);
        System.out.println("The factorial of "+num1+" is "+ans);


        System.out.println("Please enter a Number for FizzBuzz");
        int num2= input.nextInt();
        System.out.println("The Fizz, Buzz, and FizzBuzz numbers are: ");
        num.fizzBuzz(num2);

        System.out.println("Please enter a String");
        String str= input.next();
        num.palindromeString(str);

        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2);

        int [] arr={54,51,6598,56,8,5,8,5,6,789};
        //for each loop
        for(int i:arr)
        {
            System.out.print("\t"+i);
        }

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



        System.out.println("Please enter the number of rows and columns needed for matrix multiplication");
        System.out.println("Enter number of rows");
        int row= input.nextInt();
        System.out.println("Enter number of columns");
        int col= input.nextInt();
        System.out.println("Enter the elements of first matrix");
        int row1, col1, row2, col2, i, j;
        int [] num1={};
        num.printMatrix();


//String class
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String mStr3="Hello how are you";
        String myStr4="Nice";
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 3);
        System.out.println(myStr2);

        myStr2=myStr2.copyValueOf(myStr1);
        System.out.println(myStr2);

        int res=myStr4.codePointAt(0);
        System.out.println(res);

        int result = myStr4.codePointCount(0, 3);
        System.out.println(result);

        String firstName = "Utkarsh ";
        String lastName = "Bele";
        System.out.println(firstName.concat(lastName));

        System.out.println(mStr3.contentEquals("how"));
        System.out.println(mStr3.contentEquals("Hello how are you"));


        System.out.println(Math.max(3, 15));
        System.out.println(Math.min(3, 5));
        System.out.println(Math.sqrt(121));
        System.out.println(Math.pow(3, 5));
        System.out.println(Math.round(15.8566));
        System.out.println(Math.subtractExact(3, 15));
        System.out.println(Math.negateExact(15));
        System.out.println(Math.multiplyExact(15,15));
        System.out.println(Math.ceil(0.60));
        System.out.println(Math.floor(0.60));

        MathConstants mc = new MathConstants();
        System.out.println(mc.pi);
        System.out.println(mc.e);

        StringUtils su=new StringUtils();
        su.stringUtils();

        Dog d=new Dog();
        d.eat();
        d.sleep();
        d.make_Sound();
        Cat cat=new Cat();
        cat.eat();
        cat.sleep();
        cat.make_Sound();
        Bird b=new Bird();
        b.eat();
        b.sleep();
        b.make_Sound();

        SavingsAccount sa= new SavingsAccount();
        sa.deposit(100000);
        sa.withdraw(5000);
        sa.balanceInquiry();
        CurrentAccount ca= new CurrentAccount();
        ca.deposit(15000);
        ca.withdraw(2000);
        ca.balanceInquiry();


        Calculator cal= new Calculator();
        cal.add(6);


        Sphere sp=new Sphere();
        sp.getRadius(5.5);
        System.out.println(sp.area());
        System.out.println(sp.perimeter());
        System.out.println(sp.volume());

        Cube cu= new Cube();
        cu.getSide(12);
        System.out.println(cu.area());
        System.out.println(cu.perimeter());
        System.out.println(cu.volume());

        Cylinder cy=new Cylinder();
        cy.getHeight(5,15);
        System.out.println(cy.area());
        System.out.println(cy.perimeter());
        System.out.println(cy.volume());;

        Constants cs= new Constants();
        cs.distance(8);

        HourlyEmployee he= new HourlyEmployee();
        he.calculateSalary(5);
        SalariedEmployee se= new SalariedEmployee();
        se.calculateSalary(1);



        String str1 = "Practice Java String Programs";
        String mask = "abc";
        StringBuilder sb = new StringBuilder();
        char ch = 0;
        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            if (mask.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        System.out.println("Output: " + sb.toString());
*/

        //System.out.println(AllPrograms.reverseWord("Java Programs on String"));

//        AllPrograms.sumNumber(5,4,788,45,65,71);
//        constants co= constants.Sun;
//        System.out.println(co);
//        System.out.println(constants.Mon.value);
//        System.out.println(constants.Tues.value);
//        System.out.println(constants.Wed.value);
//        System.out.println(constants.Thu.value);

        String a = "200";
        Integer i=Integer.valueOf(a);
        System.out.println(i);
        String j = Integer.toBinaryString(56);
        System.out.println(j);
        String k =Integer.toHexString(56);
        System.out.println(k);
        System.out.println(Integer.min(965,625));

        double l=Double.compare(89.3696,89.369);
        System.out.println(l);
        //System.out.println(Double.isInfinite());
    }
}



