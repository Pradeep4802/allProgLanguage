import java.util.Scanner;

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

public class throw_hand_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        try {
            if (age < 18) {
                throw new YoungerAgeException("You are not eligible for voting: ");
                // System.out.println("hsfs");  // Don't write any statement after throw statement
            } else {
                System.out.println("You can vote successful");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Heeloo");
    }
}
