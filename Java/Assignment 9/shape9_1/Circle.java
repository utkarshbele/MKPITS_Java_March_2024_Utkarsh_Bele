package shape9_1;
public class Circle extends Shape{
    double r;
    public void radius(double r)
    {
        this.r=r;
    }
    public  double area()
    {
        return (3.14) * r * r;
    }
    public  double perimeter()
    {
        return 2*3.14*r;
    }
}
