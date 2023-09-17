import java.util.ArrayList;

public class FindUnion {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i = 0, j = 0;
        while ((j < m) && (i < n)) {
            if (arr1[i] == arr2[j]) {
                al.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                al.add(arr1[i]);
                i++;
            } else {
                al.add(arr2[j]);
                j++;
            }
        }
        while(i < n) {
            al.add(arr1[i]);
            i++;
        }
        while(j < m) {
            al.add(arr2[j]);
            j++;
        }

        return al;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 4, 5 };
        int nums2[] = { 1, 2, 3 };

        ArrayList<Integer> al = findUnion(nums1, nums2, nums1.length, nums2.length);
        for (Integer integer : al) {
            System.out.println(integer);
        }
    }
}
