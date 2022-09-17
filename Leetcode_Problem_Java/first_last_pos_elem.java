class first_last_pos_elem {
    public static int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        if (nums.length == 0) {
            arr[0] = -1;
            arr[1] = -1;
        }

        int low = 0;
        int high = nums.length;
        while (low <= high) {
            int mid = (low+high)/2;
            if (nums[mid] == target) {
                
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int n = nums.length;
        int target = 8;
        int ind[] = new int[2];
        ind = searchRange(nums, target);
    }
}