package Assignment20;
import java.util.Arrays;
import java.util.List;

public class Program4_5 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Pune", "Nagpur","Yavatmal", "Washim", "Mumbai");
        //Convert a list of strings to uppercase.
        list.stream().map(String::toUpperCase).forEach(n-> System.out.print(" "+n));
        //Sort a list of strings alphabetically.
        System.out.println();
        list.stream().sorted().forEach(n-> System.out.print(n+" "));
    }
}
