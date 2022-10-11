// import java.lang.*;s
import java.util.*;

public class fit_array {
    // Function for finding maximum and value pair
    public static boolean isFit(int arr[], int brr[], int n) {
        // Complete the function
        Arrays.sort(arr);
        Arrays.sort(brr);
        int flag = 0;
        if (arr.length == brr.length) {
            for (int i = 0; i < n; i++) {
                if (arr[i] > brr[i]) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 3, 2 };
        int brr[] = { 5, 4, 8, 7 };
        int n = 4;
        boolean b = isFit(arr, brr, n);
        System.out.println(b);
    }
}
