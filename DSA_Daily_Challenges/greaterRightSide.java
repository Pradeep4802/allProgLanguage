public class greaterRightSide {
    public static void nextGreatest(int arr[], int n) {
        // code here

        // 1st method

        // if (n == 1) {
        // arr[0] = -1;
        // } else {
        // int gtr = -1, temp = 0;

        // for (int i = n - 1; i >= 0; i--) {
        // temp = arr[i];
        // arr[i] = gtr;
        // gtr = Math.max(gtr, temp);
        // }
        // }

        // 2nd method
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                arr[i - 1] = arr[i];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = -1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 17, 16, 4, 3, 5, 2 };
        int arr[] = { 17, 18, 20, 24, 6, 9, 7, 2, 19, 14 };
        // int arr[] = { 2, 3, 1, 9 };
        // int arr[] = { 9, 1, 3, 2 };
        int N = arr.length;
        nextGreatest(arr, N);
    }
}