package Assignment15.HashSet;
import java.util.TreeSet;

public class assign15_56 {
    public static void main(String[] args) {
        TreeSet <Integer>treeSet = new TreeSet<Integer>();
        TreeSet <Integer>treeSet1 = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(10);
        System.out.println(treeSet);
        //to find numbers less than 7 in a tree set.
        treeSet1=(TreeSet<Integer>)treeSet.headSet(7);
        System.out.println(treeSet1);
    }
}
