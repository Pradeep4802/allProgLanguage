// package OOPS.MethodOverriding;

class Super1 {
    public void display() {
        System.out.println("Super Display");
    }
}

class Sub1 extends Super1 {
    @Override
    public void display() {
        System.out.println("Sub Display");
    }
}

public class overriderules {
    public static void main(String[] args) {
        Sub1 s = new Sub1();
        s.display();
    }
}
