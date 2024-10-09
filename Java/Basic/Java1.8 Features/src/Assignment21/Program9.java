package Assignment21;

import java.util.Arrays;
import java.util.Comparator;

//Write a Java Program to Find the Largest and Smallest Word in a String
public class Program9 {
    public static void main(String[] args) {
        String str="hello yavatmal nagpur pune vishakhapatnam i am good how are you";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        String maxWord=Arrays.stream(arr).max(Comparator.comparing(String::length)).get();
        System.out.println("the largest word is "+maxWord);
        String minWord=Arrays.stream(arr).min(Comparator.comparing(String::length)).get();
        System.out.println("the smallest word is "+minWord);
        int a,b,c,d;
        a=b=c=d=20;
        a+=b-=c*=d/=20;
        System.out.println();
    }
}
