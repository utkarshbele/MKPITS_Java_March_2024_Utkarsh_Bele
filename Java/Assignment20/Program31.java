package Assignment20;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program31 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pune", "Nagpur", "Yavatmal", "Pune", "Nagpur", "Washim", "Mumbai");
        //Sort a list of strings by their lengths.
        list.stream().sorted(Comparator.comparing(n->n.length())).forEach(n-> System.out.print(n+" "));
    }
}
