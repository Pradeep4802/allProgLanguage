package com.question;
import java.util.*;

public class method {
	int mul(int a,int b) {
		System.out.println("Hello how are yopu!!!");
		System.out.println("Hello how are kaisekdjadk!");
		int c = a * b;
		return c;
//		System.out.println("Kabeer khan How are you");
	}
	
	String largest(int a,int b,int c) {
		if(a>b) {
			if(a>c) {
				return (a+" is largest");
			}
		}
		else if(c > b){
			return (c+" is largest");
		}
		else if(a==b && b==c){
			return "equal";
		}
		else {
			return (b+" is largest");
		}
		
		return "Wrong input";
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a , b and c: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		method m = new method();
//		int result = m.mul(a,b);
//		System.out.println("Multiplication: " + result);
		System.out.println(m.largest(a,b,c));
	}
}
