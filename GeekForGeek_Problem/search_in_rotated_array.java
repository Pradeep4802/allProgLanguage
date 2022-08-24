class search_in_rotated_array {
    public static int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int index = 0;
        for (int i = 0; i < A.length-1; i++) {
            if(A[i] > A[i+1]) {
                index = i;
                break;
            }
        }

        int [] arr1 = new int[index+1];
        for (int i = 0; i < index+1; i++) {
            arr1[i] = A[i];
        }

        int [] arr2 = new int[h-index];
        int j = 0;
        for (int i = index+1; i <= h; i++) {
            arr2[j] = A[i];
            j++;
        }

        if(arr1.length == 2) {
            for (int i = 0; i < 2; i++) {
                if(arr1[i] == key) {
                    return i;
                }
            }
        }

        // int mid = 0;
        // int high = index + 1;
        // while(l < high) {
        //     mid = (high + l) / 2;
        //     if(arr1[mid] == key) {
        //         return mid;
        //     }
        //     else if(arr1[mid] < key) {
        //         l = mid + 1;
        //     }
        //     else {
        //         high = mid - 1;
        //     }
        // }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == key) {
                return i;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] == key) {
                return i+(index+1);
            }
        }
        System.out.println(index);
        return -1;
// *****************************************************************************
        // int low = 0;
        // int high = arr.length - 1;
        // while(low<=high){
        //     int mid=low+(high-low)/2;
        //     if(arr[mid]==key) return mid;
        //     else if(arr[low]<=arr[mid]){
        //         if(arr[low]<=key && key<=arr[mid]){
        //             high=mid-1;
        //         }else{
        //             low=mid+1;
        //         }
        //     }else{
        //         if(arr[mid]<=key && key<=arr[high]){
        //             low=mid+1;
        //         }else{
        //             high=mid-1;
        //         }
        //     }
        // }
        // return -1;
// *************************************************************************
// Approach 1 (Finding Pivot where rotation has happened):
        /* Java program to search an element
in a sorted and pivoted array*/

	/* Searches an element key in a
	pivoted sorted array arrp[]
	of size n */
	static int pivotedBinarySearch(int arr[], int n,
								int key)
	{
		int pivot = findPivot(arr, 0, n - 1);

		// If we didn't find a pivot, then
		// array is not rotated at all
		if (pivot == -1)
			return binarySearch(arr, 0, n - 1, key);

		// If we found a pivot, then first
		// compare with pivot and then
		// search in two subarrays around pivot
		if (arr[pivot] == key)
			return pivot;
		if (arr[0] <= key)
			return binarySearch(arr, 0, pivot - 1, key);
		return binarySearch(arr, pivot + 1, n - 1, key);
	}

	/* Function to get pivot. For array
	3, 4, 5, 6, 1, 2 it returns
	3 (index of 6) */
	static int findPivot(int arr[], int low, int high)
	{
		// base cases
		if (high < low)
			return -1;
		if (high == low)
			return low;

		/* low + (high - low)/2; */
		int mid = (low + high) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > low && arr[mid] < arr[mid - 1])
			return (mid - 1);
		if (arr[low] >= arr[mid])
			return findPivot(arr, low, mid - 1);
		return findPivot(arr, mid + 1, high);
	}

	/* Standard Binary Search function */
	static int binarySearch(int arr[], int low, int high,
							int key)
	{
		if (high < low)
			return -1;

		/* low + (high - low)/2; */
		int mid = (low + high) / 2;
		if (key == arr[mid])
			return mid;
		if (key > arr[mid])
			return binarySearch(arr, (mid + 1), high, key);
		return binarySearch(arr, low, (mid - 1), key);
	}

    //*********************************************************************************** */
    // Approach 2 (Direct Binary search on Array without finding Pivot): 
    static int search(int arr[], int l, int h, int key)
    {
        if (l > h)
            return -1;
 
        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;
 
        /* If arr[l...mid] first subarray is sorted */
        if (arr[l] <= arr[mid]) {
            /* As this subarray is sorted, we
               can quickly check if key lies in
               half or other half */
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);
            /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
            return search(arr, mid + 1, h, key);
        }
 
        /* If arr[l..mid] first subarray is not sorted,
           then arr[mid... h] must be sorted subarray*/
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);
 
        return search(arr, l, mid - 1, key);
    }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        int res = search(arr, l, h, 5);
        System.out.println("Output: " + res);
    }
}