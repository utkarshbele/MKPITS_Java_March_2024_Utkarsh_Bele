package Assignment17;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program17_2 {
    public static LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("1)Enter integer elements \n2)Display elements in order of their insertion");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter element");
                    int n=sc.nextInt();
                    lhs.add(n);
                    break;
                case 2:
                    System.out.println("The elements in the Linked Hashset are");
                    System.out.println(lhs);;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}