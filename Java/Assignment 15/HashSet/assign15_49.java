package Assignment15.HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class assign15_49 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(65);
        hashSet.add(89);
        hashSet.add(69);
        hashSet.add(32);
        hashSet.add(45);
        //to iterate through all elements in a hash list.
        Iterator it= hashSet.iterator();
        while(it.hasNext())
                {
                    System.out.print(it.next()+" ");
                }
    }
}
