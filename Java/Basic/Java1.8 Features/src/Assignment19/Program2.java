package Assignment19;

import java.util.ArrayList;
import java.util.List;

//Create a list of integers and use a stream to double each integer in the list.
public class Program2 {
    public static Integer twice(int n)
    {
        return n*n;
    }
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
        //by lambda expression
        list.stream().map(n->n*n).forEach(n-> System.out.print(" "+n));
        //by method reference
        System.out.println();
        list.stream().map(Program2::twice).forEach(n-> System.out.print(" "+n));
    }
}
