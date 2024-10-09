package Assignment20;

import java.util.ArrayList;
import java.util.List;

public class Program46 {
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
        //Filter out numbers greater than a specified value.
        list.stream().filter(n->n>25).forEach(n-> System.out.print(n+" "));
    }
}
