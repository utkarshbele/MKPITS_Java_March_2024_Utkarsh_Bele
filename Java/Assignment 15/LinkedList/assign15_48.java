package Assignment15.LinkedList;

import java.util.LinkedList;

public class assign15_48 {
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
        //replace an element in a linked list
        linkedList.set(2,66);
        System.out.println(linkedList);
    }
}
