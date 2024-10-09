package Assignment20;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program19_22 {
    public static void main(String[] args) {
        List<List<String>> listoflist=new ArrayList<>();
        listoflist.add(Arrays.asList("Pune", "Nagpur","Yavatmal", "Washim", "Mumbai", "Amravati"));
        listoflist.add(Arrays.asList("RalbjTPxtH","tiSEDOnoCU","tiSEDOnoCU","avfdsfv","UZgEFmmWeA","ViWxLlxQtj","ViWxLlxQtj","uqgBCGUyQR"));
        //Check if all strings in the list are non-empty
        listoflist.stream().map(n->n.isEmpty()).forEach(n-> System.out.print(n+" "));
        //Flatten a list of lists into a single list.
        System.out.println(listoflist);
        List<String> list=listoflist.stream().flatMap(List::stream).collect(Collectors.toList());
        //Create a map from a list of strings with the string as the key and its length as the value
        Set<String> set= new HashSet<>(list);
        Map<String,Long> map=set.stream().collect(Collectors.toMap(Function.identity(),n-> (long) n.length()));
        map.forEach((n,m)-> System.out.println(n+" "+m));
        //Find the first string that starts with the letter 'A'
        String a=set.stream().filter(n->n.startsWith("A")).findFirst().get();
        System.out.println(a);
    }
}
