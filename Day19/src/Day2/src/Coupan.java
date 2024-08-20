import java.util.*;
public class Coupan {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of distinct coupon numbers: ");
            int N = sc.nextInt();

            int t = fun(N);

            System.out.println("Total random numbers needed to generate all distinct coupons: " + t);
        }
        public static int fun(int N){
            Map<Integer, Integer> c = new HashMap<>();
            Random random = new Random();
            int count = 0;

            while (c.size() < N) {
                int r = random.nextInt(N);
                c.put(r, 1);
                count++;
            }
            return count;
        }

}

