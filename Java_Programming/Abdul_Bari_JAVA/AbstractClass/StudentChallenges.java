import java.lang.*;

abstract class Shape {

    abstract double perimeter();

    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return (2 * Math.PI * radius);
    }

    public double area() {
        return (Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public double area() {
        return length*breadth;  
    }
}

public class StudentChallenges {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(4.0, 6.0);

        System.out.println("Perimeter of Circle: " + s1.perimeter());
        System.out.println("Area of Circle: " + s1.area());

        System.out.println("Perimeter of Rectangle: " + s2.perimeter());
        System.out.println("Area of Rectangle: " + s2.area());
    }
}