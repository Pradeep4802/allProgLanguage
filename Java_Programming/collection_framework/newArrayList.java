import java.util.*;

public class newArrayList {
    public static void main(String[] args) {
        int n = 5;
        
        // Declaring the Arraylist with initial size n
        ArrayList<Object> arrli = new ArrayList<Object>(n);
        // Appending new elements at the end of the list
        for (int i = 1; i <= n; i++) {
            arrli.add(i);
        }
        System.out.println(arrli);

        // Remove the element at the index 3
        arrli.remove(3);
        System.out.println(arrli);

        // add elemen at specified index in the list
        arrli.add(1,78);
        System.out.println(arrli);

        arrli.set(3, 100);
        System.out.println(arrli);

        // remove from specified value
        arrli.remove(4);
        System.out.println(arrli);

        arrli.add(4,"Geeks");
        System.out.println(arrli);
    }
}
