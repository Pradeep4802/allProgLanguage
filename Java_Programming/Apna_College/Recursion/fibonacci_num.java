public class fibonacci_num {
    public static int fibo(int n) {
        if(n == 0) 
            return 0;
        if(n == 1) 
            return 1;
        int fibN1 = fibo(n-1);
        int fibN2 = fibo(n-2);
        return fibN1 + fibN2;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibo(23));
        System.out.println(fibo(24));
        System.out.println(fibo(25));
        System.out.println(fibo(26));
        System.out.println(fibo(27));
        System.out.println(fibo(28));
    }
}
