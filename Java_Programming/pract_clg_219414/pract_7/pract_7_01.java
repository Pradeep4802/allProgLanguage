import java.io.*;
import java.util.Scanner;

interface Cost {
    public void calcPrice(int qty);
}

class SoftDrink implements Cost {
    long dcode;
    String dname;
    double price;
    double tot_cost;
    SoftDrink(long dcode,String dname,double price) {
        this.dcode = dcode;
        this.dname = dname;
        this.price = price;
    }

    public void calcPrice(int qty) {
        tot_cost = price * qty;
    }
    void showdetails() {
        System.out.println("Dcode = " + dcode);
        System.out.println("Dname = " + dname);
        System.out.println("Price = " + price);
        System.out.println("Total Price = " + tot_cost);
    }
}

public class pract_7_01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the code, name, price and quantity for Product : ");
        long dcode = Long.parseLong(obj.readLine());
        String dname = sc.nextLine();
        double price = Double.parseDouble(obj.readLine());
        int qty = sc.nextInt();
        SoftDrink soft = new SoftDrink(dcode,dname,price);
        soft.calcPrice(qty);
        soft.showdetails();
    }
}
