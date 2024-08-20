import java.util.Scanner;
public class Rotation {
    public static void main(String[] args) {
        int[] arr={2,3,8,9,12,18};
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=6-x%6;i<2*6-x;i++){
            System.out.println(arr[i%6]);
        }
//        arr[0]=x;
//        System.out.println(arr);
    }
}
