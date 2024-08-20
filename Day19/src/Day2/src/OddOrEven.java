import java.util.Scanner;
public class OddOrEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int n = sc.nextInt();
        if ((n & 1) == 0) {
            System.out.println("The number is Even number");
        }
        else{
            System.out.println("The number is Odd number");
        }
    }
}
