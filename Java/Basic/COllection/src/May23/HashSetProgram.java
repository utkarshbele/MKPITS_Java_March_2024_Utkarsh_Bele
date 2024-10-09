package May23;
import java.util.HashSet;
//Create union, intersection and difference between 2 hashsets.
public class HashSetProgram {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1= new HashSet();
        HashSet<Integer> hashSet2= new HashSet<>();
        HashSet<Integer> uni = new HashSet<Integer>();

        hashSet1.add(12);
        hashSet1.add(10);
        hashSet1.add(1);
        hashSet1.add(77);
        hashSet1.add(35);

        hashSet2.add(25);
        hashSet2.add(2);
        hashSet2.add(12);
        hashSet2.add(101);
        hashSet2.add(66);
        System.out.println("Set 1 "+hashSet1);
        System.out.println("Set 2 "+hashSet2);

        //union of both sets
        uni.addAll(hashSet2);
        uni.addAll(hashSet1);
        System.out.println("Union of set 1 and set 2 "+uni);
        //Intersection of sets
        uni.retainAll(hashSet2);
        uni.retainAll(hashSet1);
        System.out.println("Intersection of set 1 and set 2 "+uni);
        //Difference of both sets
        uni.addAll(hashSet1);
        uni.removeAll(hashSet2);
        System.out.println("Difference of set 2 from set 1 "+uni);

    }
}
