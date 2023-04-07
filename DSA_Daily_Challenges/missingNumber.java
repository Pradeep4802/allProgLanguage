class missingNumber {

    public static int MissingNumber(int A[], int N) {
        // Your code goes here
        // int k = N*(N+1)/2;
        // int arrSum = 0;
        // // System.out.println(k);
        // for (int i = 0; i < N-1; i++) {
        // arrSum += A[i];
        // }
        // return k - arrSum;

        // 2nd Method
        int i, sum = 0;
        for (i = 0; i < N - 1; i++)
            sum += A[i];
        return ((N * (N + 1)) / 2) - sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3 };
        int n = arr.length + 1;
        System.out.println(MissingNumber(arr, n));
    }
}