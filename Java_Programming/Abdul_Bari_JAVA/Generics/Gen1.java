public class Gen1<T> {

    T data[] = (T[]) new Object[3];

    public static void main(String[] args) {
        Gen1<String> gd = new Gen1();

        gd.data[0] = "hi";
        gd.data[1] = "bye";
        // gd.data[2] = new Integer(10);

        String str = gd.data[0];
    }
}