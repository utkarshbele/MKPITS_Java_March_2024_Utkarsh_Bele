package Assignment20;

import java.util.ArrayList;
import java.util.List;

public class Program33 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(){{
            add(45);
            add(54);
            add(71);
            add(14);
            add(3);
            add(-5);
            add(99);
            add(2);
        }};
        //Filter out negative numbers from a list of integers.
        list.stream().filter(n->n>0).forEach(n-> System.out.print(n+" "));
    }
}
