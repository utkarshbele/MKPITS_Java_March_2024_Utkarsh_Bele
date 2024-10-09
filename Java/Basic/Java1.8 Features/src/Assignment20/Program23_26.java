package Assignment20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program23_26 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(){{
            add(45);
            add(54);
            add(0);
            add(71);
            add(14);
            add(3);
            add(99);
            add(2);
        }};
        //Convert a list of integers to an array.
        Integer[] array = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        //Limit the list to the first 3 elements
        list.stream().limit(3).forEach(n-> System.out.print(n+" "));
        //Skip the first 2 elements in a list
        System.out.println();
        list.stream().skip(2).forEach(n-> System.out.print(n+" "));
        //Remove null elements from a list.
        System.out.println();
        System.out.println(list.stream().filter(n->n!=0).collect(Collectors.toList()));
    }
}
