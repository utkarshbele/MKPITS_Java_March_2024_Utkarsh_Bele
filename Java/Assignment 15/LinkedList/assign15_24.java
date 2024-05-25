package Assignment15.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class assign15_24 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(32);
        linkedList.add(43);
        linkedList.add(54);
        linkedList.add(65);
        linkedList.add(76);
        linkedList.add(87);
        //to iterate through all elements in a linked list
        Iterator iterator= linkedList.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
    }
}
