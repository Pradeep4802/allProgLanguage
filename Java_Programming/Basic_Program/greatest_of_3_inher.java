class greatest {
    int l1;
    void great(int m)
    {
        l1 = m;
    }
}

class greatest1 extends greatest {
    int l2;
    void great2 (int n) {
        l2 = n;
    }
    void check() {
        if(l1 > l2) {
            System.out.println(l1 + " is greatest than " + l2);
        }
        else {
            System.out.println(l2 + " is greater than " + l1);
        }
    }
}

public class greatest_of_3_inher {
    public static void main(String args[]) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        greatest1 num = new greatest1();
        num.great(num1);
        num.great2(num2);
        num.check();
    }
}
