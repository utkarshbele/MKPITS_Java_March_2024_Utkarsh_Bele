package sort9_14;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println("BubbleSort result: " + Arrays.toString(array));
        }
}

