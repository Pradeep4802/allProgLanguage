import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class compare_two_num {
    public static void main(String[] args) {
        Scanner com = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = com.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = com.nextInt();

        if (num1 == num2) {
            System.out.print(num1);
            System.out.print(" = ");
            System.out.print(num2);
        } else if (num1 < num2) {
            System.out.print(num1);
            System.out.print(" < ");
            System.out.print(num2);
        } else {
            System.out.print(num1);
            System.out.print(" != ");
            System.out.print(num2);
        }
    }

}
