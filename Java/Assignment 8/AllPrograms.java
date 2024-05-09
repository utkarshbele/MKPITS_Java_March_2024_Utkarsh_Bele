package programs;

public class AllPrograms
{
    public void palindromeString(String str)
    {
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
       int i=0;
        int j=str.length()-1;
        while(j>i)
        {
            str.charAt(i)==str.charAt(j);
        }
        if (str.equals(rev))  //we are comparing 2 string using the equals method
        {
            System.out.println("The String " + str + " is a palindrom");
        } else {
            System.out.println("String does not have pallindrome");
        }
    }

    public int factorialCal(int num1)
    {
        if (num1 == 1)
            return 1;
        return num1 * factorialCal(num1 - 1); 
    }

    public void fizzBuzz(int num2)
    {
        for (int i = 1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public int binarySearch(int[] arr, int n)
    {
        int first = 0, last = arr.length - 1;
        while (first <= last) {
            int mid = first + last / 2;
            int midnumber = arr[mid];

            if (n == midnumber) {
                return midnumber;
            }
            if (n < midnumber) {
                last = mid - 1;
            }
            if (n > midnumber) {
                first = mid + 1;
            }
        }
        return -1;
    }

//Matrix multiply

   public void printMatrix(int[][] a, int row, int col)
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(a[i][j] + " ");
            }
        }
    }
    public int matrixMultiplication()
    {
        int result[][]= new int[10][10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)  {
                for (int k = 0; k < 3; k++)  {
                    result[i][j] = result[i][j] + num1[i][k] * num2[k][j];
                }
            }
        }
        return result;
    }
}

