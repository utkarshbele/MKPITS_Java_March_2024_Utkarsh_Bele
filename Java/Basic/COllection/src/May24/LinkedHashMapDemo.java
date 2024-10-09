package May24;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put(75,88);
        linkedHashMap.put(10,12);
        linkedHashMap.put(22,44);
        linkedHashMap.put(66,70);
        linkedHashMap.put(19,95);
        linkedHashMap.put(33,54);
        linkedHashMap.put(0,0);
        linkedHashMap.put(1,0);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.getOrDefault(110,15));
        System.out.println(linkedHashMap.reversed());
        linkedHashMap.putFirst(25,300);
        System.out.println(linkedHashMap.sequencedEntrySet());
        System.out.println(linkedHashMap.pollLastEntry());

    }
}
