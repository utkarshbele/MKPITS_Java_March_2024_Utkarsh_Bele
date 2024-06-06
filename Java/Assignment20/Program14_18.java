package Assignment20;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program14_18 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
        }};
        //Partition a list of integers into even and odd.
        list.stream().collect(Collectors.groupingBy(n->n%2)).forEach((n,m)-> System.out.println(m));
        //Calculate the product of all integers in a list
        System.out.println(list.stream().reduce(1,(n,m)->n*m));
        //Remove the first element from a list using streams.
        list.stream().skip(1).forEach(n-> System.out.print(n+" "));
        //Find the second-highest number in a list of integers.
        System.out.println();
        int x=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(x);
        //Convert a list of integers to a list of their string representations.
        List<String> stringList=list.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(stringList);
    }
}
