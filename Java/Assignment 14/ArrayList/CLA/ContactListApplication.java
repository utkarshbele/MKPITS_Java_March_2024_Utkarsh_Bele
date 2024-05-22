package Assinment14.ArrayList.CLA;
import java.util.ArrayList;


public class ContactListApplication {
    public static ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

    public static void addContacts(long contactID, String name, String email, long phoneNumber)
    {
        contactsArrayList.add(new Contacts(contactID,name,email,phoneNumber));
        System.out.println("Contact added successfully.");
    }

    public static void removeContact(long contactID) {
        boolean removed = false;
        for (Contacts contacts : contactsArrayList) {
            if (contacts.getContactID() == contactID) {
                contactsArrayList.remove(contacts);
                removed = true;
                System.out.println("Contact removed successfully.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Contact not found.");
        }
    }

    public static void searchContact(String name) {
        boolean found = false;
        for (Contacts contacts : contactsArrayList) {
            if (contacts.getName().equals(name))
            {
                System.out.println("Contact found:");
                System.out.println(contacts);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public static void updateContact(long contactID,long phoneNumber, String email) {
        for (Contacts contacts: contactsArrayList)
        {
            if (contacts.getContactID() == contactID)
            {//update contacts phone number and email based on ID
                contacts.setPhoneNumber(phoneNumber);
                contacts.setEmail(email);
                System.out.println("Contact updated");
            }
        }
        System.out.println("Contact not Found");
    }

    public static void displayContact()
    {
        for(Contacts contacts:contactsArrayList)
        {
            System.out.println(contacts);
        }
    }
}
