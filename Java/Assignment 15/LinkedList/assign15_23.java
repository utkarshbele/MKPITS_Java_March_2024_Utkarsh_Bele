package Assignment15.LinkedList;
import java.util.LinkedList;

public class assign15_23 {
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
        //to append the specified element to the end of a linked list
        linkedList.addLast(666);
        System.out.println(linkedList);
    }
}
