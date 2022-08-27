public class split_subrray_into_equal_sum {
    // Returns split point. If not possible, then return -1.
    public static int findSplitPoint(int arr[], int n) {
        int leftSum = 0;

        // traverse the array
        for (int i = 0; i < n; i++) {

            // add current element to the left Sum
            leftSum += arr[i];

            // find sum of rest of the element in the rightSum
            int rightSum = 0;
            for (int j = i+1; j < n; j++) {
                rightSum += arr[j];

            }

            //split point index
            if (leftSum == rightSum) {

                //return i+1 to avoid the start position from 1...
                return i+1;
            }
        }

        public static int findSplitPoint2(int arr[],int n)

        // if it is not possible to split array into two parts the return -1
        return -1;
    }
    public static void splitArray(int arr[],int n) {
        int printArray = findSplitPoint(arr,n);
        if (printArray == -1 || printArray == n) {
            System.out.println("Not found");
            return;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if(printArray == i) {
                System.out.println();
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,7,5,8,9,2};
        int n = arr.length;
        splitArray(arr,n);
    }
}
