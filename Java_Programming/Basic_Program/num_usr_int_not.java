// Write a Java program to detect whether a number entered by the user is integer or not.

import java.util.Scanner;

public class num_usr_int_not {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int nm1 = num.nextInt();

        if ((((Object) nm1).getClass().getSimpleName()) == Integer) {
            System.out.println("Number is integer.");
        } else {
            System.out.println("Number is not integer.");
        }
    }
}