import java.util.*;

class stackOverflowException extends Exception {
    public String toString() {
        return "Stack is full";
    }
}

class stackUnderflowException extends Exception {
    public String toString() {
        return "Stack is Empty";
    }
}

public class Stack {
    // static void push() throws Exception {
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int arr[] = new int[size];
    // try {
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = sc.nextInt();
    // }
    // }
    // }

    private int size;
    private int top = -1;
    private int S[];

    public Stack(int sz) {
        size = sz;
        S = new int[sz];
    }

    public void push(int x) throws stackOverflowException {
        if(top == size-1) {
            throw new stackOverflowException();
        }
        top++;
        S[top] = x;
    }

    public int pop() throws stackUnderflowException {
        int x = -1;
        if(top == -1) {
            throw new stackUnderflowException();
        }
        x = S[top];
        top--;
        return x;
    }

    public static void main(String[] args) throws Exception {
        Stack st = new Stack(5);
        try {
            // st.push(10);
            // st.push(15);
            // st.push(10);
            // st.push(15);
            st.push(10);
            // st.push(15);
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
        } catch (stackOverflowException s) {
            System.out.println(s);
        } catch (stackUnderflowException s) {
            System.out.println(s);
        }
    }
}
