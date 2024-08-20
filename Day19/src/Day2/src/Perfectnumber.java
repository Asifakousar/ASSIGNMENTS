import java.util.*;
public class Perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i*i<n;i++)
        {
            if((n%i)==0) {
                sum = sum + i;
                sum+=n/i;
            }
        }
        sum=sum-n;
        if(sum==n) System.out.println(n+"  is perfect number ");
        else System.out.println(n+" is not a perfect number ");
    }
}