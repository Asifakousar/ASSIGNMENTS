import java.util.Scanner;
import static java.lang.Math.pow;
public class Powerof2 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();
            for (int i = num; i >= 0; i--) {
                System.out.println("2 to the Power " + i + ": " + Math.pow(2,i));
            }

        }
    }
}
