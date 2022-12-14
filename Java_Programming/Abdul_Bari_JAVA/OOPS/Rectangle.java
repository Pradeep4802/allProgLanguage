
class RectangleTest {

    // Data hiding concept

    private double len;
    private double bread;

    public double getLength() {
        return len;
    }

    public double getBreadth() {
        return bread;
    }

    public void setLength(double l) {
        if (l>=0) {
            len = l;
        }
        else {
            len = 0;
        }
    }

    public void setBreadth(double b) {
        if (b>=0) {
            bread = b;
        } else {
            bread = 0;
        }
    }

    public double area() {
        return getLength() * getBreadth();
    }

    public double perimeter() {
        return 2 * (len + bread);
    }

    public boolean isSquare() {
        if (len == bread) {
            return true;
        }
        return false;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        RectangleTest rect1 = new RectangleTest();

        rect1.setLength(-10.5);
        rect1.setBreadth(5.5);

        System.out.println("Area of Rectangle: " + rect1.area());
        System.out.println("Perimeter of Rectangle: " + rect1.perimeter());
        System.out.println("Is it a Square: " + rect1.isSquare());

        System.out.println("Length " + rect1.getLength());
        System.out.println("Breadth " + rect1.getBreadth());
    }
}
