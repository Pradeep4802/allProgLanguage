import java.util.Scanner;

public class cgpa_cal {
    public static void main(String[] args) {
        Scanner sub = new Scanner(System.in);

        System.out.println("Enter the marks in 3 subject: ");
        float sub1 = sub.nextFloat();
        float sub2 = sub.nextFloat();
        float sub3 = sub.nextFloat();

        double tot = (sub1 + sub2 + sub3) / (3.0);
        float cg = (float) ((tot) / 9.5);
        System.out.println("CGPA = " + cg);
    }
}
