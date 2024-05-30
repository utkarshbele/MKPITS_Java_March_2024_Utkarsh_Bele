package interface9_4;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("It eats mouse");
    }

    @Override
    public void sleep() {
        System.out.println("it sleeps day and night");
    }

    @Override
    public void make_Sound() {
        System.out.println("it makes meow sound");
    }
}
