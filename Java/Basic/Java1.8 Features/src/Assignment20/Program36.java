package Assignment20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program36 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(){{
            add(45);
            add(54);
            add(71);
            add(14);
            add(3);
            add(99);
            add(2);
        }};
        //Create a comma-separated string from a list of integers.
        System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}
