public class selection_sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < arr.length; i++) {
            int small = 0;
            int m = 0;
            for (int j = 1; j < arr.length; j++) {
                // int an_small = 0;


                if (arr[0] > arr[j]) {
                    small = arr[j];
                }


                // if (arr[0] > arr[j]) {
                //     small = arr[j];
                //     an_small = small;
                //     // m = j;
                //     if (an_small > arr[j + 1]) {
                //         small = arr[j+1];
                //         arr[j+1] = small;
                //     }
                // }
            }
            int temp = arr[0];
            arr[0] = arr[m];
            arr[m] = temp;
        }
        printArray(arr);
    }
}
