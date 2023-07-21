package com.question;
import java.util.*;

public class Basic {
	public static int calculatesum(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = Basic.calculatesum(a,b);
		System.out.println("sum of 2 number is:"+sum);
	}
}
