class OverloadTest {
    public int add(int a, int b) {
        return (a+b);
    }
    public double add(int a, float b) {
        return (a+b);
    }
}
public class JavaInterview {
    public static void main(String[] args) {
        OverloadTest t = new OverloadTest();
        System.out.println(t.add(5,10.0f));
    }
}
