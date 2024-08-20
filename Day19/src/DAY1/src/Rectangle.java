import java.util.*;
public class Rectangle {
    public void area(int len, int wid){
        System.out.println("The area is: " + len*wid);
    }

    public void perimeter(int len, int wid){
        System.out.println("The perimeter is: " + 2*(len+wid));
    }
    public static void main(String[] args){
        int len=12;
        int width=16;
        System.out.println(len);
        System.out.println(width);
        Rectangle rec = new Rectangle();
        rec.area(len,width);
        rec.perimeter(len, width);
    }

}
