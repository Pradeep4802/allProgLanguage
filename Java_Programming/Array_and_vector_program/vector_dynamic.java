import java.util.*;

public class vector_dynamic {
    public static void main(String[] args) {
        Vector v =new Vector();

        v.add("Java");
        v.add(1);

        Iterator i = v.iterator();
        while(i.hasNext()) {
            System.out.println(i.next() + " ");
        }
        System.out.println();

        Vector<Integer> v1 = new Vector<Integer>();

        v1.add(1);
        v1.add(2);

        Iterator<Integer> i1 = v1.iterator();
        while(i1.hasNext()) {
            System.out.println(i1.next() + " ");
        }

        Vector<Integer> v2 = new Vector<Integer>(2);
        v2.add(1);
        v2.add(2);
        v2.add(3);
        v2.add(4);

        Vector<Integer> v3 = new Vector<Integer>(2, 5);
        v3.add(1);
        v3.add(2);
        v3.add(3);
        v3.add(4);
    }
}
