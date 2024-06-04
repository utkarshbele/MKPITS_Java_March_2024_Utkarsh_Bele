package Assignment19;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Create a list of strings and use a stream to group them by their length,
// and then count the number of strings in each group.
public class Program5 {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        arrayList.add("RalbjTPxtH");
        arrayList.add("tiSEDOomsodddnoCU");
        arrayList.add("UZsdsdgEFmmWeA");
        arrayList.add("VisddsfdfdsfdWxLlxQtj");
        arrayList.add("uqgBCGUyQR");
        //group strings by their length and count number of strings
        Map<Integer,Long> groupByLength=arrayList.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(groupByLength);
    }
}
