import java.util.Arrays;

class checkTwoArrayEqual {
    // Function to check if two arrays are equal or not.
    public static boolean check(long A[], long B[], int N) {
        // boolean ch = true;
        int bool = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        // System.out.println(N);
        // Your code here
        if (A.length == B.length) {
            for (int i = 0; i < N; i++) {

                if (A[i] != B[i]) {
                    // bool = 1;
                    return false;
                }
                // else {
                // bool = 0;
                // }
            }
            // if (bool != 1) {
            // return false;
            // }
        }
        return true;

        // Another method 

        // Arrays.sort(A);
        // Arrays.sort(B);
        // boolean ans = Arrays.equals(A, B);
        // return ans;
    }

    public static void main(String[] args) {
        // long A[] = { 1, 2, 5, 4, 0 };
        // long A[] = { 1,2,3,4,5,6,7,8,9,10 };
        // long A[] = { 8, 9, 7, 5, 3, 1 };
        long A[] = { 12, 3, 14, 14 };

        // long B[] = { 2, 4, 5, 0, 8 };
        // long B[] = { 10,1,2,3,4,5,6,7,8,9 };
        // long B[] = { 5, 4, 2, 5, 1, 7 };
        long B[] = { 14, 12, 3, 9 };

        int N = A.length;
        System.out.println(check(A, B, N));
    }
}
