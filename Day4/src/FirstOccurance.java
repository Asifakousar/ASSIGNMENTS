import java.util.*;
public class FirstOccurance {
    public static void main(String[] args) {
        int a[] = {2,5,6,7,10,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=0;i<a.length;i++) {
            if (num == a[i]) ;
            {
                System.out.println("The given number" + num + "is first occurance");
            }
        }
    }
}
