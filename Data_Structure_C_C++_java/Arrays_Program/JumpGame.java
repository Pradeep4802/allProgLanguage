public class JumpGame {
    public static boolean canJump(int[] nums) {
        int len = nums.length;

        int tail = 0;
        for (int i = 0; i < len; i++) {
            if(tail < i ) return false;
            tail = Math.max(tail,i+nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 1, 4 };
        System.out.println(canJump(nums));
    }
}
