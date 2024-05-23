package Assinment14.HashSet.DWF;
import java.util.HashSet;


public class DuplicateWordFilter {
    public static HashSet hashSet = new HashSet();
    public static void addWord(String word)
    {
        hashSet.add(word);
        System.out.println("Word added successfully.");
    }
    //Check if a specific word exists
    public static void SearchWord(String word) {
        if (hashSet.contains(word))
        {
            System.out.println("Word Already Exists");
        }
        else
        {
            System.out.println("Word does not exists");
        }
    }
    //remove a word
    public static void removeWord(String word) {
        if (hashSet.contains(word))
        {
            hashSet.remove(word);
            System.out.println("Word removed Successfully:");
        }
        else {
            System.out.println("Word does not exists");
        }
    }
//Display all Words
    public static void displayWord() {
        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
}
