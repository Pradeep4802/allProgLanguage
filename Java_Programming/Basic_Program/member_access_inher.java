class number1 {
    int i;
    private int j;

    void getdataij(int x, int y) {
        i = x;
        j = y;
    }

    int getj() {
        return j;
    }
}

class number2 extends number1 {
    int k;

    void getdatak(int m) {
        k = m;
    }

    void mul() {
        System.out.println("Multiplivation = " + i * getj() * k);
    }
}

public class member_access_inher {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        number2 n = new number2();
        n.getdataij(a, b);
        n.getdatak(c);
        n.mul();
    }
}
