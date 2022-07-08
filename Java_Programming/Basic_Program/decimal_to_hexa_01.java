
// program to calculate decimal to hexadecimal
import java.util.Scanner;

class decimal_to_hexa_01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the decimal to find it's hexadecimal : ");
        String n = sc.nextLine();
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        String hexvalue_int = "";
        String hexvalue_decimal = "";
        int decimal[] = new int[n.length()];
        int d = -1, integer_value = 0;
        // changing the string into integer
        for (int i = 0; i <= n.length() - 1; i++) {
            decimal[i] = (int) n.charAt(i) - 48;
            if (decimal[i] == -2) {
                d = i;
            }
            integer_value = (integer_value * 10) + decimal[i]; // taking integer value as it is
            // System.out.println(decimal[i]+" ");
        }
        // System.out.println(d+ " "+integer_value);
        // if given number is a decimal number
        if (d != -1) {
            int quotient = 0, rem = 0; // finding hexadecimal for integer value
            for (int i = 0; i < d; i++) {
                quotient = (quotient * 10) + decimal[i];
            }
            while (quotient > 0) {
                rem = quotient % 16;
                hexvalue_int = hex[rem] + hexvalue_int;
                quotient = quotient / 16;
            }
            // System.out.println(d);
            // System.out.println(hexvalue_int);
            // finding decimal value
            int num = 0, flag = 1;
            for (int i = d + 1; i <= n.length() - 1; i++) {
                num = (num * 10) + decimal[i];
                flag = flag * 10;
            }
            // System.out.println(num + " "+flag);
            float num1 = (float) num / (float) flag;
            while (num1 > 0) // finding hexadecimal value for decimal value/fractional value
            {
                num1 = num1 * 16;
                int a = (int) num1;
                num1 = num1 - a;
                hexvalue_decimal = hexvalue_decimal + hex[a];
            }
            System.out.println(hexvalue_int + "." + hexvalue_decimal);
        }
        if (d == -1) {
            int quotient = integer_value, rem = 0;
            // System.out.println(quotient);
            for (int i = 0; i < d; i++) {
                quotient = (quotient * 10) + decimal[i];
            }
            while (quotient > 0) {
                rem = quotient % 16;
                hexvalue_int = hex[rem] + hexvalue_int;
                quotient = quotient / 16;
            }
            System.out.println(hexvalue_int);
        }
    }
}