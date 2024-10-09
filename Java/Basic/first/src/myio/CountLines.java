package myio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//count number of lines, number of words and characters
public class CountLines {
    public static void myFun(String filename) throws Exception {
        /*
        take file name from user
        check if the file exits or not
        read th file using Buffer reader
        use read line

         */
        File src = new File(filename);
        if (src.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
                String[] words;
                int wordCount = 0, sum = 0, counter = 0;
                String str = bufferedReader.readLine();
                while (str != null) {
                    System.out.println(str);
                    words = str.split("\\s+");
                    wordCount += words.length;
                    sum = sum + wordCount;
                    counter++;
                    str = bufferedReader.readLine();
                }
                System.out.println("The number of words " + wordCount);
                System.out.println("The number of characters are " + sum);
                System.out.println("The number of lines are " + counter);
            } catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}