package Assignment20;

import java.util.Arrays;
import java.util.List;

public class Program35 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pune", "Nagpur", "Yavatmal", "Pune", "Nagpur", "Washim", "Mumbai");
        //Get a list of unique characters from a list of strings.
        list.stream().flatMapToInt(String::chars).mapToObj(n->(char) n).distinct().forEach(n-> System.out.print(n+" "));

    }
}
