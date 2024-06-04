package Assignment19;
import java.util.ArrayList;
//Create a list of strings and use a stream to sort them in ascending order
public class Program3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("RalbjTPxtH");
        arrayList.add("tiSEDOnoCU");
        arrayList.add("UZgEFmmWeA");
        arrayList.add("ViWxLlxQtj");
        arrayList.add("uqgBCGUyQR");
        arrayList.stream().sorted().forEach(System.out::println);
    }
}
