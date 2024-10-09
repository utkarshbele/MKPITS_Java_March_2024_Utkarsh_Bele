package LamdaExpression;

public class MyClass {
    MyClass(){}
    MyClass(String str)
    {
        System.out.println("hello "+str);
    }
    public void display(String str)
    {
        System.out.println("Hello "+str);
    }
    //this method and interface method need to have same arguments
    public static void disp(String str)
    {
        System.out.println("Hello "+str);
    }
}
