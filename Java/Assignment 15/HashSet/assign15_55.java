package Assignment15.HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class assign15_55 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(65);
        hashSet.add(89);
        hashSet.add(69);
        hashSet.add(32);
        hashSet.add(45);
        //to convert a hash set to a tree set.
        TreeSet<Integer> treeSet= new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
