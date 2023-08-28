public class PeakElement {

    public int findPeakElement(int[] nums) {
        // int left = 0;
        // int right = nums.length - 1;
        // int mid;
        // int len = nums.length;
        // if (nums.length == 1) {
        // return 0;
        // } else if (nums.length == 2) {
        // return nums[0] < nums[1] ? 1 : 0;
        // }
        // else if (nums[len - 1] > nums[len-2]) {
        // return len-1;
        // }

        // else {
        // while (left != right) {
        // mid = (left + right) / 2;
        // int minus = mid == 0 ? Integer.MIN_VALUE : nums[mid - 1];
        // int plusUltra = mid == nums.length - 1 ? Integer.MIN_VALUE : nums[mid + 1];
        // if (minus < nums[mid] && plusUltra < nums[mid]) {
        // return mid;
        // } else if (minus < nums[mid]) {
        // left = mid + 1;
        // } else {
        // right = mid - 1;
        // }
        // }
        // }
        // return 0;

        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > nums[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        PeakElement pk = new PeakElement();
        // int nums[] = { 1, 2, 1, 3, 5, 6, 4, 5 };
        // int nums[] = { 5, 7, 6, 4, 6, 3, 2 };
        // int nums[] = { 1 };
        // int nums[] = { 6, 5, 4, 3, 2, 3, 2 };
        int nums[] = { 1, 2, 3 };
        // int nums[] = { 3, 4, 3, 2, 1 };
        System.out.println(pk.findPeakElement(nums));
    }
}