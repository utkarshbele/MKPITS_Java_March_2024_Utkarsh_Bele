package Assignment20;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
public class Program6_8 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(){{
            add(45);
            add(54);
            add(71);
            add(14);
            add(3);
            add(99);
            add(2);
            add(2);
            add(54);
        }};
        //Get a list of unique numbers from a list with duplicates.
        list.stream().distinct().forEach(n-> System.out.print(n+" "));
        //Count the number of elements in a list.
        System.out.println();
        System.out.println(list.stream().count());
        //Find the average of a list of integers.
        //System.out.println(list.stream().mapToInt(n->n).average());
        IntSummaryStatistics m=list.stream().mapToInt(n->n).summaryStatistics();
        System.out.println(m.getAverage());
    }
}
