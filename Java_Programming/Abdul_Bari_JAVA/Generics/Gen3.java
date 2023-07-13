interface A{}
class B implements A{}
class C implements A{}

@SuppressWarnings("unchecked")
class MyArray<T extends A> {
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

// class MyArray2<T> extends MyArray<T> {

// }

public class Gen3 {
    public static void main(String[] args) {
        MyArray<C> ma = new MyArray<>();
        // ma.append(12.5D);
        // ma.append(6.57D);
        // ma.append(9.75D);



        ma.display();
    }
}
