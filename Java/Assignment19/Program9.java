package Assignment19;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//Create a list of integers and use a stream to filter out the even numbers
// , double each remaining number, and then find the sum of the doubled numbers
// //with parallel stream.
public class Program9 {
    public static long add()
    {
        Random random=new Random();
        return random.nextLong();
    }
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        List<Long> list=new ArrayList<>();
        for(int i=0;i<100000000;i++) {
            list.add(Program9.add());
        }
        //System.out.print(list);
        System.out.println(list.parallelStream().filter(n->n%2!=0).mapToInt(n-> (int) (n*2)).sum());

        long end = System.currentTimeMillis();
        long time = end-begin;
        System.out.println();
        System.out.println("Elapsed Time: "+time +" milli seconds");
    }
}
//Elapsed Time: 12569 milli seconds