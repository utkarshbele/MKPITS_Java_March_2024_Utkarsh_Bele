package Assignment15.LinkedList;

import java.util.LinkedList;

public class assign15_42 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(32);
        linkedList.add(43);
        linkedList.add(54);
        linkedList.add(65);
        linkedList.add(76);
        linkedList.add(87);
        //retrieve, but not remove, the first element of a linked list
        System.out.println(linkedList.peekFirst());
    }
}
