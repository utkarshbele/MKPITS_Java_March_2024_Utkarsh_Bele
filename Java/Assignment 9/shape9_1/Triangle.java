package shape9_1;

public class Triangle extends Shape
{
    double b,h;
    public void side(double b, double h)
    {
        this.b=b;
        this.h=h;
    }
    public  double area()
    {
        return (0.5) * b * h;
    }
    public  double perimeter()
    {
        return 3*b;
    }
}
