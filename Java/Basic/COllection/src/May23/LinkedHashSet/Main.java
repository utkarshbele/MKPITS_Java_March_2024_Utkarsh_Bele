package May23.LinkedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(50);
        linkedHashSet.add(10);
        linkedHashSet.add(11);
        linkedHashSet.add(2);
        linkedHashSet.add(1995);
        linkedHashSet.add(1210);
        linkedHashSet.add(77);
        linkedHashSet.add("sddssdf");
        for(Object o:linkedHashSet)
        {
            System.out.print(" "+o);
        }
        System.out.println();
        System.out.println(linkedHashSet.reversed());
        System.out.println(linkedHashSet.isEmpty());
        System.out.println(linkedHashSet.getFirst());
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet.contains(2));
    }
}