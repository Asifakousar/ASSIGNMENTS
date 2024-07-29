import java.util.*;
public class LinearSearch {
    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] myArray = {"apple", "banana", "cherry", "date", "fig"};
        String targetString = "cherry";
        int result = linearSearch(myArray, targetString);

        if (result != -1) {
            System.out.println("'" + targetString + "' found at index " + result + ".");
        } else {
            System.out.println("'" + targetString + "' not found in the array.");
        }
    }
}
