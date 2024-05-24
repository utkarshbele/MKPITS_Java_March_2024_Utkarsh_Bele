package Assignment15.ArrayList;

import java.util.ArrayList;

public class assign15_21 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println("Replaced the 2nd element");
        //to replace the second element of an ArrayList with the specified element.
        arrayList.set(1,45);
        System.out.println(arrayList);
    }
}
