package Assignment17;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Program17_5 {
    public static TreeSet<String> ts= new TreeSet<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    });
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("1)Enter words \n2)Display all words");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter word");
                    String n=sc.next();
                    ts.add(n);
                    break;
                case 2:
                    System.out.println("The Words are");
                    System.out.println(ts);;
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
