package Assignment20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program41 {
    public static void main(String[] args) {
        List<List<String>> listoflist=new ArrayList<>();
        listoflist.add(Arrays.asList("Pune", "Nagpur","Yavatmal", "Washim", "Mumbai", "Amravati"));
        listoflist.add(Arrays.asList("RalbjTPxtH","tiSEDOnoCU","tiSEDOnoCU","avfdsfv","UZgEFmmWeA","ViWxLlxQtj","ViWxLlxQtj","uqgBCGUyQR"));
        //Concatenate a list of lists of strings into a single list of strings
        List<String> list=listoflist.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(list);
    }
}
