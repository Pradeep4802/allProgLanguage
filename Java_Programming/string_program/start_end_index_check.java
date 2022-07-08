import java.util.Scanner;

// Write a java code to check whether the string "madam" is starting and ending with a same letter.

public class start_end_index_check {
    public static void main(String[] args) {
        String str = "madam";
        boolean n1 = str.startsWith("m");
        boolean n2 = str.endsWith("m");

        if (n1 == n2) {
            System.out.println("'" + str + "'" + " first and last character are same");
        } else {
            System.out.println("'" + str + "'" + " first and last character are not same");
        }
        // System.out.println(n1);
    }
}
