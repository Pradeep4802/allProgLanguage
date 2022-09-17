import java.util.*;
import java.lang.*;

class palindrome {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int sum = 0;
        int num = x;
        if(x != Math.abs(x))
            return false;
        while (num != 0) {
            rev = num % 10;
            sum = sum*10 + rev;
            num /= 10;
        }
        if (x == sum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = -121;
        System.out.println(isPalindrome(num));
    }
}