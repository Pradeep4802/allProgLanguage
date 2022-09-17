import java.util.*;

class contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        
        for(int i=0; i<nums.length; i++) {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);   
        }
        return false;       // Time Complexity: O(n) , Topic: Array,HashSet,Sorting
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        boolean b1;
        b1 = containsDuplicate(arr);
        System.out.println(b1);
    }
}