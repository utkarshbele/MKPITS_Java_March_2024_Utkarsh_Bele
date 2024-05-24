package Assignment15.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class assign15_14 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println("Before and after swap");
        //that swaps two elements in an array list.
        Collections.swap(arrayList,1,4);
        System.out.println(arrayList);
    }
}
