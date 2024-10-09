package Assignment20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program47 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("level");
        list.add("deified");
        list.add("java");
        list.add("java");
        list.add("deed");
        list.add("level");
        //Create a set of all uppercase strings from a list.
        Set<String> h=new HashSet<>(list);
        h.stream().map(String::toUpperCase).forEach(n-> System.out.print(n+" "));
    }
}
