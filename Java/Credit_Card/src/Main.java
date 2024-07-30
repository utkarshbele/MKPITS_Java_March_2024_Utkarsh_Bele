import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Validate a credit card and also check which company it belongs to
//        Visa : 13 or 16 digits, starting with 4.
//        MasterCard : 16 digits, starting with 51 through 55.
//        Discover : 16 digits, starting with 6011 or 65.
//        American Express : 15 digits, starting with 34 or 37.

        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter your credit/debit card number");
        String cnum= sc.next();
        boolean isValid=Number_Validate.validateCreditCard(cnum);
        if (isValid) {
            String company = Number_Validate.getCompany(cnum);
            System.out.println("Credit Card Number is valid: " + isValid);
            System.out.println("Credit Card Company: " + company);
        } else {
            System.out.println("Invalid Credit Card Number");
        }

    }
}