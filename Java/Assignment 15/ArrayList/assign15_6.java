package Assignment15.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class assign15_6 {
    public static void main(String[] args) {
        //to remove the third element from an array list.
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        arrayList.remove(2);
        Iterator iterator= arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
