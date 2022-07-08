import java.util.concurrent.ForkJoinPool;

public class pyramid_01 {
    public static void main(String args[]) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 8; j++) {
                if (i>=4-j)
                {
                    System.out.print("*");
                }         
                else if (j<=i) {
                    System.out.print("*");
                }       
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
