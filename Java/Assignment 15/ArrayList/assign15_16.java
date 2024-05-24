package Assignment15.ArrayList;

import java.util.ArrayList;

public class assign15_16 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        //to clone an array list to another array list
        System.out.println(arrayList);
        System.out.println(arrayList.clone());
    }
}
