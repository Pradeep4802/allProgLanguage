import java.util.Scanner;

public class kth_element_serch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[20];
        System.out.println("Enter the number of the element: ");
        int n = sc.nextInt();
        System.out.println("Enter the element in the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the kth position largest number is : ");
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] < arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == k - 1)
                System.out.println(k + "th position largest number is : " + arr1[i]);
        }
    }
}
