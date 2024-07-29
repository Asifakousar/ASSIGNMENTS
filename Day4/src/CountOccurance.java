
import java.util.*;
public class CountOccurance {
    public static void main(String[] args) {
        String s = "Go Digit";
        int total_count = s.length();
        int totalcount_afterremove = s.replace("D","").length();
        int count=total_count-totalcount_afterremove;
        System.out.println("Count Occurrences of a Character:"+count);

    }


}
