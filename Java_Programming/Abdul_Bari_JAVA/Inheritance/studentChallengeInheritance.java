
// package Inheritance;
import java.util.*;
import java.lang.*;

class Account {
    long accNo;
    String Name;
    String Address;
    String phNO;
    String dob;
    double balance;

    public Account(long accNo, String name, String address, String phNO, String dob, double balance) {
        this.accNo = accNo;
        this.Name = name;
        this.Address = address;
        this.phNO = phNO;
        this.dob = dob;
        this.balance = balance;
    }

    public void save() {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            
        }
    }

}

public class studentChallengeInheritance {
    static void Insert() {
        long accNo;
        String Name;
        String Address;
        String phNO;
        String dob;
        double balance;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Account Number: ");
        accNo = sc.nextInt();
        System.out.println("Enter The Name: ");
        Name = sc.nextLine();
        System.out.println("Enter The Address: ");
        Address = sc.nextLine();
        System.out.println("Enter The Phone Number: ");
        phNO = sc.nextLine();
        System.out.println("Enter The Date Of Birth: ");
        dob = sc.nextLine();
        System.out.println("Enter The Balance: ");
        balance = sc.nextDouble();

        Account a1 = new Account(accNo, Name, Address, phNO, dob, balance);
        a1.save();
        // return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******************  Welcome To My Bank  ******************************");
        System.out.println("*******************  Select Option  ***********************************");
        System.out.println("*******************  1. Insert  ***************************************");
        System.out.println("*******************  2. View  *****************************************");
        System.out.println("*******************  3. Exit  *****************************************");
        while (true) {
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    Insert();
                case 2:
                    View();
                case 3:
                    break;
            }
        }

    }
}
