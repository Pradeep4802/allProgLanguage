import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "I am getMessage()";
    }
}
class MaxAgeException extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Make sure that the value of age entered is correct";
    }
}

public class cwh_83_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a<9) {
            try {
                // throw new MyException();6
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
