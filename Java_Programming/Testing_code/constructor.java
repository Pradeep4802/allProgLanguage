class Extending {
    Extending(int x,int y,int z) {
        System.out.println("Addition of two number: " +  (x+y));
    }
}
public class constructor extends Extending{
    public constructor(int x,int y,int z) {
        super(x,y);
        System.out.println("Addition of three number is : " + (x+y+z));
    }
    public static void main(String[] args) {
        constructor cr = new constructor(5, 10, 15);
    }
}