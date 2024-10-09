package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Pune", "Nagpur","Yavatmal", "Washim", "Mumbai");
        System.out.println(list);
        Stream<String> stream= list.stream();
        //stream.map(n->n.toUpperCase()).forEach(n-> System.out.print(" "+n));
        stream.map(n->n.contains("Pune")).forEach(n-> System.out.println(n));

        List<Integer> list1=new ArrayList<>(){{
            add(45);
            add(54);
            add(71);
            add(14);
            add(3);
            add(99);
            add(2);
        }};
        list1.stream().filter(n->n%2==0).forEach(n-> System.out.print(" "+n));

        Stream<Integer> stream1= Stream.of(45,99,12,10,1995,30,34,56,7);
        stream1.forEach(System.out:: println);

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(45);
        arrayList.add(33);
        arrayList.add(52);
        arrayList.add(3);
        arrayList.add(11);
        arrayList.add(8);
        arrayList.add(77);
        arrayList.stream().filter(n->n%2!=0).collect(Collectors.toList());

    }
}
