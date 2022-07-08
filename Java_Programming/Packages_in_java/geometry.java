package com.codewithharry.shape;

class Rectangle {
    public int l, b;

    void set_rect(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int get_rect() {
        return l * b;
    }
}

class Square {
    public int side;

    void set_sq(int s) {
        side = s;
    }

    int get_sq() {
        return side * side;
    }
}

class Circle {
    public double PI = 3.14;
    int radius;

    void set_circ(int r) {
        radius = r;
    }

    public double get_circ() {
        return PI * radius * radius;
    }
}

class Sphere extends Circle {
    public double get_sphere() {
        return (4 * PI * radius * radius);
    }
}

class Cylinder extends Circle {
    public double get_cy() {
        return ((2 * PI * R * h) + (2 * PI * r * r));
    }
}

class geometry {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Square s = new Square();
        Circle c = new Circle();
        Sphere s1 = new Sphere();
        Cylinder c1 = new Cylinder();
    }
}