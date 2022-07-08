
import java.util.Scanner;

public class serch_array_program {
    public static int search(int[] a1, int data) {
        int i;
        // int found = 0;
        // logic to search the element
        for (i = 1; i <= a1.length; i++) {
            if (a1[i] == data)
                break;
        }
        return i+1;
    }

    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        int arr1[] = new int[10];
        int n;
        int value;

        System.out.println("Enter the size of the array: ");
        n = num.nextInt();
        System.out.println("Enter the element in the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = num.nextInt();
        }
        System.out.println("\n Enter the data that you want to search:");
        value = num.nextInt();
        int index = search(arr1, value);
        System.out.println(value + " found at index " + index);
    }
}
