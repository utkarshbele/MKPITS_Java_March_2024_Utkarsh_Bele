package Assinment14.HashSet.UPIM;
import java.util.HashSet;
import java.util.UUID;
public class UniqueProductIdentifierManager {
    public static HashSet<UUID> hashSet = new HashSet<UUID>();
    public static void addUID()
    {
        //UUID uuid=UUID.randomUUID();
        hashSet.add(UUID.randomUUID());
        System.out.println("Unique Identifier generated automatically and added successfully.");
    }
    //Check if a specific UID exists
    public static void checkUID(String uid) {
        UUID uidToSearch=UUID.fromString(uid);
        if (hashSet.contains(uidToSearch))
        {
            System.out.println("UID Already Exists");
        }
        else
        {
            System.out.println("UID does not exists");
        }
    }
    //remove an UID
    public static void removeUID(String uid) {
        UUID uidToRemove=UUID.fromString(uid);
        if (hashSet.contains(uidToRemove))
        {
            hashSet.remove(uidToRemove);
            System.out.println("UID removed Successfully:");
        }
        else {
            System.out.println("UID does not exists");
        }
    }

    public static void displayUID() {
        for (UUID uid : hashSet) {
            System.out.println(uid);
        }
    }
}
