package area;
public class AreaCalculator {
        private float result,radius,side,length,breadth,base,height;
        public float areaCircle(float radius)
        {
            result = radius * radius;
            return result;
        }
        public float areaSquare(float side)
        {
            result = side * side;
            return result;
        }
        public float areaRectangle(float length, float breadth)
        {
            result = length * breadth;
            return result;
        }
        public float areaTriangle(float base, float height)
        {
            result = (1/2) * base * height;
            return result;
        }

    }




