import java.util.*;
// import java.lang.*;

class shifting {
    public void preprocess(int arr[], int n, int k, int temp[]) {
        for (int i = 0; i < n; i++) {
            temp[i] = temp[n+i] = arr[i];
        }
        // for (int i = 0; i < temp.length; i++) {
        // System.out.println(temp[i]);
        // }

    }

    public void leftRotate(int arr[], int n, int k, int temp[]) {
        // System.out.println();
        // System.out.println("Temp Array Before Printing: ");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(temp[i]+" ");
        // }
        System.out.println();
        // int start = k % n;
        System.out.println("modified array after left shifting: ");
        for (int i = k; i < k + n; i++) {
            System.out.print(temp[i%n] + " ");
        }
        System.out.println();
    }
}

public class mul_left_shift_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shifting sf = new shifting();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int temp[] = new int[2 * n];
        int k;
        int put = 1;
        while (put == 1) {
            System.out.println();
            System.out.println("***********************************");
            System.out.println();
            System.out.println("1. Perform Another Left Shifting");
            System.out.println();
            System.out.println("2. Print the original array");
            System.out.println();
            System.out.println("3. exit");
            System.out.println();
            System.out.println("***********************************");
            System.out.println();
            int which;
            System.out.println("Enter the value: ");
            which = sc.nextInt();
            System.out.println();
            switch (which) {
                case 1:
                    System.out.println("Enter the shifting value : ");
                    k = sc.nextInt();
                    System.out.println();
                    sf.preprocess(arr, n, k, temp);
                    sf.leftRotate(arr, n, k, temp);
                    break;
                case 2:
                    System.out.println("Array before shifting are: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.exit(0);

                default:
                    System.out.println("Any Input Are not Provide.");
                    break;

            }
            System.out.println();
            System.out.println("Do You Want Another Operation(1/0): ");
            put = sc.nextInt();
            System.out.println();
        }
        // for (int i = 0; i < 4; i++) {
        // }
    }
}
