import java.util.*;
// import java.lang.*;
// package CodeWithHarry_Tutorial;

class MyGenerics<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal() {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class cwh_110_generics {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList();
        // arraylist.add("Str1");
        arraylist.add(54);
        arraylist.add(643);

        int a =(int)arraylist.get(1);
        // System.out.println(a);
        MyGenerics<String, Integer> g1 = new MyGenerics(23, "My string is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
