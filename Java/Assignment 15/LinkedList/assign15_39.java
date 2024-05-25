package Assignment15.LinkedList;

import java.util.LinkedList;

public class assign15_39 {
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
        //to join two linked lists.
        LinkedList<Integer> linkedList1 =new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);
        linkedList1.add(7);
        linkedList1.add(9);
        linkedList1.add(34);
        System.out.println(linkedList1);
        linkedList.addAll(linkedList1);
        System.out.println("after joining them both");
        System.out.println(linkedList);

    }
}
