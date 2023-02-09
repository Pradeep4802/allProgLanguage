public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
            } else
                count++;
        }
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == 0) {
        // count++;
        // }
        // }
        return count;

        // using swap method to solve this problem
        // int i = 0;
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[j] != val) {
        // int temp = nums[i];
        // nums[i] = nums[j];
        // nums[j] = temp;
        // i++;
        // }
        // }
        // return i;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 };
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}