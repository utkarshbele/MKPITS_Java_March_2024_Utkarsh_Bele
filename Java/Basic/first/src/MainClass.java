import myio.Library_Member;
import java.io.*;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("demo.txt"));
            System.out.println("Enter Choice");
            System.out.println("1.Add details");
            System.out.println("2.Display details");
            System.out.println("Exit");
            int choice = scanner.nextInt();
            while (choice != 3) {
                switch (choice) {
                    case 1:
                        System.out.println("Enter Student Name : ");
                        String name = scanner.next();
                        System.out.println("Enter Student number : ");
                        String number = scanner.next();
                        Library_Member library_member=new Library_Member(name,number);
                        objectOutputStream.writeObject(library_member);
                        System.out.println("Details Added Successfully");
                        break;
                    case 2:
                        readOnFile();
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
                System.out.println("Enter Choice");
                System.out.println("1.Add details");
                System.out.println("2.Display details");
                System.out.println("Exit");
                choice = scanner.nextInt();
            }
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readOnFile(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("demo.txt"));
            System.out.println("Library Student Details");
            while(true){
                Library_Member library_member = (Library_Member) objectInputStream.readObject();
                System.out.println("Name : "+library_member.getName()+" Marks : "+library_member.getNumber());
            }
        } catch (Exception e) {
            System.out.println("Error Reading File");
        }
    }
}
