// Objects are passed by reference.
class Test {
    int i, j;

    Test(int a, int b) {
        i = a;
        j = b;
    }

    // pass an object
    void meth(Test o) {
        o.i *= 2;
        o.j /= 2;
    }
}

class call_by_reference {
    public static void main(String args[]) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a and ob.b before call: " +
                ob.i + " " + ob.j);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " +
                ob.i + " " + ob.j);
    }
}