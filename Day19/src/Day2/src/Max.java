import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("First "+ num1);
        System.out.println("Second"+ num2);
        System.out.println("Third"+ num3);
        if(num1>num2 && num1>num3){
            System.out.println("num1 is larger:"+ num1);
        }
        else if(num2>num1&&num2>num3){
                System.out.println("num2 is larger:"+ num2);
        }
        else{
            System.out.println("num3 is larger:"+num3);
        }
        }

}
