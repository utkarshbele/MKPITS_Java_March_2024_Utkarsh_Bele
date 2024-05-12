//Java Program to Find Maximum Difference Between Two Elements in an Array
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static int maxDifference(int[] arr, int n)
    {
        Arrays.sort(arr); //Sorted the array in ascending order
        return arr[n-1]-arr[0]; //Deleted the first element from last
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
            System.out.println(array[i]);
        }
        System.out.println("Maximum difference is " + maxDifference(array,n));
    }
}
