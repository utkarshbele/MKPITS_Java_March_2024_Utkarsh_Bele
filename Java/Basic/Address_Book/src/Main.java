import data.Storage;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String name, number, email;
        Storage addressbook = new Storage("Utkarsh","Arni road, yavatmal","vvghvg@bhbj.com");
        System.out.println("Name: " + addressbook.getName());
        System.out.println("Address: " + addressbook.getAddress());
        System.out.println("Email: " + addressbook.getEmail());

        addressbook.setName("Utku");
        System.out.println("Name: " + addressbook.getName());
        addressbook.setAddress("khargaon road, nagpur");
        System.out.println("Address: " + addressbook.getAddress());
        addressbook.setEmail("h@d45.com");
        System.out.println("Email: " + addressbook.getEmail());


        Storage addressbook1[] = new Storage[3];
        addressbook1[0]=new Storage("John", "123 Main Street", "stgykj@bhhui.com");
        addressbook1[1]=new Storage("Jackie", "456 Main Street", "mklh@465.com");
        addressbook1[2]=new Storage("Akash", "789 Main Street", "wtjh@2145.com");
        for(int i=0;i<addressbook1.length;i++)
        {
            System.out.println(addressbook1[i].getName() + " " + addressbook1[i].getAddress() + " " + addressbook1[i].getEmail());
        }

    }
}
