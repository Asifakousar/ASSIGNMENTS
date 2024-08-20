import java.util.*;
public class Userarray {
    public static void main(String[] args) {
        int a[] ={2,3,4,6,17,20};
        //logic to find max and min
        int max= a[0];
        int min=a[1];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("The maximum number in the given array:"+max);
        System.out.println("The minimum number in the given array:"+min);

    }
}
