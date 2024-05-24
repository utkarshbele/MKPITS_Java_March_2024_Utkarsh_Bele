package Assignment15.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class assign15_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        //insert an element at the first position
        arrayList.addFirst(999);

        Iterator<Integer> iterator=arrayList.iterator();
        while(iterator.hasNext())
        {
            System.out.print(" "+iterator.next());
        }
    }
}
