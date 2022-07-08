// Write a java program to input any number 'n' and print product of all of digits of number

public class product_digit {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        int sum = 1;
        int rem = 0;
        int num1 = num;
        while (num != 0) {
            rem = num % 10;
            sum *= rem;
            num /= 10;
        }

        System.out.println("Sum of digit of " + num1 + " is " + sum);
    }
}
