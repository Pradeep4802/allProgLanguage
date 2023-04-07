import java.util.ArrayList;

public class subarrayGivenSum {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        // ArrayList<Integer> ar = new ArrayList<>();
        // int i = 0, j = 0;
        // int sum = arr[0];
        // while (j < n) {
        //     // System.out.println(arr[i]);
        //     if (i > j) {
        //         ar.add(-1);
        //         return ar;
        //     }
        //     if (sum == s) {
        //         // System.out.println(arr[i]);
        //         // System.out.println(arr[j]);
        //         ar.add(i + 1);
        //         ar.add(j + 1);
        //         return ar;
        //     } else if (sum < s) {
        //         j++;
        //         try {
        //             sum = sum + arr[j];
        //         } catch (Exception e) {
        //             throw new ArrayIndexOutOfBoundsException();
        //         }
        //     } else if (sum > s) {
        //         sum -= arr[i];
        //         i++;
        //     }
        // }
        // ar.add(-1);
        // return ar;

        // 2nd method
        // int left = 0, right = 0, curr_sum = arr[0];
        // while (right < n) {
        // if (curr_sum == s) {
        // ArrayList<Integer> result = new ArrayList<Integer>();
        // result.add(left + 1); // add 1 to convert to 1-based indexing
        // result.add(right + 1);
        // return result;
        // } else if (curr_sum < s) {
        // right++;
        // if (right < n) {
        // curr_sum += arr[right];
        // }
        // } else {
        // curr_sum -= arr[left];
        // left++;
        // }
        // }
        // ArrayList<Integer> result = new ArrayList<Integer>();
        // result.add(-1);
        // return result;

        // 3rd method

        int left = 0;
        int right = 0;
        int sum = arr[0];

        ArrayList<Integer> ans = new ArrayList<Integer>();

        while (right < n) {
            if (sum == s) {
                ans.add(left + 1);
                ans.add(right + 1);
                return ans;
            } else if (sum < s || left == right) {
                if (right == n - 1)
                    break;
                right++;
                sum += arr[right];

            } else {
                sum -= arr[left];
                left++;
            }
        }

        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 7, 5 };
        // int arr[] = { 1, 2, 3, 4 };
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int s = 15;
        ArrayList<Integer> s1 = new ArrayList<>();
        s1 = subarraySum(arr, n, s);
        System.out.println(s1);
    }
}