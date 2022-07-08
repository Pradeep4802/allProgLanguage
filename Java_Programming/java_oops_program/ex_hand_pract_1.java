import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// package ex;

public class ex_hand_pract_1 {
    public static void main(String[] args) {

        int i, j, k = 0;
        // int a[] = new int[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        i = 8;
        j = Integer.parseInt(br.readLine());
        try {
            // k = i / j;
            for (int l = 0; l <= 4; l++) {
                a[l] = l + 1;
            }
            for (int value : a) {
                System.out.println(value);
            }
        }catch(IOException e) {
            System.out.println("Some IO Error");
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot Divide Ny Zero" + e);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Maximum number of values is 4");
        // } catch (Exception e) {
        //     System.out.println("Unknown Exception");
        // }
        System.out.println(k);
    }
}
