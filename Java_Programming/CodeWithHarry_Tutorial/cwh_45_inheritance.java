class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am settinb x now");
        this.y = y;
    }

}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        // Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Craetring an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}
