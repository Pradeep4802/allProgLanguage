public class TransitionElement {
    public static int transitionPoint(int arr[], int n) {
        if (n == 1) {
            return arr[0] == 0 ? -1 : 0;
        } else if (n > 1) {
            int point = arr[0];
            for (int i = 0; i < n; i++) {
                if (point != arr[i]) {
                    return i;
                }

            }
            if (point == 0) {
                return -1;
            } else {
                return 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { 0, 0, 0, 1, 1 };
        int arr[] = { 0, 0, 0, 0 };
        System.out.println(transitionPoint(arr, arr.length));
    }
}
