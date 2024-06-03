package Assignment17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Program17_4 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(50);
        linkedHashSet.add(10);
        linkedHashSet.add(11);
        linkedHashSet.add(2);
        linkedHashSet.add(10);
        linkedHashSet.add(1210);
        linkedHashSet.add(77);
        TreeSet<Integer> treeSet= new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(11);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(1210);
        treeSet.add(77);
        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(50);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(2);
        hashSet.add(10);
        hashSet.add(1210);
        hashSet.add(77);
        //compare the difference between the 3
        System.out.println("Linked hash set "+linkedHashSet);
        System.out.println("Tree set        "+treeSet);
        System.out.println("Hash set        "+hashSet);
    }
}
