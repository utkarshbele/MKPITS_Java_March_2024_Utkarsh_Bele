package Assignment15.HashSet;

import java.util.HashSet;

public class assign15_57 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(65);
        hashSet.add(89);
        hashSet.add(69);
        hashSet.add(32);
        hashSet.add(45);
        //to compare two hash set.
        HashSet<Integer> hashSet1 =new HashSet<Integer>();
        hashSet1.add(65);
        hashSet1.add(89);
        hashSet1.add(69);
        hashSet1.add(32);
        hashSet1.add(45);
        if (hashSet.equals(hashSet1))
        {
            System.out.println("They are same");
        }
        else System.out.println("They are not same");
    }
}
