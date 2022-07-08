public class excep_hand_02 {
    void divide() {
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        excep_hand_02 t = new excep_hand_02();
        
        t.divide();
        System.out.println("hello");
    }
}