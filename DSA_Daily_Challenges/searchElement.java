class searchElement {

    public static int search(int arr[], int N, int X) {

        // Your code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int n = 4;
        int x = 3;
        System.out.println(search(arr, n, x));
    }
}