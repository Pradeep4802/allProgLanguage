
class OuterStatic {
    static int a = 10;
    int b = 20;
    static class InnerStatic extends OuterStatic{
        public InnerStatic() {
            System.out.println("Constructor was called");
        }
        int c = 30;
        void show() {
            System.out.println(a+" "+b+" "+c);
            demo();
        }
    }
    public void demo() {
        System.out.println("Demo class");
    }
}

public class NestedMember {
    public static void main(String[] args) {
        OuterStatic os = new OuterStatic();
        OuterStatic.InnerStatic us = new OuterStatic.InnerStatic();
        // os.demo();
        us.show();
    }
}