class moveNegativeEnd {
    
    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int a[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                a[k++] = arr[i];
                // k++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                a[k++] = arr[i];
                // k++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,-1,3,2,-7,-5,11,6};
        int n = arr.length;
        segregateElements(arr,n);
    }
}