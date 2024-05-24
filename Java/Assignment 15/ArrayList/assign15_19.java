package Assignment15.ArrayList;

import java.util.ArrayList;

public class assign15_19 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        //for trimming the capacity of an array list.
        arrayList.trimToSize();
    }
}
