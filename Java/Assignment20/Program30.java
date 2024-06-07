package Assignment20;

import java.util.ArrayList;
import java.util.List;

public class Program30 {
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
        //Convert a list of integers to a list of their squares
        list.stream().map(n->n*n).forEach(n-> System.out.print(n+" "));
    }
}
