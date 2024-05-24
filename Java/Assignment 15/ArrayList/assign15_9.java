package Assignment15.ArrayList;

import java.util.ArrayList;

public class assign15_9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        //to copy one array list into another.
        ArrayList<Integer> arrayList1 = new ArrayList();
        arrayList1=(ArrayList<Integer>) arrayList.clone();
        for(Integer in:arrayList1)
        {
            System.out.print(" "+in);
        }
    }
}
