
// package printing;
import java.util.*;

public class Printing {
    public static void main(String[] args) {
        // int x = 10, y = 20;

        int x = 10;
        float y=0.0012f;
        char z='A';
        String str="Java Program";

        // System.out.println("Number is "+y);
        // System.out.println("Sum of " + x + " and " + y + " is " + (x + y));

        System.out.printf("%3$s %2$f %1$d", x,y,str);
    }
}
