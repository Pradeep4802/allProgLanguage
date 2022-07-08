// class Circle {
//     public int radius;
//     Circle() {
//         System.out.println("I am non param of circle.");
//     }
//     Circle(int r) {
//         System.out.println("I am circle parametrized constructor.");
//         this.radius = r;
//     }

//     public double area() {
//         return Math.PI*this.radius*this.radius;
//     }
// }

// class Cylinder extends Circle {
//     public int height;
//     Cylinder(int r,int h) {
//         super(r);
//         System.out.println("I am cylinder parametrized constructor.");
//         this.height = h;
//     }
//     public double volume() {
//         return Math.PI * this.radius * this.radius * this.height;
//     }
// }

// public class cwh_52_ch10ps {
//     public static void main(String[] args) {
//         // problem 1

//         Cylinder obj = new Cylinder(3, 6);
//         // Circle obj = new Circle(5);
//     }
// }

// ==================================== OR =========================================

class Rectangle {
    public int l;
    public int b;
    Rectangle(int l,int b) {
        this.l = l;
        this.b = b;
        System.out.println("This is Rectangle prametrized constructor.");
    }

    public float a_rect() {
        return l * b;
    }
}

class Cuboid extends Rectangle {
    public int w;
    Cuboid(int l,int b,int w) {
        super(l,b);
        this.w = w;
        System.out.println("This is cuboid parameterized constructor.");
    }

    public double a_cuboid() {
        return 2 * ((l*w)+(w*b)+(l*b));
    }
}

public class cwh_52_ch10ps {
    public static void main(String[] args) {
        // problem 2
        Cuboid c = new Cuboid(3,6,8);
        System.out.println("Area of rectangle is " + c.a_rect());
        System.out.println("Area of cuboid is " + c.a_cuboid());
    }
}
