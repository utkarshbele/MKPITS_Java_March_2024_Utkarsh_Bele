package May24;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap= new TreeMap<>();
        treeMap.put(12,10);
        treeMap.put(22,44);
        treeMap.put(66,70);
        treeMap.put(19,95);
        treeMap.put(33,54);
        treeMap.put(0,0);
        treeMap.put(1,0);

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.headMap(20));
        System.out.println(treeMap.ceilingEntry(18));
        System.out.println(treeMap.floorKey(10));
        System.out.println(treeMap.lastKey());

    }
}
