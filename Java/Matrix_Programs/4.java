//Java Program to Find the Sum and Product of Elements in a Row/Column
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for  matrix");
        int row = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix");
        int col = scanner.nextInt();
        int[][] m = new int[row][col];
        System.out.println("Enter the elements");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                m[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Print the elements");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        //Sum and Product of row
        for (int i = 0; i < row; i++) {
            int sumrow=0;
            int product_row=1;
            for (int j = 0; j < col; j++) {
                sumrow += m[i][j];
                product_row *= m[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " is " + sumrow);
            System.out.println("Product of row " + (i + 1) + " is " + product_row);
        }
        //Sum and Product of column
        for (int i = 0; i < col; i++) {
            int sumcol=0;
            int product_col=1;
            for (int j = 0; j < row; j++) {
                sumcol += m[j][i];
                product_col *= m[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + " is " + sumcol);
            System.out.println("Product of column " + (i + 1) + " is " + product_col);
        }
    }
}