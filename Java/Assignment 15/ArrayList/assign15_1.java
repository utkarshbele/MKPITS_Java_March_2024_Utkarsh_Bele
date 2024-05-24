package Assignment15.ArrayList;
import java.util.ArrayList;

public class assign15_1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Black");
        arrayList.add("White");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Violet");
        arrayList.add("Indigo");
        arrayList.add("Green");
        for (String st:arrayList)
        {
            System.out.print(" "+st);
        }
    }
}
