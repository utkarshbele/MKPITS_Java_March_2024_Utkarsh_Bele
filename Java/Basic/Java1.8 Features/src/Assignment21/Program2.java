package Assignment21;
import java.util.*;
//Program 2
//Given five positive integers, find the minimum and maximum values that can be calculated
// by summing exactly four of the five integers. Then print the respective minimum and
// maximum values as a single line of two space-separated long integers.
//E.g. arr = [9,5,3,7,1]
//The minimum is 1+3+5+7 = 16 and the maximum is sum is 3+5+7+9 = 24.
//Then print 16 24
public class Program2 {
    public static ArrayList<Integer> arrayList= new ArrayList<>();
    public static Random rand = new Random();
    public static void add(){
        for (int i=0;i<5;i++){
        arrayList.add(rand.nextInt(100));
    }}
    public static void minSum()
    {
        int sum = 0;
        for (int n=0;n< 4;++n){
            sum += arrayList.get(n);
            System.out.print(arrayList.get(n));
            if(n<3)
            {
                System.out.print("+");
            }
        }
        System.out.print(" = "+sum);
    }
    public static void maxSum()
    {
        int sum = 0;
        for (int n=1;n< 5;n++){
            sum += arrayList.get(n);
            System.out.print(arrayList.get(n));
            if(n<4)
            {
                System.out.print("+");
            }
        }
        System.out.print(" = "+sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        add();
        Collections.sort(arrayList);
        while (true) {
            System.out.println("\n1. Sum of minimum numbers\n2. Sum of Max numbers\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    minSum();
                    break;
                case 2:
                    maxSum();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
                    break;
            }
        }
    }
}
