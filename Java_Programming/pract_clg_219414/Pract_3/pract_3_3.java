// Q3. Write a java program to print the area of a rectangle by creating a class named 'Area' taking the values of its lenght and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of rectangle. Lenght and breadth of rectangle are entered through cmd.
class Area {
    public int len;
    public int bread;
    Area(int len,int bread) {
        this.len = len;
        this.bread = bread;
    }
    int returnArea() {
        return len*bread;
    }
}

public class pract_3_3 {
    public static void main(String[] args) {
        int len = Integer.parseInt(args[0]);
        int bread = Integer.parseInt(args[1]);
        Area ar = new Area(len,bread);
        int res_rect = ar.returnArea();
        System.out.println("Area of rectangle is : " + res_rect);
    }
}
