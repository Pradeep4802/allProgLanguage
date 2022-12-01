import java.util.*;
import java.lang.*;

public class tryCatchBlock {
    public static void main(String args[]) {
        // System.out.println("Hello");
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            c = a / b;
            System.out.println("Division is" + c);

        }
        catch(ArithmeticException e) {
            System.out.println("Denominator should not be 0, try again");
        }

        System.out.println("Bye");
    }
}