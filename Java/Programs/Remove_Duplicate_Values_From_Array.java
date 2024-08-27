import java.util.*;

public class Remove_Duplicate_Values_From_Array {

    public static void main(String[] args) {
        // Example array with duplicate elements
        Integer[] array = {1, 2, 3, 2, 4, 5, 1, 6, 3, 7};

        // Create a HashSet from the List (which automatically removes duplicates)
        //using asList method which converts array to a list
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        Integer[] uniqueArray = set.toArray(new Integer[0]);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }

//    public static void main(String[] args) {
//        int[] array = {4, 2, 7, 2, 4, 8, 9, 1, 8, 7};
//        int[] result = removeDuplicates(array);
//
//        System.out.println("Array without duplicates: " + Arrays.toString(result));
//    }
//
//    public static int[] removeDuplicates(int[] array) {
//        // Sort the array
//        Arrays.sort(array);
//
//        // Temporary array to store unique elements
//        int[] temp = new int[array.length];
//        int j = 0;
//
//        // Iterate through the sorted array and add unique elements to temp
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] != array[i + 1]) {
//                temp[j++] = array[i];
//            }
//        }
//
//        // Add the last element (as it hasn't been compared in the loop)
//        temp[j++] = array[array.length - 1];
//
//        // Create a new array with the exact size of unique elements
//        int[] result = new int[j];
//        for (int i = 0; i < j; i++) {
//            result[i] = temp[i];
//        }
//
//        return result;
//    }
}