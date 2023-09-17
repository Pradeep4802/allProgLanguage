import java.util.Arrays;

public class FindTwoElement {
    public static int[] findTwoElement(int arr[], int n) {
        //code 1
        // int[] ans = new int[2];
        // boolean[] seen = new boolean[n + 1];

        // for (int num : arr) {
        //     if (seen[num]) {
        //         ans[0] = num; // Found the repeating element
        //     } else {
        //         seen[num] = true;
        //     }
        // }

        // for (boolean b : seen) {
        //     System.out.print(b + " ");
        // }

        // for (int i = 1; i <= n; i++) {
        //     if (!seen[i]) {
        //         ans[1] = i; // Found the missing element
        //         break;
        //     }
        // }

        // return ans;

        // code 2
        long s = 0,p = n;
        Arrays.sort(arr);
        int[] a = {-1,-1};
        for(int i = 0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                a[0] = arr[i];
                break;
            }
        }
        for(int i = 0;i<n;i++){
            s+=arr[i];
        }
        a[1] = ((int)(p*(p+1)/2) - (int)(s-a[0]));
        return a;
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 2 };
        int arr[] = { 1, 3, 3 };
        // int arr[] = {13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15,
        // 34, 46, 30, 26, 41, 18, 5, 17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14,
        // 36, 7, 38, 12, 1, 42, 12, 28, 22, 45};
        // int arr[] = {12, 7, 5, 1, 13, 1, 10, 8, 11, 9, 2, 4, 3, 6};
        int nums[] = findTwoElement(arr, arr.length);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
