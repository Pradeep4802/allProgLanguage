import java.util.Scanner;

public class percent {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = S.nextInt();
        System.out.println("Enter the second number:");
        int b = S.nextInt();
        System.out.println("Enter the third number:");
        int c = S.nextInt();
        System.out.println("Enter the fourth number:");
        int d = S.nextInt();
        System.out.println("Enter the fifth number:");
        int e = S.nextInt();

        float perc = (float) ((a + b + c + d + e) / 500.0f) * 100 ;
        System.out.println("Percentage is : ");
        System.out.println(perc);
    }

}
