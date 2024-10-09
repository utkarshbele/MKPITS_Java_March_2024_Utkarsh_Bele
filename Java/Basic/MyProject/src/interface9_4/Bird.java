package interface9_4;

public class Bird implements Animal{
    @Override
    public void eat() {
        System.out.println("it eats worms");
    }

    @Override
    public void sleep() {
        System.out.println("it sleeps at night");
    }

    @Override
    public void make_Sound() {
        System.out.println("it makes chirp sound");
    }
}
