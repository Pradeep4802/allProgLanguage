// printing subsequences using my method
public class print_subsequences {
    static int count = 0;

    public static void subsequences(String s, int n, String ns) {
        if (n == s.length()) {
            System.out.println(ns);
            count++;
            // System.out.println(count);
            return;
        }
        // nhi lena hai
        subsequences(s, n + 1, ns);

        // lena hai
        char c = s.charAt(n);
        ns += c;
        subsequences(s, n + 1, ns);

    }

    public static void main(String[] args) {
        String s = "abc";
        int n = 0;
        String ns = "";
        subsequences(s, n, ns);

    }
}