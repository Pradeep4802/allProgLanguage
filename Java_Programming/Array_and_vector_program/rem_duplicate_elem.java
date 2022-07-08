public class rem_duplicate_elem {
    public static int removeElement(int arr[], int n) {
        if (n == 0 && n == 1) {
            return n;
        }

        int j = 0;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i+1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[n-1];
        j++;
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,4,4,5,3,6,3,5,3};
        int n = arr.length;

        int j = 0;
        j = removeElement(arr,n);
        System.out.println("New Updated array are : ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
