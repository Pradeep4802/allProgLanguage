public class number_5_to_1 {
    public static void printNumb(int n) {
        if (n == 0) { // BASE CASE
            return;
        }
        System.out.println(n); // print
        printNumb(n - 1); // RECURSION
    }

    public static void main(String[] args) {
        int n = 5;
        printNumb(n); // n=5
    }
}
.