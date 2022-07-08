// WAJP to get the character at trhe given index within the string.

import java.util.Scanner;

public class char_at_given_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int ind1 = str.charAt(0);
        int ind2 = str.charAt(10);

        System.out.println("The charcter at the position 0 and 10: " + (char)ind1 + " " + (char)ind2);
    }
}
