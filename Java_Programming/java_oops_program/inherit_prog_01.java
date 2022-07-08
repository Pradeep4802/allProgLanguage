// A simple example of inheritance

// Create a superclass
class A {
    int i, j;
    void showij() {
        System.out.println(" i and j : " + i + " " + j);
    }
}

// create a subclass by extending class A
class B extends A {
    int k;
    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println(" i + j + k: " + (i+j+k));
    }
}

public class inherit_prog_01 {
    public static void main(String[] args) {
        A superob = new A();
        B subob = new B();

        // The superclass may be used by itself
        superob.i = 10;
        superob.j = 20;
        System.out.println("contents of superob: ");
        superob.showij();
        System.out.println();
        
        // The subclass has access to all public memeber of its superclass 
        subob.i = 7;
        subob.j = 8;
        subob.k = 9;
        System.out.println("contents o subob: ");
        subob.showij();
        subob.showk();
        System.out.println();

        System.out.println("Sum of i, j and k in subob:");
        subob.sum();
    }   
}
