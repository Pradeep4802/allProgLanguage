//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

// class GFG
// {
//     public static void main(String args[])throws IOException
//     {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//         PrintWriter out=new PrintWriter(System.out);
//         //taking testcases
//         int t = Integer.parseInt(br.readLine()); 
//     	for(int i=0;i<t;i++)
//     	{
//             String str=br.readLine();
//     		String[] starr=str.split(" ");

//     		//input n and d
//     	    int n=Integer.parseInt(starr[0]);
//     		int d= Integer.parseInt(starr[1]);

//             int[] arr=new int[n];
//     		String str1=br.readLine();
//     		String[] starr1=str1.split(" ");

//     		//inserting elements in the array
//     		for(int j=0;j<n;j++)
//     		{
//     		  arr[j]= Integer.parseInt(starr1[j]);
//     		}

//     		//calling rotateArr() function
//             new Solution().rotateArr(arr, d, n);
//     		StringBuffer sb=new StringBuffer();

//     		//printing the elements of the array
//             for(int t1=0;t1<n;t1++)
//                 sb.append(arr[t1]+" ");
//             out.println(sb);
//          }
//          out.close();
//     }
// }

// } Driver Code Ends

//User function Template for Java

class rotate_array {
    // Function to rotate an array by d elements in counter-clockwise direction.
    public static void rotateArr(int arr[], int d, int n) {
        // add your code here
        int[] arr1 = new int[n];
        for (int i = d, j = 0; i < n; i++, j++) {
            arr1[j] = arr[i];
        }

        for (int i = n - d, j = 0; i < arr1.length; i++, j++) {
            arr1[i] = arr[j];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr1[i];
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 77, 69,
            40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65,};
        int n = arr.length;
        int d = 5;
        rotateArr(arr, d, n);
    }
}