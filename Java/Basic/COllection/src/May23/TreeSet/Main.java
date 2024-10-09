package May23.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> treeSet= new TreeSet<>();
        treeSet.add("hello");
        treeSet.add("world");
        treeSet.add("how");
        treeSet.add("are");
        treeSet.add("u");
        treeSet.add("i m");
        treeSet.add("fine");
        for(Object o:treeSet)
        {
            System.out.print(" "+o);
        }
        System.out.println(treeSet.ceiling("is"));
        System.out.println(treeSet.floor("for"));

    }
}
