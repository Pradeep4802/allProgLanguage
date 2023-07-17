package Pattern23;

public class Pattern23 {
	public static void main(String args[]) {
//		int k = 1;
//		for(int i=1;i<=5;i++) {
//			int c = k;
//			for(int j=1;j<=9;j++) {
//				if(j>=i) {
//					System.out.print(" ");
//					if(i==j || c <= 5) {
//						System.out.print(c);
//						c++;
//					}
//					if(c > 5) {
//						break;
//					}
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			k++;
//			System.out.println();
//		}
		
		for (int i = 1; i <= 5; i++)
        {
            //Printing i spaces at the beginning of each row
 
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
 
            //Printing i to rows value at the end of each row
 
            for (int j = i; j <= 5; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
	}
}
