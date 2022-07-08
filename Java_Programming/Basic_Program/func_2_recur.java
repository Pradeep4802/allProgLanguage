public class func_2_recur {
    public static void fun(int n) {
        System.out.println(n);
        if (n > 2) {
            fun(n - 1);
            fun(n - 2);
            fun(n - 3);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        fun(n);
    }
}