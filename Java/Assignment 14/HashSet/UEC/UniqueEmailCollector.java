package Assinment14.HashSet.UEC;
import java.util.HashSet;

public class UniqueEmailCollector {
    public static HashSet<String> hashSet = new HashSet<String>();
    public static void addEmail(String email)
    {
        hashSet.add(email);
        System.out.println("Email Address added successfully.");
    }
    //Check if a specific email address exists
    public static void checkEmail(String email) {
        if (hashSet.contains(email))
            {
                System.out.println("Email Already Exists");
            }
        else
        {
            System.out.println("Email does not exists");
        }
    }
    //remove an email address
    public static void removeEmail(String email) {
            if (hashSet.contains(email))
            {
                hashSet.remove(email);
                System.out.println("Email removed Successfully:");
            }
            else {
                System.out.println("Email does not exists");
            }
    }

    public static void displayEmail() {
            for (String st : hashSet) {
                System.out.println(st);
            }
        }
    }