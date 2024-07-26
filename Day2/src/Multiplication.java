import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Table of number");
        int num = sc.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(num +" * " + (i+1) + " = " +(num * (i+1)));
        }
    }
}
