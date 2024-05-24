package Assignment15.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class assign15_15 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        ArrayList<Integer> arrayList1 = new ArrayList();
        arrayList1.add(151);
        arrayList1.add(12);
        arrayList1.add(553);
        arrayList1.add(14);
        arrayList1.add(64);
        arrayList1.add(35);
        System.out.println(arrayList);
        System.out.println(arrayList1);
        System.out.println("Joining them both");
        //to join two array lists
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
    }
}
