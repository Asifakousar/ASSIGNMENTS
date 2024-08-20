import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check leap year or not");
        int a = sc.nextInt();
        if(a%400==0 || (a%4==0 && a%100!=0)){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}

