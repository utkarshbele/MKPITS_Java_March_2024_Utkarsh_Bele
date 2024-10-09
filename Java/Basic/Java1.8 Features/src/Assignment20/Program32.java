package Assignment20;
import java.util.*;

public class Program32 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pune", "Nagpur", "Yavatmal", "Pune", "Nagpur", "Washim", "Mumbai");
        //Calculate the total length of all strings in the list
        list.stream().map(n->n.length()).forEach(n-> System.out.print(n+" "));
    }
}
