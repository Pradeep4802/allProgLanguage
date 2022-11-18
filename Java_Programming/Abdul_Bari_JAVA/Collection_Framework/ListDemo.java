import java.util.*;

import javax.management.openmbean.ArrayType;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1, al2);
        al1.add(5, 70);

        // System.out.println(al1.lastIndexOf(70));
        al1.set(6, 100);

        // System.out.println(al1);
        // for (var x:al1) {
        // System.out.println(x);
        // }

        // for (Iterator<Integer> it = al1.iterator(); it.hasNext();) {
        // Integer x = it.next();
        // System.out.println(x);
        // }

        // al1.forEach((x) -> {
        // System.out.println(x);
        // });

        // for(ListIterator<Integer> it = al1.listIterator();it.hasNext();) {
        //     System.out.println(it.next());
        // }

        al1.forEach(n->show(n));


    }

    static void show(int n ){
        if(n>60) {
            System.out.println(n);
        }
    }
}