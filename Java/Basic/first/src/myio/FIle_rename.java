package myio;
import java.io.File;
public class FIle_rename {
    public static void renameAFile(String source, String target)
    {
        File  srcfile= new File(source);
        File  tfile=new File(target);
            if (srcfile.exists())
            {
                try
                {
                    System.out.println("The file "+srcfile+" is renamed to "+target+" "+srcfile.renameTo(tfile));
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            else
            {
                System.out.println(srcfile + "file does not exist");
            }
    }
}

