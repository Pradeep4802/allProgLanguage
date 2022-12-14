class Rectangle1 {
    private double length;
    private double breadth;

    public Rectangle1() {
        length = 1;
        breadth = 1;
    }

    public Rectangle1(double l, double b) {
        setLength(l);
        setBreadth(b);
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l) {
        if (l >= 0) {
            length = l;
        } else {
            length = 0;
        }
    }

    public void setBreadth(double b) {
        if (b >= 0) {
            breadth = b;
        } else {
            breadth = 0;
        }
    }

    public double area() {
        return getLength() * getBreadth();
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public Rectangle1(double s) {
        length = breadth = s;
    }
}

public class constructorTest {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(-10, -5);

        System.out.println("Area " + r.area());
    }
}
