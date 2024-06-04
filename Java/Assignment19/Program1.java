package Assignment19;

import com.sun.source.tree.IfTree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Create a list of strings and use a stream to filter out strings
// that start with the letter "A". Collect the filtered
public class Program1 {
    public static boolean methodReference(String n)
    {
        if(n.startsWith("A"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Aurangabad","Andaman","Amravati","Pune", "Nagpur","Yavatmal", "Washim", "Mumbai", "Jaipur", "Delhi");
        System.out.println(list);
        Stream<String> stream= list.stream();
        //Using lambda expression
        List<String> a = stream.filter(n->n.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);
        //using method reference
        Stream<String> stream1=list.stream();
        List<String> b=stream1.filter(Program1::methodReference).collect(Collectors.toList());
        System.out.println(b);
    }
}
