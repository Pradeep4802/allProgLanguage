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

class rotate_array
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    public static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int [] arr1 = new int[n-d];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i+(d-1)];
        }
        int arr2 [] = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 
        }
        for (int j : arr1) {
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int d = 2;
        rotateArr(arr, d, n);
    }
}