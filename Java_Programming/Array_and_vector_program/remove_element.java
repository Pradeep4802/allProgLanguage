// write a program to remove a element in the array which are duplicate the same element.

import java.util.*;

public class remove_element {
    public static void check(int arr1[], int n) {
        int arr2[] = new int [n];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr1[i] == arr1[j]) {
                    arr1[j] = -1;
                }
            }
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] > 0) {
                // arr2[i] = arr1[i];
                c++;
            }
        }

        // // Count specific element duplicate element in the array
        // System.out.println("Duplicate element are: ");
        // for (int i = 0; i < n; i++) {
        //     int count1 = 0;
        //     for (int j = i+1; j < n; j++) {
        //         if (arr1[i] == arr1[j]) {
        //             count1++;
        //         }
        //         System.out.println(arr1[i] + ": " + count1);
        //     }
        // }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i]>0) {
                arr2[count] = arr1[i];
                count++;
            }
        }

        System.out.println("New Updated are: ");
        for (int i = 0; i < c; i++) {
            System.out.print(arr2[i] + ", ");
            // System.out.print(", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = new int [10];
        int n;
        System.out.println("Enter the number of element that user want to enter: ");
        n = sc.nextInt();
        System.out.println("Enter the element in the array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        check(arr1,n);
    }
}

// Java Program to Remove Duplicate Elements
// From the Array using extra space

// public class remove_element {

//     public static int removeduplicates(int a[], int n) {
//         if (n == 0 || n == 1) {
//             return n;
//         }

//         // creating another array for only storing
//         // the unique elements
//         int[] temp = new int[n];
//         int j = 0;

//         for (int i = 0; i < n - 1; i++) {
//             if (a[i] != a[i + 1]) {
//                 temp[j++] = a[i];
//             }
//         }

//         temp[j++] = a[n - 1];

//         // Changing the original array
//         for (int i = 0; i < j; i++) {
//             a[i] = temp[i];
//         }

//         return j;
//     }

//     public static void main(String[] args) {
//         int a[] = { 1,2,2,4,4,5,3,6,3,5,3 };
//         int n = a.length;

//         n = removeduplicates(a, n);

//         // Printing The array elements
//         for (int i = 0; i < n; i++)
//             System.out.print(a[i] + " ");
//     }
// }
