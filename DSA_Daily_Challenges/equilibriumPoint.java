class equilibriumPoint {

    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibrium_Point(long arr[], int n) {
        // Your code here

        // 1st mthod -- Brute-Force Approach

        // if (n == 1) {
        // return 1;
        // } else if (n == 2) {
        // return -1;
        // } else {
        // long Lsum = 0;
        // long Rsum = 0;
        // for (int i = 1; i < arr.length - 1; i++) {
        // Lsum = Lsum + arr[i - 1];
        // Rsum = 0;
        // for (int j = i + 1; j < arr.length; j++) {
        // Rsum = Rsum + arr[j];
        // }
        // if (Lsum == Rsum) {
        // // System.out.println(arr[3]);
        // return i+1;
        // }
        // }
        // }

        // return -1;

        // 2nd method --> Prefix-sum approach

        // if (n == 1) {
        // return 1;
        // } else if (n == 2) {
        // return -1;
        // } else {
        // long sum[] = new long[n];
        // sum[0] = arr[0];
        // for (int i = 1; i < sum.length; i++) {
        // sum[i] = sum[i - 1] + arr[i];
        // }
        // // for (int i = 0; i < sum.length; i++) {
        // // System.out.println(sum[i]);
        // // }
        // long total = sum[n - 1];
        // for (int i = 1; i < n - 1; i++) {
        // long Lsum = sum[i] - arr[i];
        // long Rsum = total - sum[i];
        // if (Lsum == Rsum) {
        // return i + 1;
        // }
        // }
        // }
        // return -1;

        // 3rd method --> Simple

        // long ls = 0,ts=0;
        // for(int i=0; i<n; i++)
        // ts += arr[i];

        // long rs;
        // for(int j=0; j<n; j++)
        // {
        // rs = ts-arr[j]-ls;
        // if(rs == ls)
        // return j+1;
        // ls += arr[j];
        // }
        // return -1;

        // 4th method

        // if(n == 1){
        // return 1;
        // }
        // if(n == 2){
        // return -1;
        // }
        // long sum1 = arr[0];
        // long sum2 = arr[n-1];
        // int i = 1;
        // int j = n-2;
        // while(i < j){
        // if(sum1 > sum2){
        // sum2 += arr[j];
        // j--;
        // }
        // else if(sum2 > sum1){
        // sum1 += arr[i];
        // i++;
        // } else {
        // sum1 += arr[i];
        // sum2 += arr[j];
        // i++;
        // j--;
        // }
        // }
        // if(i > j){
        // return -1;
        // }
        // if(sum1 == sum2){
        // return i + 1;
        // }
        // return -1;
        // }

        // 5th method

        // long leftsum = 0, rightsum = 0;
        // for (int i = 0; i < n; i++) {
        // rightsum += arr[i];

        // }
        // for (int i = 0; i < n; i++) {
        // leftsum += arr[i];
        // if (leftsum == rightsum)
        // return i + 1;
        // rightsum -= arr[i];
        // }

        // return -1;

        // 6th method --> prefix sum

        // We store the sum of all array elements.
        long sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        // sum2 is used to store prefix sum.
        long sum2 = 0;

        for (int i = 0; i < n; i++) {

            // Leaving out the value of current element from suffix sum.
            sum = sum - arr[i];

            // Checking if suffix and prefix sums are same.
            if (sum2 == sum) {
                // returning the index or equilibrium point.
                return (i + 1);
            }

            // Adding the value of current element to prefix sum.
            sum2 = sum2 + arr[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        long arr[] = { 1, 3, 5, 2, 2 };
        // long arr[] = {1};
        // long arr[] = {1,2,6,4,0,-1};
        int n = arr.length;
        System.out.println(equilibrium_Point(arr, n));
    }
}