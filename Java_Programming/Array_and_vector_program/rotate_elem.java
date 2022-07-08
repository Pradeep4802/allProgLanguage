class method_II {
    void rotating(int arr[],int n,int d) {
        int temp[] = new int [n];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        int j = 0;
        for (int i = d; i < n; i++) {
            arr[j++] = arr[i];
        }  
        int m = n-d;
        int x = 0;
        for (int i = m; i < n; i++) {
            arr[i] = temp[x++];
        }
    }
    void display(int arr[],int n,int d) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}

public class rotate_elem {
    
    // This is a method to rotate the array from the given index
    void rotate(int arr[] ,int n, int d) {
        for (int i = 0; i < d; i++) {
            rotation(arr, n, d);
        }
    }

    void rotation(int arr[], int n, int d) {
        int temp = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }    
        arr[n-1] = temp;
    }

    void display(int arr[] ,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        rotate_elem rr = new rotate_elem();
        method_II met = new method_II();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int d = 3;
        met.rotating(arr, n, d);
        met.display(arr, n, d);
        // rr.rotate(arr, n, d);
        // rr.display(arr, n);
    }
}
