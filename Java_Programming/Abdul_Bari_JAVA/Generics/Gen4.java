
@SuppressWarnings("unchecked")
class MyArray<T> {
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for(int i=0;i<length;i++) {
            System.out.println(A[i]);
        }
    }
}

public class Gen4 {
    static <E> void show(E... list) {       // ... it is a variables arguments
        for(E x:list) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show(new String[] {"Hi","Go","Bye"});
        show(new Integer[]{10,20,30,40});
    }
}
