package shape9_1;

public class Rectangle extends Shape
{
    double l,b;
    public void sides(double l, double b)
    {
        this.l=l;
        this.b=b;
    }
    public  double area()
    {
        return l*b;
    }
    public  double perimeter()
    {
        return 2*(l+b);
    }
}
