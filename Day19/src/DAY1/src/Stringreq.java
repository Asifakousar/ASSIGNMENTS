import java.util.Scanner;

public class Stringreq {
    public void fun2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1rst string to check if they are equal or not");
        String a = sc.next();
        System.out.println("Enter 2nd string");
        String b = sc.next();
        if(a.equals(b)){
            System.out.println("Strings are equal to check if they are equal or not");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
