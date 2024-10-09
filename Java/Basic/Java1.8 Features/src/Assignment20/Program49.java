package Assignment20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program49 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Pune", "Nagpur","Yavatmal", "Washim", "Mumbai");
        //Convert a list of strings to a map where the key is the string and the value is its reversed form.
        Map<String, String> reversedMap = list.stream().collect(Collectors.toMap(s -> s,
                s -> new StringBuilder(s).reverse().toString()));
        System.out.println(reversedMap);
    }
}
