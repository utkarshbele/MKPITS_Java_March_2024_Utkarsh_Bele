package assign11;

public class StringMisMatch {
    String str1, str2;
    public void compareString(String str1, String str2) throws StringMisMatchException{
            if(str1.equals(str2))
            {
                System.out.println("The Strings are a match");
            }
            else{
                StringMisMatchException stringMisMatchException=new StringMisMatchException();
                throw stringMisMatchException;
            }
    }

}
