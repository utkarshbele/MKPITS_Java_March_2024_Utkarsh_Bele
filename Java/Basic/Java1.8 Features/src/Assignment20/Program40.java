package Assignment20;

import java.util.ArrayList;
import java.util.List;

public class Program40 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(){{
            add(45);
            add(54);
            add(71);
            add(14);
            add(-55);
            add(-11);
            add(3);
            add(99);
            add(2);
        }};
        //Filter and collect only positive numbers from a list.
        list.stream().filter(n->n>0).forEach(n-> System.out.print(n+" "));
    }
}
