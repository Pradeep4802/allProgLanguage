import java.util.*;

public class vector_class {
    public static void main(String[] args) {
        Vector v = new Vector();
        int primitiveType = 10;
        Integer wrapperType = 20;
        String str = "Shranamz shah";
        v.add(primitiveType);
        v.add(wrapperType);
        v.add(str);
        v.add(2, 30);

        System.out.println("The element of vector: " + v);
        System.out.println("The size of vector: " + v.size());
        System.out.println("The element at position 2 is : " + v.elementAt(2));
        System.out.println("The first element of vector is : " + v.firstElement());
        System.out.println("The last element of vector is : " + v.lastElement());
        
        v.removeElementAt(2);
        System.out.println("The element of vector: " + v);
        Enumeration e = v.elements();
        System.out.println("The element of vector is : " + e);

        while (e.hasMoreElements()) {
            System.out.println("The element are: " + e.nextElement());
        }
    }
}
