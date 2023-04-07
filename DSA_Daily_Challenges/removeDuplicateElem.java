public class removeDuplicateElem {
    public static int remove_duplicate(int arr[], int n) {
        // code here
        int i = 0, j = 1;

        while (j < n) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }

        return ++i;
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 2, 2, 2, 2 };
        int arr[] = { 1, 1, 2, 2, 3, 4, 5, 5 };
        int N = arr.length;
        System.out.println(remove_duplicate(arr, N));
    }
}