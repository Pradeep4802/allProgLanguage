import java.util.*;

class contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        
        for(int i=0; i<nums.length; i++) {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);   
        }
<<<<<<< HEAD
        return false;       // Time Complexity: O(n)
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        boolean b1;
        b1 = containsDuplicate(arr);
        System.out.println(b1);
=======
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
>>>>>>> e8976bcf4e20ba784d902e9fc764179ebef3fda8
    }
}