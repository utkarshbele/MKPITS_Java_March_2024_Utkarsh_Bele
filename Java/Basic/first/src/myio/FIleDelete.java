package myio;

import java.io.File;

public class FIleDelete {
    public static void deleteAFile(String target) {
        File tfile = new File(target);
        if (tfile.exists())
        {
            try
            {
                System.out.println("The file "+tfile+" is deleted: "+tfile.delete());
            }
         catch(Exception e)
         {
            System.out.println(e);
         }
        }
        else
        {
            System.out.println(tfile + "file does not exist");
        }
    }
}
