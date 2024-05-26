package Assignment15.HashSet;

import java.util.HashSet;

public class assign15_53 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(65);
        hashSet.add(89);
        hashSet.add(69);
        hashSet.add(32);
        hashSet.add(45);
        //to clone a hash set to another hash set.
        HashSet<Integer> hashSet1= new HashSet<>();
        hashSet1 = (HashSet<Integer>) hashSet.clone();
        System.out.println(hashSet1);
    }
}
