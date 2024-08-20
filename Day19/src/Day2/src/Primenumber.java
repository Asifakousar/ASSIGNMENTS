import java.util.*;
public class Primenumber {
    public static void main(String[] args)
        {
            int n=9;
            int cnt=0;
            if(n==1||n==0)
            {
                System.out.println("it is not a prime number");
            }
            for(int i=1;i*i<n;i++)
            {
                if(n%i==0) cnt+=2;
            }
            if(cnt==2)
            {
                System.out.println("it is a prime number");
            }
            else {
                System.out.println("it is not a prime number");
            }
        }

}

