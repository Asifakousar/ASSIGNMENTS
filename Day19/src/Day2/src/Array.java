import java.util.*;
public class Array {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,6,7,8,9};
        //create a variable count numbers
        int count_even=0;
        int count_odd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            {
               count_even++;
            }
            else{
                count_odd++;
            }
        }
        System.out.println("The number of even numbers:"+count_even);
        System.out.println("The number of odd numbers:"+count_odd);

    }
}
