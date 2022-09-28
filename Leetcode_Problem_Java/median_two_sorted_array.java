import java.util.*;
// import java.lang.*;

public class median_two_sorted_array {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] mergeArray = new int[n + m];
        System.arraycopy(nums1, 0, mergeArray, 0, n);
        System.arraycopy(nums2, 0, mergeArray, n, m);
        Arrays.sort(mergeArray);

        int size = mergeArray.length;
        // base condition
        if (mergeArray.length == 0)
            return 0;

        if (size % 2 == 0) {
            int a = size / 2;
            double b = mergeArray[a];
            double c = mergeArray[a - 1];
            return (b + c) / 2;
        } else {
            int ans = size / 2;
            return mergeArray[ans];
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3 };
        int arr2[] = { 2 };
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
