package Pattern23;

public class Pattern29 {
	public static void main(String args[]) {
		for(int i=69;i>=65;i--) {
			for(int j=69;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=i;j>=65;j--) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
