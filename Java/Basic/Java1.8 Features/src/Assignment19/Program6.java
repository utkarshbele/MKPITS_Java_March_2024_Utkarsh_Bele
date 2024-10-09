package Assignment19;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

//Create a list of objects (e.g., custom objects with attributes like name and age)
// and use a stream to find the oldest and youngest objects based on a certain attribute
// (e.g., age).
public class Program6 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Utkarsh", 26));
        list.add(new Person("Rahul", 78));
        list.add(new Person("Abhishek", 14));
        list.add(new Person("Bhai", 50));
        list.add(new Person("Bhidu", 32));
        list.add(new Person("Akash", 30));
        Optional<Person> person=list.stream().max(Comparator.comparing(Person::getAge));
        person.ifPresent(n-> System.out.println("Max age "+n));
        Optional<Person> person1=list.stream().min(Comparator.comparing(Person::getAge));
        System.out.println("Min age ");
        person1.ifPresent(System.out::println);
    }
}