public class conatiner_with_most_water {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int leftHalf = height[left];
            int rightHalf = height[right];
            int min_half = Math.min(leftHalf, rightHalf);
            int len = right - left;
            int curr_area = min_half * len;
            max = Math.max(max, curr_area);
            if (leftHalf < rightHalf)
                left++;
            else
                right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}