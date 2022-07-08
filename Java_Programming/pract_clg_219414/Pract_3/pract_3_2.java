// Q2. Write a java program to print the area and perimeter of a triangle having sides by creating a class named 'Triangle' with constructor having the three sides as its parameters
// package pract_clg_219414.Pract_3;

class triangle {
    public float a;
    public float b;
    public float c;
    triangle(float a,float b,float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    double getArea() {
        return (0.5 * b * c);
    }

    float getPerimeter() {
        return a + b + c;
    }
}
public class pract_3_2 {
    public static void main(String[] args) {
        // System.out.println("Enter the side: ");
        float side = Integer.parseInt(args[0]);
        // System.out.println("Enter the base: ");
        float base = Integer.parseInt(args[1]);
        // System.out.println("Enter the another side: ");
        float side1 = Integer.parseInt(args[2]);
        triangle tri = new triangle(side, base, side1);
        double res_area = tri.getArea();
        float res_Perimeter = tri.getPerimeter();
        System.out.println("Area of triangle is : " + res_area);
        System.out.println("perimeter of triangle is : " + res_Perimeter);
    }
}
