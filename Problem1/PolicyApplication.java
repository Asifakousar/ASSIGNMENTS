package Problem1;
import java.util.*;
public class PolicyApplication
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("enter the driving history poor/good");
        String drive=sc.next();
        System.out.println("enter the health issues yes/no");
        String health=sc.next();
        try
        {
            if(age<18) throw new InvalidAgeException("age");
            if(drive.equals("poor")) throw new PoorDrivingException("poor");
            if(health.equals("yes")) throw new HealthIssueException("health");
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
        catch(PoorDrivingException e)
        {
            System.out.println(e);
        }
        catch(HealthIssueException e)
        {
            System.out.println(e);
        }
    }
}
