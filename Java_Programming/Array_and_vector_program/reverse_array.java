// Write a java program to reverse a array .

import  java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int [] arr1 = new int [4];
        int [] arr2 = new int [4];
        int n;
        int j;
        System.out.println("Enter the size of the array:");   // Take a array size of the array from the user
        n = num.nextInt();

        System.out.println("Enter the element in the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = num.nextInt();
        }

        // Logic to reverse the element in the array
        for (int i = 0; i < n; i++) {
                arr2[n-i] = arr1[i];
        }
        
        System.out.println("Element in the reverse order");
        for (int elem : arr2) {
            System.out.print(elem + " ");
        }
        // Practice Problem 5
        // int [] arr = {1, 2, 3, 4, 5, 34, 67};
        // int l = arr.length;
        // int a = Math.floorDiv(l, 2);
        // int temp;
        // for (int i = 0; i < a; i++) {
        //     // Swap a[i] and a[l-1-i]
        //     // a b temp
        //     // |4| |3| ||
        //     temp = arr[i];
        //     arr[i] = arr[l-i-1];
        //     arr[l-i-1] = temp;
        // }

        // for (int elem : arr) {
        //     System.out.print(elem + " ");
        // }
    }
}
