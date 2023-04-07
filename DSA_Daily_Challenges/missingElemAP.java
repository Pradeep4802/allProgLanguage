import java.lang.*;
import java.util.*;

class missingElemAP {
    public static int findMissing(int[] arr, int n) {
        // code here
        int diff1 = 0;
        int diff2 = 0;
        if (n > 2) {
            for (int i = 0; i < n; i++) {
                if (i < n - 1) {
                    int j = i + 1;
                    do {
                        diff1 = Math.abs((arr[i]) - (arr[j]));
                        // diff1 = Math.abs(Math.abs((arr[i])) - Math.abs((arr[j])));
                        // diff1 = Math.abs(-42 - -16);
                        diff2 = Math.abs(arr[i+1] - arr[j+1]);
                        // System.out.println(diff1);
                        if (diff1 == diff2) {
                            break;
                        } else {
                            int ans = arr[j + 1] - diff1;
                            return ans;
                        }
                    } while (j < n - 1);
                }
            }
        }
        else if(n == 2) {
            if (arr[0] < 0 || arr[1] < 0) {
                diff1 = Math.abs(Math.abs((arr[0])) - (arr[1])) / 2;
                return -diff1;
            }
            else if(arr[0] > 0 && arr[1] > 0) {
                diff1 = (arr[0] + arr[1]) / 2;
            }
            return diff1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 4, 8, 10, 12, 14 };
        // int arr[] = { -42, -16 };
        // int arr[] = { -26, 10 };
        int arr[] = { 29, 11 };
        int n = arr.length;
        System.out.println(findMissing(arr, n));
    }
}
