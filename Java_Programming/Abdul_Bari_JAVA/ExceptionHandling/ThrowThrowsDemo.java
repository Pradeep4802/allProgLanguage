class NegativeDimensionsException extends Exception {
    public String toString() {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}

public class ThrowThrowsDemo {
    // static int meth1() {
    // return 10 / 0;
    // }

    // static void meth2() {
    // meth1();
    // }

    // static void meth3() {
    // meth2();
    // }

    static int area(int l, int b) throws NegativeDimensionsException {
        if (l < 0 || b < 0) {
            throw new NegativeDimensionsException();
        }
        return l * b;
    }

    static void meth1() throws NegativeDimensionsException {
        System.out.println("Area is " + area(10, 5));
    }

    public static void main(String args[]) {
        // try {
        // meth3();
        // } catch (NegativeDimensionsException e) {
        // System.out.println(e);
        // }
        try {
            meth1();
        }
        catch(NegativeDimensionsException e) {
            System.out.println(e);
        }
    }
}