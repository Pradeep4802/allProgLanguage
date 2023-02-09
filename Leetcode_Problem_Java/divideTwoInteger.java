import java.util.*;
import java.lang.*;

public class divideTwoInteger {
    public static int divide(int dividend, int divisor) {
        double sol = dividend / divisor;
        System.out.println(sol);
        if(dividend < 0 && divisor < 0) {
            double absol = Math.abs(sol);
            return (int)absol;
        }
        // System.out.println(absol);
        double tot = Math.round(sol);
        return (int)tot;
    }

    //***********************Anothr example to solve this problem********************* */
    // public int divide(int dividend, int divisor) {
    
    //     if (dividend == -2147483648 && divisor == -1) {
    //         return (2147483647);
    //     }
    //     return Helper (dividend, divisor);       
    // }
    //   static int Helper(int x, int y) {
    
    //     if (x == 0) {
    //         return 0;
    //     }
    
    //     if (x < 0 && y < 0) {
    //         int res = Math.abs(x / y);
    //         if (res > 2147483647) {
    //             return 2147483647;
    //         }
    //         return res;
    //      }
    
    //     if (x < 0 || y < 0) {
    //         int res =  -Math.abs(x / y);
    //         if (res < -2147483648) {
    //             return -2147483648;
    //         }
    //         return res;
    //     }
    //     return Math.abs(x / y);
    //    }
    // }

    public static void main(String[] args) {
        int dividend = 7;
        int divisor = -3;
        System.out.println(divide(dividend,divisor));
    }
}
