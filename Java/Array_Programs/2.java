//Java Program to Insert an Element in an Array
import java.util.Arrays;
import java.util.Scanner;

public class Main{
     public static String insertElement(int[] arr, int n, int e, int pos)
    {
        int[] newArray =new int[n+1];
        int j=0;
        for(int i=0; i<newArray.length;i++)//create new array
        {
            if(i==pos)
            {
                newArray[i]=e;//add the new element to the desired position
            }
            else
            {
                newArray[i]=arr[j];
                j++;
            }
        }
        return Arrays.toString(newArray);
    }
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of elements you want in an array");
        int n= scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i< n; i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0; i< n; i++)
        {
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.println("Enter the element you want to add in the array");
        int e=scanner.nextInt();
        System.out.println("Enter the position you want to add th element to");
        int pos= scanner.nextInt();
        System.out.println("The new array is "+insertElement(array,n,e,pos));
    }
}
