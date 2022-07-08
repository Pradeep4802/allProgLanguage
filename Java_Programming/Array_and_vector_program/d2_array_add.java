import java.util.Scanner;

public class d2_array_add {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        int[][] arr3 = new int[2][3];

        System.out.println("Enter the first 2x3 matrix"); // Take first matrix input from user
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = a1.nextInt();
            }
        }
        System.out.println("Enter the second 2x3 matrix"); // Take second matrix input from user
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = a1.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" Setting value for i=%d and j=%d\n",i,j);
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        // printing the element of the 2-D array
        System.out.println("Addition of 2 matrix are: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + " ");
            } 
            System.out.println(""); // 
        }
    }
}
