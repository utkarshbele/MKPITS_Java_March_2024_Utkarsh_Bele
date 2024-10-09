package eg_anonymous_class_without_thread;

public class CalculateAll
{
    public static void main(String[] args) {

    Calc add= new Calc() {
        @Override
        public float calculate(float a,float b) {
            return a+b;
        }
    };
    Calc sub= new Calc() {
        @Override
        public float calculate(float a,float b) {
            return a-b;
        }
    };
    Calc mul= new Calc() {
        @Override
        public float calculate(float a,float b) {
            return a*b;
        }
    };
    Calc div= new Calc() {
        @Override
        public float calculate(float a,float b) {
            return a /b;
        }
    };
        System.out.println(add.calculate(5,50));
        System.out.println(sub.calculate(10.5F,3));
        System.out.println(mul.calculate(2,3));
        System.out.println(div.calculate(21,3));
    }
}
