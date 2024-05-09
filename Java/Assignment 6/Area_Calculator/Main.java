import java.util.Scanner;
import area.AreaCalculator;
public class Main
{
    public static void main(String args[])
    {
        AreaCalculator ac = new AreaCalculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Area Calculator");
        int choice;
        System.out.println("Here are your options:");
        System.out.println("1) Area of Circle");
        System.out.println("2) Area of Square");
        System.out.println("3) Area of Rectangle");
        System.out.println("4) Area of Traingle");

        System.out.print("What would you like to do?: ");
        choice = scan.nextInt();
        float result;
        if(choice == 1)
        {
            System.out.println("Enter radius");
            float x = scan.nextFloat();
            result = ac.areaCircle(x);
            System.out.println("Area of Circle is " + result);
        }
        else if(choice ==2)
        {
            System.out.println("Enter Side");
            float x = scan.nextFloat();
            result = ac.areaSquare(x);
            System.out.println("Area of Square is " + result);
        }
        else if(choice ==3) {
            System.out.println("Enter length");
            float x = scan.nextFloat();
            System.out.println("Enter breadth");
            float y = scan.nextFloat();
            result = ac.areaRectangle(x, y);
            System.out.println("Area of Rectangle is " + result);
        }
        else if(choice ==4)
        {
            System.out.println("Enter length");
            float x = scan.nextFloat();
            System.out.println("Enter breadth");
            float y = scan.nextFloat();
            result = ac.areaTriangle(x, y);
            System.out.println("Area of Triangle is " + result);
        }
    }
}
