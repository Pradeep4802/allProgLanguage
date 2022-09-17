public class kth_contains_Duplicates {

    /*
     * Java program to Check if a given array contains
     * duplicate elements within k distance from each other
     */
    public static boolean checkDuplicatesWithinK(int[] arr, int n, int k) {

        // traversing the input array
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int range = k;
            // searching in next k-1 elements if its
            // duplicate is present or not
            while (range > 0 && j < n) {
                if (arr[i] == arr[j]) {
                    return true;
                }
                j++;
                range--;
            }
        }
        return false;       // Time Complexity: O(kn), Topic: Array,HashSet,Sorting

        // *****************************2nd Method: Hashing***************************

        // static boolean checkDuplicatesWithinK(int arr[], int k)
        // {
        // // Creates an empty hashset
        // HashSet<Integer> set = new HashSet<>();

        // // Traverse the input array
        // for (int i=0; i<arr.length; i++)
        // {
        // // If already present n hash, then we found
        // // a duplicate within k distance
        // if (set.contains(arr[i]))
        // return true;

        // // Add this item to hashset
        // set.add(arr[i]);

        // // Remove the k+1 distant item
        // if (i >= k)
        // set.remove(arr[i-k]);
        // }
        // return false;
        // }                        //Time Complexity: O(n), Topic: Array,HashSet,Sorting

        //************************************************** */
    }

    // Driver method to test above method
    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        int n = arr.length;
        if (checkDuplicatesWithinK(arr, n, 3)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}

// This article is contributed by Aarti_Rathi
