import java.util.*;
public class Maximumelement {
    public static void main(String[] args) {
        int [] arr = new int [] {1,20,50,100,999};
        //Initialize max with first element of array.
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with max
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
