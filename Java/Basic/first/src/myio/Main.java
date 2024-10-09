package myio;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 //       InputStreamReader io = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(io);
//            System.out.println("Enter a value");
//            int a=Integer.parseInt(br.readLine());
//            System.out.println("Enter a value");
//            int b=Integer.parseInt(br.readLine());
//            System.out.println("sum="+a+b);
//            //OR
//            BufferedInputStream bufferedInputStream=new BufferedInputStream(System.in);
//            System.out.println("Enter Your Name");
//            String c=br.readLine();
//            BufferedInputStream bufferedInputStream1=new BufferedInputStream(System.in);
//            System.out.println("Enter your Stream");
//            String c1=br.readLine();
//            System.out.println(c);
//            System.out.println(c1);
        //File class
   //     File f1 = new File("Main.java");
        //System.out.println(f1.exists());
        //System.out.println(f1.getAbsolutePath());
        //System.out.println(f1.getAbsoluteFile());
    //    File d = new File("c:\\Users\\Work\\IdeaProjects\\first\\src");
     //   String[] a = d.list();
        // for(String file:a)
        {
            //       System.out.println(file);
        }
        //   System.out.println(d.lastModified());
        // System.out.println(f1.getPath());
        //System.out.println(f1.canWrite());
        //System.out.println(f1.getCanonicalFile());
        //System.out.println(d.getParent());
        //System.out.println(f1.length());
        // System.out.println(d.getParentFile());

        //reading from keyboard and writing to disk file
//        try {
//
//            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("demo.txt", true));
//
//            String choice;
//            do {
//                System.out.println("Enter the name");
//                String name= br.readLine();
//                bufferedWriter.write(name+"\n");
//                System.out.println("Do u want to add another name (y/n");
//                choice=br.readLine();
//            }while(choice.equalsIgnoreCase("y"));
//            bufferedWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//reading from disk file

//            BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\Work\\IdeaProjects\\first\\demo.txt"));
//            String name=br1.readLine();
//            while(name!=null) {
//                System.out.println(name);
//                name=br1.readLine();
//            }

        //Copy content of one file to another file
//        System.out.println("Please enter the name of the source file");
//        String src=sc.next();
//        System.out.println("Please enter the target file");
//        String target=sc.next();
//        Copy copy=new Copy();
//        copy.copyFile(src,target);
//CountLines
//        CountLines co=new CountLines();
        //       co.myFun("C:\\Users\\Work\\IdeaProjects\\first\\democopy.txt");
        // Count Occurance
        //      CountOccurance.countOccurances("C:\\Users\\Work\\IdeaProjects\\first\\democopy.txt", "am");

        //Delete a file
        // FIleDelete.deleteAFile("democopy.txt");

        //Rename a file
        //FIle_rename.renameAFile("demo1.txt","demo.txt");

//Write/read object onto a file
//        Library_Member lb= new Library_Member("Utkarsh", "8795625315");
//        //WriteObjectDetails.writeObject(lb, "demo.txt");
//        Library_Member library_member=WriteObjectDetails.readFromFile("demo.txt");
//        library_member.getName();
//        library_member.getNumber();

        //Write and read multiple objects
        System.out.println("Please enter whether you want to write or read data");
        System.out.println("1) Write Data");
        System.out.println("2) Display Details");
        int choice = sc.nextInt();
        String n;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("demo.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("demo.txt"));
            switch (choice) {
                case 1:
                    do {
                        System.out.println("Please enter the name");
                        String name = sc.next();
                        System.out.println("Pleas enter the mobile number");
                        String number = sc.next();
                        Library_Member library_member = new Library_Member(name, number);
                        objectOutputStream.writeObject(library_member);
                        System.out.println("Do you wan to continue adding details y/n");
                        n= sc.next();
                    }while(n.equalsIgnoreCase("y"));
                case 2:
                   try {
                       do {
                           Library_Member library_member = (Library_Member) objectInputStream.readObject();
                           System.out.println(library_member.getName());
                           System.out.println(library_member.getNumber());
                       } while (true);
                   }catch (EOFException e)
                   {
                       break;
                   }
                default:
                    System.out.println("Invalid command");
            }
            objectOutputStream.close();
            objectInputStream.close();
    }
}
