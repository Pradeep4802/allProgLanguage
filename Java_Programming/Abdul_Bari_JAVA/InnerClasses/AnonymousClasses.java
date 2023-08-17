interface OuterAnony {
    void car();

    void motor();
}

abstract class InnerAnony {
    abstract void absDemo();
    abstract void absDisplay();
}

public class AnonymousClasses {
    public static void main(String[] args) {
        new OuterAnony() {
            public void car() {
                System.out.println("Car");
            }

            public void motor() {
                System.out.println("Motor");
            }
        }.car();

        new InnerAnony() {
            void absDemo() {
                System.out.println("abs demo");
            }
            void absDisplay() {
                System.out.println("abs display");
            }
        }.absDisplay();
        // ac.car();
        // ac.motor();
    }
}
