import java.util.*;

public class cwh_81_handling_exception {
    public static void main(String[] args) {
        int[] marks = new int[15];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index is: " + marks[ind]);
            System.out.println("the value of array-value/number is: " + marks[ind] / number);
        } 
        catch (ArithmeticException e) {
            System.out.println("Some ArithmeticException occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Some ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Some Exception occured");
            System.out.println(e);
        }
    }
}
