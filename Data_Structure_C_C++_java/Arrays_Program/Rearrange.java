public class Rearrange {
    public static int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len];
        // int pos[] = new int[len/2];
        // int neg[] = new int[len/2];
        // int kpos = 0;
        // int xneg = 0;
        // for (int i = 0; i < len; i++) {
        //     if (nums[i] >= 0) { pos[kpos++] = nums[i]; }else {neg[xneg++] = nums[i];}
        // }
        // kpos = 0;
        // xneg = 0;
        // for (int i = 0; i < len; i++) {
        //     if(i%2 == 0) {
        //         arr[i] = pos[kpos++];
        //     }
        //     else {
        //         arr[i] = neg[xneg++];
        //     }
        // }
        // return arr;

        int posInd = 0, negInd = 1;
        for (int i = 0; i < arr.length; i++) {
            if(nums[i] < 0) {
                arr[negInd] = nums[i];
                negInd+=2;
            }
            else {
                arr[posInd] = nums[i];
                posInd+=2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        int num[] = rearrangeArray(nums);
        for (int i : num) {
            System.out.println(i);
        }
    }
}
