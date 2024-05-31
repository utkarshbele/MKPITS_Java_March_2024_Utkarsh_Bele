package geometric9_9;

public class Sphere extends Shape{
    double r;
    public void getRadius(double r){
        this.r=r;

    }
    public double area() {
        return 4*Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        System.out.println("It does not have perimeter");
        return 0;
    }

    @Override
    public double volume() {
        return (double)(4/3)*Math.PI*r*r*r;
    }
}
