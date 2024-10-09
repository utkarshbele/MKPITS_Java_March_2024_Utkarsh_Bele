package Assignment20;
import java.util.ArrayList;
import java.util.List;
public class Program1_3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(){{
            add(45);
            add(54);
            add(71);
            add(14);
            add(3);
            add(99);
            add(2);
        }};
        //Filter out even numbers from a list of integers.
        list.stream().filter(n->n%2==0).forEach(n-> System.out.print(" "+n));
        //Find the maximum number in a list of integers.
        Integer maxValue = list.stream().mapToInt(n->n).max().orElseThrow();
        System.out.println("\n"+maxValue);
        //Find the sum of all numbers in a list.
        Integer sum=list.stream().mapToInt(n->n).sum();
        System.out.println(sum);
    }
}
