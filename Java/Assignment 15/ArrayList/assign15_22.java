package Assignment15.ArrayList;

import java.util.ArrayList;

public class assign15_22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(108);
        arrayList.add(96);
        arrayList.add(3);
        //to print all the elements of an ArrayList using the elements' position.
        Object[]  a=arrayList.toArray();
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
