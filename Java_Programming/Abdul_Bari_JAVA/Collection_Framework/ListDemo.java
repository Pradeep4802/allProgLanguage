import java.util.*;
import java.lang.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

        // System.out.println(al2);
        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1, al2);
        al1.add(5, 70);

        al1.set(6, 100);

        // System.out.println(al1.lastIndexOf(70));

        // System.out.println(al1);

        // for (int i = 0; i < al1.size(); i++) {
        // System.out.println(al1.get(i));
        // }

        // for (Integer x : al1) {
        // System.out.println(x);
        // }

        // for(Iterator<Integer> it = al1.iterator(); it.hasNext();) {
        // Integer x = it.next();
        // System.out.println(x);
        // }

        // al1.forEach((x) -> {
        // System.out.println(x);
        // });

        // ListIterator<Integer> it = al1.listIterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // al1.forEach(System.out::println);
        al1.forEach(n->show(n));
    }

    static void show(int n) {
        if(n>60) {
            System.out.println(n);
        }
    }
}