package Assignment15.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class assign15_45 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(32);
        linkedList.add(43);
        linkedList.add(54);
        linkedList.add(65);
        linkedList.add(76);
        linkedList.add(87);
        //convert a linked list to an array list.
        ArrayList arrayList= new ArrayList<>(linkedList);
        System.out.println(arrayList);

    }
}
