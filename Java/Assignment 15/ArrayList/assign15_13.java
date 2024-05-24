package Assignment15.ArrayList;

import java.util.ArrayList;

public class assign15_13 {
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
        //to compare two array lists
        System.out.println("The 2 array lists comparison is "+arrayList.equals(arrayList1));
    }
}