class bedroom {
    int length;
    int breadth;

    bedroom(int x, int y) {
        length = x;
        breadth = y;
    }

    int area1() {
        return length * breadth;
    }
}

class room extends bedroom {
    int height;

    room(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    int area2() {
        return length * breadth * height;
    }
}

public class inheritance_01 {
    public static void main(String[] args) {
        room br = new room(14,12,10);
        int areal1 = br.area1(); 
        int areal2 = br.area2();
        System.out.println("Areal1 = " + areal1); 
        System.out.println("Areal2 = " + areal2); 
    }
}
