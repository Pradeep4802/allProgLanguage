
// program for number system from hexcadecimal to decimal
import java.util.Scanner;
     
class hexa_to_decimal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hexadecimal value : ");
		String s = sc.nextLine(); // to take the input as hexadecimal input
		int a = 0, b = 0, flag = -1; // to determine the power of 16
		int rem = 0;

		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'F') {
				b = (int) s.charAt(i) - 55;
				rem = rem + (b * power(flag));
				flag = flag + 1;
			}
			if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
				a = (int) s.charAt(i) - 48;
				rem = rem + (a * power(flag));
				flag = flag + 1;
			}
		}
		System.out.println("The hexadecimal value of " + s + " in decimal is = " + rem);
	}

	public static int power(int n) {
		int m = 1;
		for (int i = n; i >= 0; i--) {
			m = m * 16;
		}
		return m;
	}

}