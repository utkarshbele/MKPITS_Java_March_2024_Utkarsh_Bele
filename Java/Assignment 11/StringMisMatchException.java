package assign11;

public class StringMisMatchException extends Exception{
    @Override
    public String getMessage() {
        return "The two strings are not the same, So StringMisMatchException Occurred ";
    }
}
