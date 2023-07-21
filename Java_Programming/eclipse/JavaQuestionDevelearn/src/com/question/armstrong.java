package com.question;
import java.util.Scanner;
import java.lang.Math;

// Java program to check a given number is 
// Armstrong or not using a for loop

public class armstrong {
	int arm(int num) {
		int sum = 0;
		while(num!=0) {
			int last = num % 10;		
			sum = sum + last;
			num = num / 10;
		}
		
		return sum; // for wrong input
	}
	
	public static void main(String args[]) {
		armstrong a = new armstrong();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		System.out.println("Sum of digit: " + a.arm(n));
		
//		if(n == s) {
//			System.out.println(" It is Armstrong Number : " + s );
//		}
//		else {
//			System.out.println(" It is not a Armstrong Number : " + s  );
//		}
	}
}
