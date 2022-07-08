// 1. Create a class and use inheritance to create another class Cylinder from it.
// 2. Create a class Rectangle and use inheritance to create another class cuboid. Try to keep it as close to real world scenario as possible.
// 3. Create methods for area and volume in (1)
// 4. Create methods for area and Volume in (2). Also create getters and setters
// 5. What is the order of constructor execution for the following inheritance hierarchy:
//    Base-->Derived1-->Derived2
//    Derived2 obj = new Derived2();
// Which constructor(5) will be executed & in what order?

class Circle {
    // public int var1 = 10;
    // public int var2 = 20;
    public int radius;

    Circle() {
        System.out.println("I am non param of circle");
    }

    Circle(int r) {
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    void meth1() {
        System.out.println("Good morning to all!");
    }
}

class Cylinder extends Circle {
    // int area() {
    // return var1 * var2;
    // }
    public int height;

    Cylinder(int r, int h) {
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * height;
    }
}

public class cwh_10_practice_set {
    public static void main(String[] args) {
        // Problem 1
        // Circle c = new Circle(12);

        Cylinder obj = new Cylinder(14, 32);

        // int res = n.area();
        // n.meth1();
        // System.out.println("Area of rectangle : " + res);
    }
}
