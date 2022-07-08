
// Write a java program to get output as shown below by giving input like 'D' character
// A
// BA
// CBA
// DCBA
import java.util.Scanner;

public class alphabet_patt_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String let = sc.next();
        int dig = let.charAt(0);

        for (int i = 65; i < dig; i++) {
            for (int j = 0; j < dig; j++) {
                System.out.println((char) i);
            }
        }
        // System.out.println(dig);
    }
}
