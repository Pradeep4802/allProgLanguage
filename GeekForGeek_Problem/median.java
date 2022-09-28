import java.util.*;
// import java.lang.*;

public class median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int arr[] = new int[(a + b)];
        double median = 0;
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[i + a] = nums2[i];
        }
        Arrays.sort(arr);
        median = ((double) arr[arr.length / 2] + (double) arr[(arr.length / 2) - 1]) / 2;
        if (arr.length % 2 != 0) // odd
        {
            return arr[arr.length / 2];
        } else // even
        {
            return ((double) arr[arr.length / 2] + (double) arr[(arr.length / 2) - 1]) / 2;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3 };
        int arr2[] = { 2 };
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}






          