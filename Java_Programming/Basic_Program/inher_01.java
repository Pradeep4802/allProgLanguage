class length
{
    int l;
    void getlength(int m)
    {
        l = m;
    }
}

class breadth extends length{
    int b;
    void getbreadth(int n)
    {
        b = n;
    }
    void area()
    {
        System.out.println("Area of Rectangle is " + l*b);
    }
}

public class inher_01 {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        breadth b1 = new breadth();
        b1.getlength(a);
        b1.getbreadth(b);
        b1.area();
    }    
}
