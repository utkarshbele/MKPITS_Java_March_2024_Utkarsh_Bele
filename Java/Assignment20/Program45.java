package Assignment20;
import java.util.ArrayList;
import java.util.List;

public class Program45 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("level");
        list.add("deified");
        list.add("java");
        list.add("java");
        list.add("deed");
        list.add("level");
        //Remove duplicates from a list of strings while preserving order.
        list.stream().distinct().forEach(n-> System.out.print(n+" "));
    }
}
