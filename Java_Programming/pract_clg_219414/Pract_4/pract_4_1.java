// Define a class SPORTS with the following specifications :
//  -------------------------------
// WAP to create an object of this class & take input using test boxes and invoke argument constructor
import java.util.Scanner;
class Sports {
    private int scode;
    private String sname;
    private int fees;
    private int duration;
    Sports() {
        scode = 1001;
        sname = "Cricket";
        fees = 500;
        duration = 70;
    }
    Sports(int scode,String sname, int duration) {
        this.scode = scode;
        this.sname = sname;
        this.duration = duration;
        if (sname.equals("Table Tennis")) {
            fees = 2000;
        }
        if(sname.equals("Swimming")) {
            fees = 4000;
        }
        if (sname.equals("Football")) {
            fees = 3000;
        }
    }
    void showsport() {
        System.out.println("Scode\tSname\tFees\tDuration");
        System.out.println(scode + "\t" + sname + "\t" + fees + "\t" + duration);
    }
}

public class pract_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code of the product: ");
        int scode = sc.nextInt();
        System.out.println("Enter the name of the product: ");
        String sname = sc.next();
        System.out.println("Enter the duration of the product: ");
        int dur = sc.nextInt();
        Sports sp = new Sports(scode,sname,dur);
        sp.showsport();
        Sports sp1 = new Sports();
        sp1.showsport();
    }
}
