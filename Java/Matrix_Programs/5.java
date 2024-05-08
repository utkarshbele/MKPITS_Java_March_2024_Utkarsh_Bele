//Java Program to Find Transpose of a Matrix
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for  matrix");
        int row = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix");
        int col = scanner.nextInt();
        int[][] m = new int[row][col];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                m[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix before Transpose");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix after Transpose");
        for (int i = 0; i < col; i++) //flip the rows into columns and vice versa
        {
            for (int j = 0; j < row; j++)
            {
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
}