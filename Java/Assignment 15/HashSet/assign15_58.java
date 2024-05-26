package Assignment15.HashSet;

import java.util.HashSet;

public class assign15_58 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(65);
        hashSet.add(89);
        hashSet.add(69);
        hashSet.add(32);
        hashSet.add(45);
        //compare two sets and retain elements that are the same
        HashSet<Integer> hashSet1 =new HashSet<Integer>();
        hashSet1.add(65);
        hashSet1.add(44);
        hashSet1.add(69);
        hashSet1.add(32);
        hashSet1.add(46);
        hashSet=hashSet1;
        System.out.println(hashSet);
    }
}
