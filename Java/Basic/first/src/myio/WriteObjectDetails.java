package myio;

import java.io.*;

public class WriteObjectDetails{
    public static void writeObject(Library_Member library_member, String filepath) throws Exception {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filepath, true));
        bufferedWriter.write(library_member.getName());
        bufferedWriter.newLine();
        bufferedWriter.write(library_member.getNumber());
        bufferedWriter.newLine();
        bufferedWriter.close();
//entire object in one go
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream(filepath));
        objectOutputStream.writeObject(library_member);
        objectOutputStream.close();
    }
//here the return type of theis method is class object
    public static Library_Member readFromFile(String filepath) throws Exception
    {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(filepath));
        //Object declaration
        Library_Member library_member;
        //Object passing and Typecasting return class as the readobject is of object type
        library_member= (Library_Member)objectInputStream.readObject();
        objectInputStream.close();
        return library_member;
    }
}
