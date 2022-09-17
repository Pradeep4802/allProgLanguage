import java.util.*;

class contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        
        for(int i=0; i<nums.length; i++) {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);   
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
}