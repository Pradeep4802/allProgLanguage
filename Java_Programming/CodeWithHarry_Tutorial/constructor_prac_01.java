import java.util.Scanner;

class construct_prac {
    float width;
    float length;
    float height;

    construct_prac(float w, float l, float h) {
        width = w;
        length = l;
        height = h;
    }

    construct_prac(float width, float length) {
        this.width = width;
        this.length = length;
        height = 12;
    }

    float same() {
        return this.width * this.length * this.height;
    }
}

public class constructor_prac_01 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the width, length, height: ");
        float w = num.nextFloat();
        float l = num.nextFloat();
        // float h = num.nextFloat();
        // construct_prac con1 = new construct_prac(w,l,h);
        construct_prac con1 = new construct_prac(w, l);
        System.out.println("product of 3 term are: " + con1.same());
    }
}
