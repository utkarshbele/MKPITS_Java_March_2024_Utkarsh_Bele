package Assignment15.HashSet;

import java.util.HashSet;

public class assign15_59 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(65);
        hashSet.add(89);
        hashSet.add(69);
        hashSet.add(32);
        hashSet.add(45);
        //remove all elements from a hash set.
        hashSet.clear();
        System.out.println(hashSet);
    }
}
