package Assignment20;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program27_29 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pune", "Nagpur", "Yavatmal", "Pune", "Nagpur", "Washim", "Mumbai");
        //Find the string with the minimum length.
        System.out.println(list.stream().min(Comparator.comparing(String::length)).get());
        //Join a list of strings with a custom separator.
        System.out.println(list.stream().collect(Collectors.joining(",")));
        //Find the frequency of each string in a list.
        Map<String, Long> frequencyMap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);
    }
}
