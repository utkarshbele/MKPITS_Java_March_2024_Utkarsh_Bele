package interface9_4;

public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("it eats eggs");
    }

    @Override
    public void sleep() {
        System.out.println("it sleeps afternoon and in the evening");
    }

    @Override
    public void make_Sound() {
        System.out.println("it barks");
    }
}
