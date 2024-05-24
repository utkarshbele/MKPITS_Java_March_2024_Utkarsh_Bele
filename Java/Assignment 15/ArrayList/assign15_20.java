package Assignment15.ArrayList;

import java.util.ArrayList;

public class assign15_20 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        //to increase an array list size.
        arrayList.ensureCapacity(15);
        System.out.println("Default capacity is 10 increased to 15");
    }
}
