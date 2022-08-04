import java.util.*;

public class peak_element {
    public static int binarySearch(int arr[], int n, int search) {
        int low = 0;
        int high = n-1;

        if(n == 1) {
            return 0;
        }

        while(low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        // Input in the array
        System.out.println("Enter the element in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search element: ");
        int search = sc.nextInt();
        if (binarySearch(arr, arr.length, search) == -1) {
            System.out.println("Element Not found in the array");
        } else {
            System.out.println("Element found at the index of " + binarySearch(arr, arr.length, search));
        }
    }
}