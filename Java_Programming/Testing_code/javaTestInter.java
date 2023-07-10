import java.util.*;

public class javaTestInter {

    public static boolean decimalPointCheck(double num1, double num2) {
        num1 = Math.round(num1 * 100);
        System.out.println(num1);
        num1 = num1 / 100;

        num2 = Math.round(num2 * 100);
        System.out.println(num2);
        num2 = num2 / 100;

        if (num1 == num2)
            return true;
        else
            return false;
    }

    public static int sumNatural(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        return sum;
    }

    public static int sumOddNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if(i % 2 != 0) sum += i;
        }
        return sum;
    }

    public static int countNumber(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {

        // 1st program

        // System.out.println(100 + 100 + "Simpli" + 100 + 100);
        // System.out.println("Simpli" + 100 * 100);

        // 2nd program

        // int n = 20;
        // for(int i=n/5; i<=5 ; ++i) {
        // System.out.println("Hello");
        // }

        // 3rd Program : Write a Java program to get a number from the user and print
        // whether it is positive or negative.

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the first Number: ");
        // int n1 = sc.nextInt();
        // if (n1 > 0)
        // System.out.println("It is positive");
        // else if (n1 < 0)
        // System.out.println("It is negative");
        // else
        // System.out.println("It is zero");

        // 4th Program : Write a Java program to solve quadratic equations (use if, else
        // if and else).

        // System.out.println("Enter the a : ");
        // float a = sc.nextFloat();
        // System.out.println("Enter the b : ");
        // float b = sc.nextFloat();
        // System.out.println("Enter the c : ");
        // float c = sc.nextFloat();

        // double res = (b * b) - (4 * a * c);

        // if (res > 0) {
        // double r1 = (((-b) + Math.pow(res, 0.5)) / (2 * a));
        // double r2 = (((-b) - Math.pow(res, 0.5)) / (2 * a));
        // System.out.println("Root 1: " + r1 + "Root 2: " + r2);
        // }
        // else if(res == 0) {
        // double root = -b / (2.0*a);
        // System.out.println("Root : " + root);
        // }
        // else {
        // System.out.println("The equation has not real root");
        // }

        // 5th Program : Write a Java program that takes three numbers from the user and
        // prints the greatest number.

        // System.out.println("Enter the a : ");
        // float a = sc.nextFloat();
        // System.out.println("Enter the b : ");
        // float b = sc.nextFloat();
        // System.out.println("Enter the c : ");
        // float c = sc.nextFloat();

        // if(a > b && a > c) {
        // System.out.println(a + " is the greatest Number");
        // }
        // else if(b > c) {
        // System.out.println(b + " is the greatest number");
        // }
        // else {
        // System.out.println(c + " is the greatest number");
        // }

        // 6th Program: Write a Java program that reads a floating-point number and
        // prints "zero" if the number is zero. Otherwise, print "positive" or
        // "negative". Add "small" if the absolute value of the number is less than 1,
        // or "large" if it exceeds 1,000,000.

        // System.out.println("Enter the Number: ");
        // float num = sc.nextFloat();
        // if (num == 0.0)
        // System.out.println("Zero");
        // else if (num > 0.0) {
        // System.out.println("Positive");
        // } else {
        // System.out.println("negative");
        // }

        // if (Math.abs(num) <= 1.0)
        // System.out.println("Small");
        // if (Math.abs(num) >= 1000000)
        // System.out.println("large");

        // 7th Program: Write a Java program that takes a number from the user and
        // generates an integer between 1 and 7. It displays the weekday name.

        // System.out.println("Enter the Number: ");
        // int num = sc.nextInt();
        // switch (num) {
        // case 1:
        // System.out.println("monday");
        // break;
        // case 2:
        // System.out.println("tueday");
        // break;
        // case 3:
        // System.out.println("wednesday");
        // break;
        // case 4:
        // System.out.println("thursday");
        // break;
        // case 5:
        // System.out.println("friday");
        // break;
        // case 6:
        // System.out.println("saturday");
        // break;
        // case 7:
        // System.out.println("sunday");
        // break;

        // default:
        // System.out.println("Wrong Input");
        // break;
        // }

        // 8Th program: Write a Java program that reads two floating-point numbers and
        // tests whether they are the same up to three decimal places.

        // System.out.println("Enter the first float number: ");
        // double num1 = sc.nextDouble();
        // System.out.println("Enter the second float number: ");
        // double num2 = sc.nextDouble();

        // System.out.println("Result: " + decimalPointCheck(num1, num2));

        // 9th Program: Write a Java program to display n terms of natural numbers and their sum.

        // System.out.println("Enter the Number: ");
        // int num = sc.nextInt();

        // System.out.println("Sum of Natural Number: " + sumNatural(num));

        // 10th Program: Write a Java program that displays the sum of n odd natural numbers.

        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // System.out.println("Sum of odd natural number: " + sumOddNumber(num));

        // 11th Program: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Number is : " + countNumber(num));
    }

}