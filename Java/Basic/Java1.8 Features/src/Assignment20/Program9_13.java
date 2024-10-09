package Assignment20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program9_13 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Pune", "Nagpur","Yavatmal", "Washim", "Mumbai");
        //Check if any string in the list contains the letter 'a'
        list.stream().filter(n->n.contains("a")).forEach(n-> System.out.print(n+" "));
        //Concatenate all strings in the list, separated by commas
        System.out.println();
        System.out.println(list.stream().collect(Collectors.joining(",")));
        //Filter out strings with length less than 5.
        list.stream().filter(n->n.length()<5).forEach(System.out::println);
        //Find the longest string in the list.
        System.out.println(list.stream().max(Comparator.comparingInt(String::length)).get());
        //Group a list of strings by their length.
        list.stream().collect(Collectors.groupingBy(String::length)).forEach((n,m)-> System.out.println(n+" "+m));
    }
}
