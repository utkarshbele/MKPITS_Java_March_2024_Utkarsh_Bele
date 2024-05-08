//Java Program to Display Upper Triangular Matrix
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for  matrix");
        int row = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix");
        int col = scanner.nextInt();
        int[][] m = new int[row][col];//btw the matrix needs to be a square matrix
        if (row == col) {
            System.out.println("Enter the elements");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i <= j)  //where the column is greater than row only that will be printed
                        m[i][j] = scanner.nextInt();
                }
            }
            System.out.println("The lower triangular matrix is");
            for (int[] r : m) {
                System.out.println(Arrays.toString(r));
            }
            System.out.println();
        }
        else
        {
            System.out.println("Operation cannot be performed");
        }

    }
}