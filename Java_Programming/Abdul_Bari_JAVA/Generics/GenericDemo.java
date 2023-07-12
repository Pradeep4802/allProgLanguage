public class GenericDemo {
    public static void main(String[] args) {
        // Object obj = new String("Hello");

        // obj = new Integer(10); 

        // String str = (String)obj;

        // System.out.println(str );

        Object obj[] = new Object[3];

        String obj[] = new Object[3];

        obj[0] = "hi";
        obj[1] = "bye";
        obj[2] = new Integer(10);

        String str;

        for(int i=0; i<3; i++) {
            str=(String)obj[i];
            System.out.println(str);
        }
    }
}