package Assignment20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program44 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("deified");
        list.add("java");
        list.add("deed");
        list.add("level");
        //Find the string with the most occurrences of the letter 'a'
        Optional<String> maxAString = list.stream().max((s1, s2) -> Long.compare(
                        s1.chars().filter(ch -> ch == 'a' || ch == 'A').count(),
                        s2.chars().filter(ch -> ch == 'a' || ch == 'A').count()));
        maxAString.ifPresent(s -> System.out.println("String with the most 'a': " + s));
        //OR
        String maxAString1 = String.valueOf(list.stream().collect(Collectors.toMap(Function.identity(),
                        s -> s.chars().filter(ch -> ch == 'a' || ch == 'A').count()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey));
    }
}
