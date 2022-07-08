import java.util.Scanner;

public class sum_of_array_01 {
    public static int sum_array_01(int[] arr, int n) {
        // Scanner num = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] arr1 = new int[10];
        int n;
        System.out.println("Enter the size of the array: ");
        n = num.nextInt();
        System.out.println("Enter the element in the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = num.nextInt();
        }

        System.out.println("Sum of the 1-D array: " + sum_array_01(arr1, n));
    }
}
