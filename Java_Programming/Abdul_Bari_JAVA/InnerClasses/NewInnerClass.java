interface A {
    default void show() {
        System.out.println("Show method in interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Show method in interface B");
    }
}

class C implements A, B {
    // Uncomment the following method to resolve ambiguity
    @Override
    public void show() {
        A.super.show(); // Call the show() method of interface A
    }
}

public class NewInnerClass {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}