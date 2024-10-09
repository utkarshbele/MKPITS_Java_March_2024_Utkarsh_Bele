package Assignment19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Create a list of lists of integers and use a stream to flatten the structure
// (i.e., merge all the lists into one) and then calculate the sum of all the integers.
public class Program8 {
    public static void main(String[] args) {
        List<List<Integer>> listoflist=new ArrayList<>();
        listoflist.add(Arrays.asList(45,54,71,14,3,99,2));
        listoflist.add(Arrays.asList(4,5,7,1,35,9,28));
        listoflist.add(Arrays.asList(4,56,21,452,8,8,96));
        //method reference
        listoflist.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum();
        //or lambda expression
        System.out.println(listoflist.stream().flatMap(n->n.stream()).mapToInt(i->i).sum());
    }
}
