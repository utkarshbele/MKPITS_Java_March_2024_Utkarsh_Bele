package Assignment20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program43 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("deified");
        list.add("java");
        list.add("deed");
        list.add("level");
        //Create a list of the first letters of each string in a list
        List<String> result = list.stream().map(n->n.substring(0,1)).collect(Collectors.toList());
        System.out.println(result);
    }
}
