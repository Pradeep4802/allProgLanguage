class A {
    int i;
    void getdata1(int x) {
        i = x;
    }
}
class B extends A{
    int j;
    void getdata2(int y) {
        j = y;
    }
    void add()
    {
        System.out.println("Addition = " + (i + j));
    }
}

class ref_inher
{
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        A a = new A();   // a is superclass reference variable
        B b = new B();   // b is a subclass reference variable
        a = b;
        a.i = 10;
        b.j = 20;

        b.add();
    }
}


