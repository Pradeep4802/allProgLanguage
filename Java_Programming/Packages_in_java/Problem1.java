package calc;
import java.util.Scanner; 

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + a+b);
    }
}

class ScCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + Math.sin(a+b));
    }
}

class MyCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + a+b);
        System.out.println("Your result is: " + Math.sin(a+b));
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("I am amin method");
    }
}