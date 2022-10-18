// package Satyam_Dheevar;

public class function_practice {
    static float addition(float num1, float num2) {
        // System.out.prfloatln("Hello World");
        return num1 + num2;
    }

    public static void main(String[] args) {
        float a = 4;
        float b = 6;
        // float add = addition(a,b);
        // System.out.println();
        System.out.printf("Addition of %.6f and %.3f is %.3f \n",a,b, addition(a, b));
    }
}
