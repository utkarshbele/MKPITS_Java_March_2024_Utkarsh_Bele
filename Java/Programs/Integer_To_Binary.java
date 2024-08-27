public class Integer_To_Binary {
//    public static void main(String[] args) {
//        Integer val=756;
//        System.out.println(Integer.toBinaryString(val));
//    }

    public static void main(String[] args) {
        int number = 25;
        System.out.println("Binary representation of " + number + " is: " + convertToBinary(number));
    }

    public static String convertToBinary(int number) {
        StringBuilder binaryString = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            binaryString.append(remainder);
            number = number / 2;
        }

        return binaryString.reverse().toString();
    }
}
