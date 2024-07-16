package Assignment20;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Program39 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Pune", "Nagpur","Yavatmal", "Washim", "Mumbai");
        //Calculate the average length of strings in a list.
        IntSummaryStatistics m=list.stream().mapToInt(n->n.length()).summaryStatistics();
        System.out.println(m.getAverage());
    }
}
