class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Radius cannot be negative!!";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Radius cannot be negative!!";
    }
}

public class cwh_84_throw_throws {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // made by Harry
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try {
            // int c = divide(6, 0);
            // System.out.println(c);
            double ar = area(6);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
        }
        // System.out.println(c);
    }
}
