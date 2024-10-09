package Assignment20;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program38 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Pune", "Nagpur","Yavatmal", "Washim", "Mumbai");
        //Create a map of string lengths and their corresponding strings
        Set<String> set= new HashSet<>(list);
        Map<String,Long> map=set.stream().collect(Collectors.toMap(Function.identity(), n-> (long) n.length()));
        map.forEach((n,m)-> System.out.println(n+" "+m));
    }
}
