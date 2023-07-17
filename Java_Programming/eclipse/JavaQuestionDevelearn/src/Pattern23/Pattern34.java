package Pattern23;

public class Pattern34 {
	public static void main(String args[]) {
		for(int i=1;i<=9;i++) {
			if(i<=5 ) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
					
				}
			}
			if(i>5) {
				for(int j=1;j<=9-i+1;j++) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
