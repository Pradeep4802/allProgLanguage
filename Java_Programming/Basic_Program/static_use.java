class MathOperation {
    static float mul(float x, float y) {
        return x*y;
    }
    static float divide (float x, float y) {
        return x/y;
    }
}

public class static_use {
    public static void main(String[] args) {
        float a = MathOperation.mul(4.0f,5.0f);
        float b = MathOperation.divide(a,2.0f);
        System.out.println("b: " + b);
    }
}
