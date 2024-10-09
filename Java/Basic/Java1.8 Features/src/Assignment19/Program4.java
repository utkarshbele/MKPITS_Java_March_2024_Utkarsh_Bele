package Assignment19;

import java.util.ArrayList;
import java.util.List;

//Create a list of integers and use a stream to filter out the even numbers,
//double each remaining number, and then find the sum of the doubled numbers.
public class Program4 {
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
        System.out.println("Sum of odd numbers is "
                +list.stream().filter(n->n%2!=0).mapToInt(n->n*2).sum());

    }
}
