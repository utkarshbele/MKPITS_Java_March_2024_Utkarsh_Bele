package Assignment15.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class assign15_37 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(32);
        linkedList.add(43);
        linkedList.add(54);
        linkedList.add(65);
        linkedList.add(76);
        linkedList.add(87);
        System.out.println(linkedList);
        //that swaps two elements in a linked list.
        Collections.swap(linkedList,1,5);
        System.out.println("Before and after swap");
        System.out.println(linkedList);
    }
}
