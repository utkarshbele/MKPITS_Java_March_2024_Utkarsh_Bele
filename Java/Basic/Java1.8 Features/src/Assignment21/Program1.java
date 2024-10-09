package Assignment21;

import java.util.ArrayList;

//Program 1
//An array contains 30 integers. Write a program to read every 3rd element of the array,
// compute the square of the array and print the addition of all the suqares
//E.g. [1,2,2,4,5,6,7,8,3,10]
//Answer is (2x2) + (6x6) + (3x3) = 49
public class Program1 {
    public static void main(String[] args) {
        int n;
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (n=1;n<31;n++)
        {
            arrayList.add(n);
        }
        int sum=arrayList.stream().filter(m->m%3==0).map(x->x*x).reduce(0,(y,z)->y+z);
        System.out.println(sum);
    }
}
//3 6 9 12 15 18 21 24 27 30 sum of these numbers squared