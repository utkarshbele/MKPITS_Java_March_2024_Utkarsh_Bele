package May24;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> hashtable= new Hashtable<>();
        hashtable.put(1,21);
        hashtable.put(2,55);
        hashtable.put(3,66);
        hashtable.put(4,101);
        hashtable.put(5,215);
        hashtable.put(6,33);
        hashtable.put(7,78);
        hashtable.put(0,0);
        hashtable.put(10,0);
        System.out.println(hashtable);
        System.out.println(hashtable.keySet());
        System.out.println(hashtable.size());
        hashtable.putIfAbsent(8,57);
        System.out.println(hashtable.containsValue(33));
        System.out.println(hashtable);
    }
}
