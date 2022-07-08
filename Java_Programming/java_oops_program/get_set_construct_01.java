
import java.util.Scanner;

class cylinder {
    private int x, y;

    // Q1) Create a class Cylinder and use getters and setter to set the radius and
    // height.
    // public int getX() {
    // return x;
    // }

    // public int getY() {
    // return y;
    // }

    // public void setX(int rad1) {
    // x = rad1;
    // }

    // public void setY(int h1_0) {
    // y = h1_0;
    // }

    public double cylin() {
        float pi = 3.14f;
        return 2 * Math.PI * x * y;
    }

    // Q2) Use Q(1) to calculate surface area and volume of the cylinder.
    public double surf() {
        float pi = 3.14f;
        return 2 * Math.PI * x * (y + x);
    }

    public double volume() {
        float pi = 3.14f;
        return Math.PI * (x * x) * y;
    }

    // Q3) Use a constructor and repeat(1)
    cylinder(int x) {
        this.x = x;
        System.out.println("Bike is created");
    }

    // Q4) Overload a constructor used to initialize a rectaangle of length 4 and
    // breadth 5 for using custom parameters.

    // cylinder (int x) {
    // this.x = x;
    // }

    // cylinder (int y) {
    // this.y = y;
    // }

    // Q5) Repeat (1) for a sphere
    public double surface_sphere() {
        return 4 * Math.PI * x * x;
    }

    public double volume_sphere() {
        int rad = x * x * x;
        int div = (4 / 3);
        return div * Math.PI * rad;
    }
}

class rectangle {
    private int length;
    private int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class get_set_construct_01 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        int rad = obj.nextInt();
        // System.out.println("Enter the height: ");
        // int h1 = obj.nextInt();
        cylinder num1 = new cylinder(rad);
        // num1.setX(rad);
        // num1.setY(h1);
        // System.out.println("Radius = " + num1.getX());
        // System.out.println("Height = " + num1.getY());
        // System.out.println("Area of cylinder : " + num1.cylin());
        // System.out.println("Surface Area of cylinder : " + num1.surf());
        // System.out.println("volume of cylinder : " + num1.volume());

        System.out.println("Surface Area of Sphere : " + num1.surface_sphere());
        System.out.println("Volume of Sphere : " + num1.volume_sphere());
        // rectangle r = new rectangle(12, 56);
        // System.out.println(r.getLength());
        // System.out.println(r.getBreadth());
    }
}
