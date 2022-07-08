class EkClass {
    int a;

    public int getX() {
        return a;
    }

    EkClass(int v) {
        this.a = v;
    }

    public int returnone() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int c) {
        super(c);
        System.out.println("I am constructor");
    }
}

public class cwh_47_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getX());
    }
}
