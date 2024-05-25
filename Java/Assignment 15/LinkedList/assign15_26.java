package Assignment15.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class assign15_26 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(32);
        linkedList.add(43);
        linkedList.add(54);
        linkedList.add(65);
        linkedList.add(76);
        linkedList.add(87);
        //iterate a linked list in reverse order
        ListIterator<Integer> iterator= linkedList.listIterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("Before and after reverse");
        while (iterator.hasPrevious())
        {
            System.out.print(iterator.previous()+" ");
        }
    }
}