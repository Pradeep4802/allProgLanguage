
// Write a Java program to convert a decimal number to octal number.
import java.util.Scanner;

public class dec_to_oct_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        String num = sc.nextLine();

        int dec_oct[] = new int[100];
        int dec_oct01[] = new int[100];
        int dum[] = new int[num.length()];

        int d = -1;
        for (int i = 0; i < num.length(); i++) {
            dum[i] = num.charAt(i) - 48;
            if (dum[i] == -2) {
                d = i;
            }
        }

        if (d != -1) {
            int qt = 0;
            for (int i = 0; i < d; i++) {
                qt = (qt * 10) + dum[i];
            }
            int i = 1;
            while (qt != 0) {
                dec_oct[i++] = qt % 8;
                qt = qt / 8;
            }

            int num1 = 0, flag = 1;
            for (int j = d + 1; j <= num.length() - 1; j++) {
                num1 = (num1 * 10) + dum[j];
                flag = flag * 10;
            }
            float num2 = (float) num1 / (float) flag;
            int k = 0;
            while (num2 > 0) {
                num2 = num2 * 8;
                int a = (int) num2;
                num2 = num2 - a;
                dec_oct01[k] = a;
                k++;
            }
            int m = 0;
            System.out.println("Octal Number is : ");
            for (int j = i - 1; j > 0;) {
                System.out.print(dec_oct[j--]);
            }
            System.out.print(".");
            while (m < 6) {
                System.out.print(dec_oct01[m++]);
            }
        } else {
            int qt = 0;
            for (int i = 0; i < dum.length; i++) {
                qt = (qt * 10) + dum[i];
            }
            int i = 1;
            while (qt > 0) {
                dec_oct[i++] = qt % 8;
                qt = qt / 8;
            }

            System.out.println("Octal Number is : ");
            for (int j = i - 1; j > 0; j--) {
                System.out.print(dec_oct[j]);
            }
        }

    }
}
