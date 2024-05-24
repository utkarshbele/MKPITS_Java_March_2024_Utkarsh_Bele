package Assignment15.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class assign15_7 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        //search for an element in an array list
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element you want to search: ");
        int obj=sc.nextInt();
            if (arrayList.contains(obj))
            {
                System.out.println("Element found.");
            }
            else
            {
                System.out.println("The element does not exists");
            }
    }
}
