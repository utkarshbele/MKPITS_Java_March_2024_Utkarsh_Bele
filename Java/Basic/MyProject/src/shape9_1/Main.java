package shape9_1;
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius(5);
        System.out.println(c.area());
        System.out.println(c.perimeter());
        Rectangle rec = new Rectangle();
        rec.sides(5, 8);
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        Triangle tri = new Triangle();
        tri.side(5, 10);
        System.out.println(tri.area());
        System.out.println(tri.perimeter());
    }
}