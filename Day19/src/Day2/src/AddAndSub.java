import java.util.Scanner;
public class AddAndSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();
        int c=a+b;
        int d=a-b;
        System.out.println("Sum of two numbers:"+c);
        System.out.println("sub of two numbers:"+d);


    }
}
