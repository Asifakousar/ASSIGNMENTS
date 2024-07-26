import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int n = sc.nextByte();
        if (n<=33){
            System.out.println("Fail");
        }else{
            System.out.println("Pass");
        }
    }
}
