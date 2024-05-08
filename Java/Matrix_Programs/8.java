//Java Program to Check if a Matrix is a Sparse Matrix
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for  matrix");
        int row = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix");
        int col = scanner.nextInt();
        int[][] m = new int[row][col];
        int zero=0;
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                m[i][j] = scanner.nextInt();
                if (m[i][j]==0)
                    zero++;
            }
        }
        if(zero>(row*col)/2)  //when the number of 0 is more than the average number of elements in a matrix
            System.out.print("This is a Sparse matrix ");
        else
            System.out.print("This is not a Sparse Matrix");
        System.out.println();
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}