package Assinment14.HashSet.UVT;
import java.util.HashSet;

public class UniqueVisitorTracker {
    public static HashSet hashSet = new HashSet();
    public static void addIP(String ipAddress)
    {
        hashSet.add(ipAddress);
        System.out.println("Visitor IP added successfully.");
    }
    //Check if a specific IP exists
    public static void SearchIP(String ipAddress) {
        if (hashSet.contains(ipAddress))
        {
            System.out.println("IP Address Already Exists");
        }
        else
        {
            System.out.println("IP Address does not exists");
        }
    }
    //remove a IP
    public static void removeIP(String ipAddress) {
        if (hashSet.contains(ipAddress))
        {
            hashSet.remove(ipAddress);
            System.out.println("IP Address removed Successfully:");
        }
        else {
            System.out.println("IP Address does not exists");
        }
    }
    //Display all IP addresses
    public static void displayIP() {
        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
}
