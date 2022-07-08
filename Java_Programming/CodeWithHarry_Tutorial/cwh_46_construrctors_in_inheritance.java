class Base1 {
    Base1() {
        System.out.println("I am a constructors");
    }

    Base1(int x) {
        System.out.println("I am a overload constructor with value of x as: " + x);
    }
}

class Derived extends Base1 {
    Derived() {
        // super(0);
        System.out.println("I am a derived class constructor.");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as : " + y);
    }
}

class ChildOfDerived extends Derived {
    ChildOfDerived() {
        System.out.println("I am a child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a overloaded constructor of Derived with value of z as: " + z);
    }
}

public class cwh_46_construrctors_in_inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived d = new Derived();
        // Derived d = new Derived(14, 9);
        ChildOfDerived cd = new ChildOfDerived(14,15,19);
    }
}
