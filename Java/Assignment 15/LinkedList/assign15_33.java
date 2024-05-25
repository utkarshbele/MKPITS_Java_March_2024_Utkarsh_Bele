package Assignment15.LinkedList;
import java.util.LinkedList;

public class assign15_33 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(32);
        linkedList.add(43);
        linkedList.add(54);
        linkedList.add(65);
        linkedList.add(76);
        linkedList.add(87);
        //display elements and their positions in a linked list.
        Object[] a= linkedList.toArray();
        for (int i=0; i<a.length; i++)
        {
            System.out.print("Index "+i+" Element "+a[i]+", ");
        }
    }
}
