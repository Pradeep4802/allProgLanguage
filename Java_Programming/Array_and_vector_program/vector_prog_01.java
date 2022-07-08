import java.util.ArrayList;
import java.util.Vector;

// Vector -> Dynamic Array

public class vector_prog_01 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> v = new ArrayList<Integer>(); // 50% // Not ThreadSafe

        // Vector<Integer> v = new Vector<Integer>(); // 100% // Threadsafe
        v.add(4);
        v.add(71);
        v.add(74);
        v.add(76);
        v.add(7);
        v.add(7);
        v.add(73);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7342);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(732);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7546);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);

        v.remove(1);
        System.out.println(v.);
        for (int i : v) {
            System.out.println(i);
        }
    }
}
