package Assignment17;
import java.util.Scanner;
import java.util.TreeSet;

public class Program17_3 {
    public static TreeSet<Integer> ts = new TreeSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("1)Enter integer elements \n2)Display elements in sorted order");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter element");
                    int n=sc.nextInt();
                    ts.add(n);
                    break;
                case 2:
                    System.out.println("The unique elements in the Tree set are");
                    System.out.println(ts);;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
