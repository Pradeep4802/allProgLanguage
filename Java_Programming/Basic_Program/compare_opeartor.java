// Use comparison operator to find out whether a given number is greater than the user entered number or not. 

import java.util.Scanner;
public class compare_opeartor {
    public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int given = 56;
		int num1 = num.nextInt();
		
		if (num1 > given)
		{
			System.out.println("The user entered number is greater than the given number.");
		}
		else if(num1 < given)
		{
			System.out.println("The user entered number is smaller than the given number.");
		}
		else if(num1 == given)
		{
			System.out.println("The user entered number is not greater than the given number.");
		}
		else
		{
			System.out.println("The user entered number is equal to the given number.");
		}
    }
}
