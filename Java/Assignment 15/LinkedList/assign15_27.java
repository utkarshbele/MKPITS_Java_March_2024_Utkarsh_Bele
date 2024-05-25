package Assignment15.LinkedList;

import java.util.LinkedList;

public class assign15_27 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(32);
        linkedList.add(43);
        linkedList.add(54);
        linkedList.add(65);
        linkedList.add(76);
        linkedList.add(87);
        //insert the specified element at the specified position in the linked list
        linkedList.set(3,100);
        System.out.println(linkedList);
    }
}
