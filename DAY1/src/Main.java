import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        double tail = 0;
        Random rd = new Random();

        for(int i = 1; i <= n; i++) {
            double r = rd.nextDouble();
            if (r < 0.5) {
                tail++;
            }
        }
        double probTail = (tail / n)*100;
        double probHead = 100 - probTail;
        System.out.println("Probability of heads" + probHead);
        System.out.println("Probability of tails" + probTail);
        int sid = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
        int grade = sc.nextInt();
        Student s = new Student(sid,name,age,grade);
        s.details();
        Stringreq a = new Stringreq();
        a.fun2();



    }

}
