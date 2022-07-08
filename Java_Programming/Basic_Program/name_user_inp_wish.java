import java.util.Scanner;
public class name_user_inp_wish {
    public static void main(String args[]) {
        Scanner name = new Scanner(System.in);
        
        System.out.println("Enter the name: ");
        String naam = name.next();

        System.out.println("Hello " + naam + " have a good day");
    }
}
