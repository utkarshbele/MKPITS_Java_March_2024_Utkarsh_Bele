package geometric9_9;

public class Main {
    public static void main(String[] args) {
        Sphere sp=new Sphere();
        sp.getRadius(5.5);
        System.out.println(sp.area());
        System.out.println(sp.perimeter());
        System.out.println(sp.volume());

        Cube cu= new Cube();
        cu.getSide(12);
        System.out.println(cu.area());
        System.out.println(cu.perimeter());
        System.out.println(cu.volume());

        Cylinder cy=new Cylinder();
        cy.getHeight(5,15);
        System.out.println(cy.area());
        System.out.println(cy.perimeter());
        System.out.println(cy.volume());;

    }
}
