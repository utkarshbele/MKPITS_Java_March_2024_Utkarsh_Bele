package geometric9_9;

public class Cube extends Shape{
    double side;
    public void getSide(double side){
        this.side=side;
    }
    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }
}
