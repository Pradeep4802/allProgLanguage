class A{}
class B extends A{}
class C extends B{}

public class Gen5 {
    static void fun(MyArray<? super C> obj) {
        obj.display();
    }

    public static void main(String[] args) {
        MyArray<B> ma1 = new MyArray<>();
        // ma1.append("Hi");
        // ma1.append("Bye");

        MyArray<A> ma2 = new MyArray<>();
        // ma2.append(10);
        // ma2.append(20);

        fun(ma1);
        fun(ma2);
    }
}
