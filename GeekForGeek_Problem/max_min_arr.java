//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// class GFG {
// 	public static void main(String[] args) throws IOException
// 	{
// 	        BufferedReader br =
//             new BufferedReader(new InputStreamReader(System.in));
//         int t =
//             Integer.parseInt(br.readLine().trim()); // Inputting the testcases
//         while(t-->0)
//         {
//             long n = Long.parseLong(br.readLine().trim());
//             long a[] = new long[(int)(n)];
//             // long getAnswer[] = new long[(int)(n)];
//             String inputLine[] = br.readLine().trim().split(" ");
//             for (int i = 0; i < n; i++) {
//                 a[i] = Long.parseLong(inputLine[i]);
//             }
            
//             Compute obj = new Compute();
//             pair product = obj.getMinMax(a, n); 
//             System.out.println(product.first+" "+product.second);
            
//         }
// 	}
// }


// } Driver Code Ends


//User function Template for Java


class pair  
{  
    long min, max;  
    public pair(long min, long max)  
    {  
        this.min = min;  
        this.max = max;  
    } 
} 

class Compute extends pair  
{
    long arr[];  
    long n;  
    public Compute(long a[], long n)  
    {  
        a; 
        this.n = n;
    }

    public static pair getMinMax(Compute sm)  
    {
        //Write your code here
        long max = a[0], min = a[0];
        for (int i = 1; i < n; i++) {
            if(a[i] > max) 
                max = a[i];
            if (a[i] < min) {
                min = a[i];
            }
        }
        Compute pr = new Compute(min,max);
        return pr;
    }

    public static void main(String[] args) {
        long a[] = {12l,43l,45l,6765l,4332l,15l};
        int n = a.length;
        Compute cm = new Compute(a,n);
        cm = cm.getMinMax(cm);
    }
}
