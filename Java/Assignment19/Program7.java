package Assignment19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Create a list of integers and use a stream to
// filter out numbers greater than 10 using a custom predicate.
public class Program7 {
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
        System.out.println(list.stream().filter(n->n>10).collect(Collectors.toList()));
    }
}
