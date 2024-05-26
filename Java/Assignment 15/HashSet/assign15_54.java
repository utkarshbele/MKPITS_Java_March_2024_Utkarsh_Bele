package Assignment15.HashSet;

import java.util.HashSet;

public class assign15_54 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(65);
        hashSet.add(89);
        hashSet.add(69);
        hashSet.add(32);
        hashSet.add(45);
        //to convert a hash set to an array.
        Integer[] a = hashSet.toArray(new Integer[0]);
        for (Integer o:a)
        {
            System.out.print(o+" ");
        }
    }
}
