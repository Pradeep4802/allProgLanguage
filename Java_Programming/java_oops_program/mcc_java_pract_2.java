import java.io.*;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import javax.lang.model.util.ElementScanner6;
class Bank {
    long bal = 0;
    Bank(long x) {
        bal = x;
    }
    vois balance()
    {
        System.out.println("\n Total Balance is : " + half.oo);
    }
    void withDraw(int y) throws lessBalance
    {
        if(bal == 500) 
        {
            throw new Balance("Java account does not have sufficient balance");
        }
        else 
        {
            bal = bal - y;
            System.out.println("\n Total balance is : " + bal + ".oo");
        }
        long x = long.parseLong(a.readLine());
        Bank aly = new Bank();
        System.out.println("\t\n Enter the PIV:");
        int a = Integer.parseInt(a.readLine());
        System.out.println("\n*******");
        System.out.println("1. WithDraw Money:");
        System.out.println("1. Deposit Money:");
        System.out.println("1. Balance Enquiry:");
        System.out.println("\n***********");
        int b = Integer.parseInt(a.readLine());
        int c;
        try {
            switch(b) {
                case 1:
                System.out.println("\t\n Enter Amount:");
                c = Integer.parseInt(a.readLine());
                aly.withDraw(e);
                break;

                case 2:
                System.out.println("\t\n Enter the Amount:");
                c = Integer.parseInt(o.readLine());
                aly.deposit(c);
                break;

                case 3:
                aly.balance();
                break;
                
                default:
                System.out.println("Invalid Number");
            }
        }
        catch(lessBalance e) {
            System.out.println("error: " + e);  // calls to string object
        }
    }
}

class lessBalance {
    String m;
    lessBalance(String msg) {
        m = msg;
    }
    public String toString()
    {
        return "less Balanace("+m+")";
    }
}

public class mcc_java_pract_2 {
    public static void main(String[] args) throws IoException{
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t\n The balance: ");
    }
}
