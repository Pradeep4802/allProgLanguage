// import java.net.SocketTimeoutException;
import java.util.*;
class Two_Sum_Leetcode_Solution {
    public static int[] twoSum(int[] nums, int target) {
        int [] arr1 = new int [2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    arr1[0] = i;  
                    arr1[1] = j;
                }
            }
        }
        return arr1;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of element: ");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("ENter the element in the array: ");
        for(int i = 0; i<n ; i++ ) {
            arr[i] = sc.nextInt();
        }
        int target;
        System.out.println("Enter the target: ");
        target = sc.nextInt();
        int [] arr1 = new int [2];
        arr1 = twoSum(arr,target);
        System.out.println("Index are: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}