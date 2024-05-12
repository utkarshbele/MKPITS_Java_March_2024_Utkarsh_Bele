//Java Program to Delete an Element from an Array
import java.util.Arrays;
import java.util.Scanner;

public class Main{
     public static String removeElement(int[] arr, int n, int pos)
    {
        int[] newArray =new int[n-1];
        int j=0;
        for(int i=0; i<arr.length;i++)
        {
            if(i!=pos)//except for the position index print everything else
            {
                newArray[j]=arr[i];
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
        System.out.println("Enter the position you want to delete the element from");
        int pos= scanner.nextInt();
        System.out.println("The new array is "+ removeElement(array,n,pos));
    }
}
