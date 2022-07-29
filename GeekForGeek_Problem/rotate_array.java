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
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j + 1];
            }
        }
        for (int i = n - d, j = 0; i < arr.length; i++, j++) {
            arr[i] = temp[j];
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[77];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        int d = 69;
        rotateArr(arr, d, n);
    }
}