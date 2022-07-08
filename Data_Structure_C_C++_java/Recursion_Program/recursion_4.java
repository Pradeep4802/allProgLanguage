// package Recursion_Program;

public class recursion_4 {
    public static int calcFactorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        int fact = calcFactorial(n-1);
        int fact_n = n * fact;
        return fact_n;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calcFactorial(n);
        System.out.println(ans);
    }
}
