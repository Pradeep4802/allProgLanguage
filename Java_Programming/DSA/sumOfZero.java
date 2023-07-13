import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sumOfZero {
    public static Boolean find_subarray_sum_zero(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int suba_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            suba_sum += nums[i];

            if (set.contains(suba_sum)) {
                return true;
            }
            set.add(suba_sum);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, -2, 3, 4, 5, 6 };
        System.out.println("Original array: " + Arrays.toString(nums1));
        System.out.println("Does the said array contain a subarray with 0 sum: " + find_subarray_sum_zero(nums1));
        int[] nums2 = { 1, 2, 3, 4, 5, 6 };
        System.out.println("\nOriginal array: " + Arrays.toString(nums2));
        System.out.println("Does the said array contain a subarray with 0 sum: " + find_subarray_sum_zero(nums2));
        int[] nums3 = { 1, 2, -3, 4, 5, 6 };
        System.out.println("\nOriginal array: " + Arrays.toString(nums3));
        System.out.println("Does the said array contain a subarray with 0 sum: " + find_subarray_sum_zero(nums3));
    }
}
