package degree;
public class Converter
{
    private double result;
    public double c_F(double num)
    {
        result = (num*9/5)+32;
        return result;
    }
    public double f_C(double num)
    {
        result  = ((num-32)*5)/9;
        return result;
    }
}
