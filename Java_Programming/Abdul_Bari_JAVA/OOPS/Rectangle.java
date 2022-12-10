
class RectangleTest {
    public double len;
    public double bread;

    public double area() {
        return len * bread;
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
        rect1.len = 10.233;
        rect1.bread = 10.23345 ;

        if (rect1.isSquare()) {
            System.out.println("Area of square: " + rect1.len * rect1.bread);
        } else {
            System.out.println("Area of Rectangle: " + rect1.area());
            System.out.println("Perimeter of Rectangle: " + rect1.perimeter());
        }
    }
}
