package Assignment20;
import java.util.Arrays;
import java.util.List;

public class Program37 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pune", "Nagpur", "Yavatmal", "Pune", "Nagpur", "Washim", "Mumbai");
        //Count how many strings in a list contain the letter 'e'
        long b= list.stream().filter(n -> n.contains("e")).count();
        System.out.println(b);
    }
}
