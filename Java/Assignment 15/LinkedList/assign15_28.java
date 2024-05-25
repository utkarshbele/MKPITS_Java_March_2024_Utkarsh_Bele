package Assignment15.LinkedList;

import java.util.LinkedList;

public class assign15_28 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(32);
        linkedList.add(43);
        linkedList.add(54);
        linkedList.add(65);
        linkedList.add(76);
        linkedList.add(87);
        //insert elements into the linked list at the first and last positions
        System.out.println(linkedList);
        linkedList.addFirst(12);
        linkedList.addLast(10);
        System.out.println(linkedList);
    }
}