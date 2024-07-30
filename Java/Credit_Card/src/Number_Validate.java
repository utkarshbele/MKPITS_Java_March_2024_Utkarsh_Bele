public class Number_Validate {
    //using Luhn Algorithm
    public static boolean validateCreditCard(String num)
    {
        int[] card_num= new int[num.length()];
        for(int i=0; i<num.length(); i++)
        {
            card_num[i]=Integer.parseInt(num.substring(i, i+1));
        }
//doing right to left, doubling that digit, skipping one digit, as
// well as if number greater than 9 then mod by 10 and add 1 to the remainder
        for (int i=num.length()-2; i>=0; i=i-2)
        {
            int tempValue= card_num[i];
            tempValue=tempValue*2;
            if(tempValue>9)
            {
                tempValue=tempValue%10+1;
            }
            card_num[i]=tempValue;
        }
//add all digits
        int sum=0;
        for(int i=0; i<card_num.length; i++)
        {
            sum= sum + card_num[i];
        }
//if sum is a multiple of 10 the valid cc number
        return sum % 10 == 0;
    }

    public static String getCompany(String num) {
        if (num.matches("^4[0-9]{12}(?:[0-9]{3})?$")) {
            return "Visa";
        } else if (num.matches("^5[1-5][0-9]{14}$")) {
            return "MasterCard";
        } else if (num.matches("^3[47][0-9]{13}$")) {
            return "American Express";
        } else if (num.matches("^6(?:011|5[0-9]{2})[0-9]{12}$")) {
            return "Discover";
        } else {
            return "Unknown";
        }
    }
}
