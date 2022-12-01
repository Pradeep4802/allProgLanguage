// import java.io.*;
class LowBalanaceException extends Exception {
    public String toString()
    {
        return "Balance should not be less than 5000";
    }
}

public class checkedUnchecked {
    static void fun1() {
        // try {
        //     System.out.println(10/0); 
        // }
        // catch(Exception e) {
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }

        // FileInputStream fi = new FileInputStream("My.txt");
        try {
            throw new LowBalanaceException();
        }
        catch(LowBalanaceException e) {
            System.out.println(e);
        }

    }
    static void fun2() {
        fun1();
    }
    static void fun3() {
        fun2();
    }
    public static void main(String args[]) {
        fun3();
    }
}