package LamdaExpression;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //lambda expression on runnable and Calc interface
        Runnable runnable=()->{
            System.out.println("hello");
        };
        Calc calc=(a,b)->{
            return a+b;
        };
        runnable.run();
        System.out.println(calc.calculate(10,20));

        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
                (n)->{System.out.print(" "+n);}
        );
        System.out.println();
        ArrayList<Student> arrayList= new ArrayList<Student>();
        arrayList.add(new Student("Utkarsh", 96));
        arrayList.add(new Student("John", 60));
        arrayList.add(new Student("Bro", 66));
        Collections.sort(arrayList,(s1,s2)->{
            return s1.getName().compareTo(s2.getName());
        });
        System.out.println(arrayList);
        Collections.sort(arrayList,(s1,s2)->{
            if(s1.getMarks()==s2.getMarks())
                return 0;
            else if(s1.getMarks()>s2.getMarks())
                return 1;
            else
                return -1;
        });
        System.out.println(arrayList);

        //method reference
        MyClass myClass=new MyClass();
        //reference to non-static method
        MyInterface myInterface =myClass::display;
        myInterface.display("Rahul");
        //reference to a static method
        MyInterface myInterface1=MyClass::disp;
        myInterface1.display("Utkarsh");
        //reference to parameterized constructor
        MyInterface myInterface2=MyClass::new;
        myInterface2.display("Bro");
        //reference to in-built method
        MyInterface myInterface3=System.out::println;
        myInterface3.display("How are u");

        //implementing consumer functional interface
        Consumer<String> consumer=new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        };
        consumer.accept("Hello world");

        Supplier supplier=new Supplier() {
            @Override
            public Object get() {
                return 85;
            }
        };

        String str="utku";
        Predicate<String> predicate=str::equals;
        System.out.println(predicate.test(str));


    }
}
