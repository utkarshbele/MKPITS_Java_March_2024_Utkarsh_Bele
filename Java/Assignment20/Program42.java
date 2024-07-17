package Assignment20;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program42 {
    public static boolean isPalindrome(String str)
    {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("deified");
        list.add("java");
        list.add("deed");
        list.add("level");
        //Filter out strings that are palindromes.
        list.stream().filter(Program42::isPalindrome).forEach(n-> System.out.print(n+" "));
        //or
        System.out.println();
        List<String> palindromes = list.stream().filter(s -> s.equals(new StringBuilder(s).reverse().
                        toString())).collect(Collectors.toList());
        System.out.println(palindromes);
    }
}
