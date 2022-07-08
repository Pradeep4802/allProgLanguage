import java.util.Scanner;
class sum_of_three {
	public static void main(String args[]){
		System.out.println("Sum of the three number question: ");
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		float num1 = num.nextFloat();
		
		System.out.println("Enter the second number: ");
		float num2 = num.nextFloat();
		
		System.out.println("Enter the third number: ");
		float num3 = num.nextFloat();
		
		System.out.println("The addition of three number are: " + (num1 + num2 + num3));
	}	
}
