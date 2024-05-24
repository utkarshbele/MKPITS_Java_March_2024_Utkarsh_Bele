package Assignment15.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class assign15_10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println("Before and after shuffle");
        //to shuffle elements in an array list.
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
