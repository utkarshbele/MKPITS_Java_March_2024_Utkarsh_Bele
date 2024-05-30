package string9_3;
import java.lang.String;
public class StringUtils {
    String firstName = "Utkarsh is the one of the best guys";
    public void stringUtils() {
        StringBuffer sb = new StringBuffer(firstName);
        System.out.println(sb.reverse());
        System.out.println(sb.substring( 6));
        //String[] arrOfStr = firstName.split(" ", firstName.length());

        System.out.println(firstName.split("the", -1).length-1);
        System.out.println(firstName.toUpperCase());

    }
}
