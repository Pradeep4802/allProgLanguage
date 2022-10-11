
// Java code for Max
// Water Container
import java.io.*;

class GFG {

    // 1st Method: Naive Solution Time Complexity: O(n^2).

    public static int maxArea(int[] a) {

        int Area = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                Area = Math.max(
                        Area, Math.min(a[i], a[j]) *
                                (j - i));
            }
        }
        return Area;

        // 2nd method: two-Pointer  Time Complexity: O(n). 
        // int l = 0;
        // int r = len - 1;
        // int area = 0;

        // while (l < r) {
        //     // Calculating the max area
        //     area = Math.max(area,
        //             Math.min(A[l], A[r]) * (r - l));

        //     if (A[l] < A[r])
        //         l += 1;

        //     else
        //         r -= 1;
        // }
        // return area;
    }

    // Driver code
    public static void main(String[] args) {
        int a[] = { 1, 5, 4, 3 };
        int b[] = { 3, 1, 2, 4, 5 };

        System.out.println(maxArea(a));
        System.out.println(maxArea(b));
    }
}

