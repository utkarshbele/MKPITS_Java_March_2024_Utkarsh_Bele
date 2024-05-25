package Assignment15.LinkedList;
import java.util.LinkedList;

public class assign15_46 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(32);
        linkedList.add(43);
        linkedList.add(54);
        linkedList.add(65);
        linkedList.add(76);
        linkedList.add(87);
        //program to compare two linked lists.
        LinkedList<Integer> linkedList1=new LinkedList<>();
        linkedList1.add(11);
        linkedList1.add(32);
        linkedList1.add(43);
        linkedList1.add(54);
        linkedList1.add(65);
        linkedList1.add(76);
        linkedList1.add(87);
        if (linkedList.equals(linkedList1))
        {
            System.out.println("They are same");
        }
        else
        {
            System.out.println("They are not same");
        }
    }
}
