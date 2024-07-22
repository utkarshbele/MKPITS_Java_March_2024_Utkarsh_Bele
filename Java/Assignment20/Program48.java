package Assignment20;

import java.util.ArrayList;
import java.util.List;

public class Program48 {
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
        //Calculate the sum of squares of a list of integers
        Integer sum=list.stream().mapToInt(n->n*n).sum();
        System.out.println(sum);
    }
}
