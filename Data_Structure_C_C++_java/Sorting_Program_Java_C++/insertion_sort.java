public class insertion_sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    arr[i+1] = arr[j];
                }
                else {
                    arr[i+1] = arr[j];
                    if (arr[i] > arr[j]) {
                        arr[i+1] = arr[i];
                        arr[0] = arr[j+1];
                    }
                }
            }
        }
        printArray(arr);
    }
}
