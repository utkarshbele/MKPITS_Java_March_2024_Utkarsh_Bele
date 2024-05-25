package Assignment15.LinkedList;

import java.util.LinkedList;

public class assign15_40 {
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
        //to copy a linked list to another linked list.
        LinkedList<Integer> linkedList1 =new LinkedList<>();
        linkedList1= (LinkedList<Integer>) linkedList.clone();
        System.out.println(linkedList1);
    }
}
