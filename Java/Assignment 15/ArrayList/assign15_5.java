package Assignment15.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class assign15_5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        //to update an array element by the given element
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an element you want to add: ");
        int element=sc.nextInt();
        System.out.print("Enter the position you want to add the element to, between 0-5: ");
        int index=sc.nextInt();
        arrayList.set(index,element);
        Iterator iterator= arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
