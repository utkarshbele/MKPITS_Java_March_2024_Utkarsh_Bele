package myio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public void readfile() {
        //read from file and display on screen
        try {
            FileReader fileReader=new FileReader("D:\\java2\\fileIO\\abc.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string;
            while ((string=bufferedReader.readLine())!=null) {
                System.out.println(string);
            }
            bufferedReader.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);// TODO: handle exception
        }
    }


    public void readfromfile(String filename) {
        File file=new File(filename);
        if (file.exists()) {
            try {
                FileReader fileReader=new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String string;
                while ((string=bufferedReader.readLine())!=null) {
                    System.out.println(string);
                }
                bufferedReader.close();

            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println(e);
            }
            catch (Exception e) {
                System.out.println(e);// TODO: handle exception
            }
        }
        else {
            System.out.println("file not exisit");
        }
    }

    public void copyFile(String source, String target) {
        File tfile =new File(target);
        File src =new File(source);
        if (src.exists()) {
            try {
                BufferedReader bufferedReader=new BufferedReader(new FileReader(src));
                BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(tfile,true));
                String str= bufferedReader.readLine();
                while(str!=null) {
                    bufferedWriter.write(str + "\n ");
                    str = bufferedReader.readLine();
                }
//                String string = null;
//                String line;
//                while ((line=bufferedReader.readLine())!=null) {
//                    string=string+line;
//                }
//                bufferedWriter.write(string + "\n ");
                bufferedReader.close();
                bufferedWriter.close();
                System.out.println("Contents copied successfully");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else {
            System.out.println(source+"file does not exist");
        }
    }
}
