package myio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//count number of occurences of the str word in the file
public class CountOccurance
{
    public static void countOccurances(String fname, String str) throws IOException {
        File src = new File(fname);
        if (src.exists())
        {
            try
            {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
                String str1 = bufferedReader.readLine();
                String[] words;
                System.out.println(str.codePointAt(0));
                int counter = 0;
                while (str1 != null)
                {
                    //System.out.println(str1);
                    words = str1.split(" ");
                    for (int i = 0; i < words.length; i++)
                    {
                        if (str.equals(words[i]))
                            counter++;
                    }
                    str1 = bufferedReader.readLine();
                }
                System.out.println("The number of time "+str+" is repeated is "+counter);
                bufferedReader.close();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
//