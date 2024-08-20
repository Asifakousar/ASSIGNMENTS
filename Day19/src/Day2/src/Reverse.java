import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int n = 123;
            int res=0;
            while(n!=0)
            {
                int t=n%10;
                res=10*res+t;
                n=n/10;
            }
        System.out.println(res);
        }
    }
