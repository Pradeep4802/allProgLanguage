// package OOPS;

class cylinderTest {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea() {
        return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
    }

    public double volume() {
        return Math.PI*radius*radius*height;
    }

    public double circumference() {
        return 2*Math.PI*radius;
    }
}

public class Cyliner {
    public static void main(String[] args) {
        cylinderTest cy = new cylinderTest();
        cy.radius = 7;
        cy.height = 10;
        System.out.println("Area of cylinder: " + cy.lidArea());
        System.out.println("Surface area of cylinder: " + cy.totalSurfaceArea());
        System.out.println("Volume of cylinder: " + cy.volume());
        System.out.println("Circumference of cylinder: " + cy.circumference());
    }
}
