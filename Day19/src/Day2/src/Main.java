
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = scan.nextInt();
        // intialize the array with user
        int [] Main = new int[n];
        for(int i=0; i<5; i++){
            System.out.print("Enter element ");
            Main[i] = scan.nextInt();
        }
        System.out.println("Array elements:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Main[i]);
        }

        // Close the scanner
        scan.close();



    }
}