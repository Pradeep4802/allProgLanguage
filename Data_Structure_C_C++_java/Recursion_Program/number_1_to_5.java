// package Recursion_Program;

public class number_1_to_5 {
    public static void printNumb(int n) {
        if (n == 6) { // BASE CASE
            return;
        }
        System.out.println(n); // print
        printNumb(n + 1); // RECURSION
    }

    public static void main(String[] args) {
        int a = 1;
        printNumb(a);
    }
}
