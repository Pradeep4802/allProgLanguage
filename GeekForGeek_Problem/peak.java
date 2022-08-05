/*Complete the function below*/

class peak {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public static int peakElement(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (((mid == 0) || (arr[mid - 1] <= arr[mid])) && ((mid == (n - 1)) ||
                    (arr[mid + 1] <= arr[mid]))) {
                return mid;
            } else if (mid != 0 && arr[mid - 1] <= arr[mid]) {
                high = mid - 1;
            } else if(arr[mid] <= arr[mid+1])
                low = mid + 1;
            }
        }
        return n - 1;

        // int low = 0;
        // int high = n - 1;
        // while (low <= high) {
        //     int mid = low + (high - low) / 2;
        //     if (((mid == n - 1) || arr[mid + 1] <= arr[mid]) &&
        //             ((mid == 0) || (arr[mid] > arr[mid - 1]))) {
        //         return mid;
        //     } else if (mid != n - 1 || mid != 0) {
        //         if (arr[mid] <= arr[mid + 1]) {
        //             low = mid + 1;
        //         } else if (arr[mid] <= arr[mid - 1]) {
        //             high = mid - 1;
        //         }

        //         else if ((arr[mid] >= arr[mid + 1]) && (arr[mid] >= arr[mid - 1])) {
        //             return mid;
        //         }
        //     }
        // }
        // return n - 1;

        // Your code here
        // int start = 0, end = n - 1;
        // while (start <= end) {
        // int mid = start + (end - start) / 2;
        // if (mid > start && mid < end) {
        // if (arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1]) {
        // return mid;
        // } else if (arr[mid - 1] > arr[mid])
        // end = mid - 1;
        // else
        // start = mid + 1;
        // } else if (mid == start) {
        // if (mid + 1 < n && arr[mid] > arr[mid + 1])
        // return mid;
        // else
        // start = mid + 1;
        // } else if (mid == end) {
        // if (end - 1 >= 0 && arr[mid] > arr[end - 1])
        // return mid;
        // else
        // end = mid - 1;
        // }
        // }
        // return n - 1;

        // if (n == 1)
        // return 0;
        // if (arr[0] > arr[1])
        // return 0;
        // if (arr[n - 1] > arr[n - 2])
        // return n - 1;
        // for (int i = 1; i < n - 1; i++) {
        // if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
        // return i;
        // }
        // }
        // return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 13, 15, 9, 8, 12, 18, 17, 21, 6, 10, 19, 20, 56, 45, 67, 78, 89, 88, 19, 100, 12 };
        int ind = peakElement(arr, arr.length);
        System.out.println(ind);
    }
}