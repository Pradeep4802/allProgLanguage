import java.util.ArrayList;
import java.util.*;

public class subarray_with_given_sum {
    // First Approach using nested loop
    // public static void subarray(int arr[], int n,int target) {
    // int currsum = 0,i,j;
    // for (i = 0; i < arr.length; i++) {
    // currsum = arr[i];
    // for (j = i+1; j <= arr.length; j++) {
    // if (currsum == target) {
    // System.out.println("The subarray found between: " + i + " and " + (j-1));
    // }
    // else if(currsum > target || j == n) {
    // break;
    // }
    // currsum += arr[j];
    // }
    // }
    // System.out.println("Not Found");
    // }

    // 2nd Approach using ArrayList from colection frameworks
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> arayl = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arayl.add(arr[i]);
        }
        ArrayList<Integer> aray2 = new ArrayList<>();
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum = arayl.get(i);
            for (int j = i + 1; j <= arr.length; j++) {
                if (currsum == s) {
                    aray2.add(i + 1);
                    aray2.add(j);
                    return aray2;
                }
                if (currsum > s || j == n) {
                    break;
                }
                currsum += arayl.get(j);
            }
        }
        aray2.add(-1);
        return aray2;
    }

    // 3rd approach by sliding window
    int subArraySum(int arr[], int n, int sum) {
        int currentSum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If currentSum exceeds the sum,
            // then remove the starting elements
            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }

            // If currentSum becomes equal to sum,
            // then return true
            if (currentSum == sum) {
                int p = i - 1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
            if (i < n)
                currentSum = currentSum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }

            subarray_with_given_sum obj = new subarray_with_given_sum();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for (int ii = 0; ii < res.size(); ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
        // int arr[] = {1,4,20,3,10,5};
        // ArrayList<Integer> arrli = new ArrayList<Integer>();
        // // subarray(arr,arr.length,33);
        // int sum = arrli.add(subarraySum(arr,arr.length,33));
    }
}
