package Assignment20;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Program34 {
    public static void main(String[] args) {
        //Reverse the order of a list of strings
        Stream.of("Pune", "Nagpur", "Yavatmal", "Pune", "Nagpur", "Washim", "Mumbai").collect(Collectors.toCollection(LinkedList::new)).descendingIterator().forEachRemaining(n-> System.out.print(n+" "));
    }
}
