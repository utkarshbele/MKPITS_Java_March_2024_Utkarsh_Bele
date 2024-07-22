package Assignment20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program50 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Pune", "Nagpur","Yavatmal", "Washim", "Mumbai");
        //Find the shortest string in a list
        String shortestString = list.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println(shortestString);
    }
}
