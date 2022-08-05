/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class reverseGFG {
	public static void main (String[] args) {
		//code
        Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		boolean bool;
 		do {
 		   
		    int N;
		    N = sc.nextInt();
		    int A[] = new int[N];
		    for(int i = 0;i < N;i++) {
		        A[i] = sc.nextInt();
		    }
		    for(int i = A.length-1; i >= 0; i--) {
		        System.out.print(A[i] + " ");
		    }
            System.out.println();
		    t--;
		    bool = (t >= 1);
 	    }while(bool);
	}
}