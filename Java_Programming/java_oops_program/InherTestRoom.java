class Room {
    int length,width;
    Room(int x,int y) {
        length = x;
        width = y;
    }
    int area() {
        return length * width;
    }
}

class BedRoom extends Room {
    int height;
    BedRoom(int x,int y,int z) {
        super(x,y);
        height = z;
    }
    int volume() {
        return length*width*height;
    }
}

public class InherTestRoom {
    public static void main (String[] args) {
        BedRoom br = new BedRoom(14,12,10);
        int area1 = br.area();
        int volume1 = br.volume();
        System.out.println("Area = " + area1);
        System.out.println("Volume = " + volume1);
    }
}