import java.util.Scanner;
public class Divisble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Enter the number");
        no=sc.nextInt();
        if((no%5==0)&&(no%7==0)){
            System.out.println("The given number is divisible by 5 and 7");
        }
        else {
            System.out.println("The given number is not divisible by 5 and 7");
        }

    }
}
