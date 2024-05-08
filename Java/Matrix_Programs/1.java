//Java Program to Multiply Two Matrices
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for 1st matrix");
        int rowF= scanner.nextInt();
        System.out.println("Enter the number of columns for 1st matrix OR number of rows for 2nd matrix");
        int colFrowS = scanner.nextInt();
        System.out.println("Enter the number of columns for 2nd matrix");
        int colS= scanner.nextInt();
        //m1 and m2 will be the 2 matrices
        int[][] m1 = new int [rowF][colFrowS];//row first * column first row second(m1 column and m2 row should be same)
        int[][] m2 = new int [colFrowS][colS];//column first row second * column second
        int[][] result= new int[rowF][colS];//the resultant will be row of m1 and col of m2

        System.out.println("Enter the data for the 1st matrix");
        for(int i=0; i<rowF;i++)
        {
            for(int j = 0; j< colFrowS; j++)
            {
                m1[i][j]= scanner.nextInt();
            }
        }

        System.out.println("Enter the data for the 2nd matrix");
        for(int i = 0; i< colFrowS; i++)
        {
            for(int j=0; j<colS;j++)
            {
                m2[i][j]= scanner.nextInt();
            }
        }

        System.out.println("The 1st matrix entered is");
        for(int i=0; i<rowF;i++)
        {
            for(int j = 0; j< colFrowS; j++)
            {
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("The 2nd matrix entered is");
        for(int i = 0; i< colFrowS; i++)
        {
            for(int j=0; j<colS;j++)
            {
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }

        //Multiplication
        for (int i=0;i<rowF;i++) // row of m1
        {
            for (int j=0; j<colS; j++) //columns of m2
            {
                for(int k=0;k<colFrowS; k++) //the common factor
                {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
                System.out.println();
            }
        }
        //print final matrix
        System.out.println("The Resultant matrix is");
        for (int[] r: result)
        {
            System.out.println(Arrays.toString(r));
        }
    }
}