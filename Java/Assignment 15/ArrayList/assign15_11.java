package Assignment15.ArrayList;
import java.util.ArrayList;

public class assign15_11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println("Before and after reverse");
        //to reverse elements in an array list.
        System.out.println(arrayList.reversed());
    }
}
