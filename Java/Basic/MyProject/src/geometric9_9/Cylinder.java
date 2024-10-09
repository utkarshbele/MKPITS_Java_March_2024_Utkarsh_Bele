package geometric9_9;
public class Cylinder extends Shape {
    double h,r;
    public void getHeight(double r,double h)
    {
        this.h=h;
        this.r=r;
    }
    @Override
    public double area() {
        return 2*Math.PI*((r*h)+(r*r));
    }

    @Override
    public double perimeter() {
        return (2*Math.PI*(r+h));
    }

    @Override
    public double volume() {
        return Math.PI*r*r*h;
    }
}
