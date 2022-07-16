import java.io.*;
import java.util.*;

public class Outputting_format_solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1);
        }
        int count1 = 0;
        System.out.println("==============================");
        for (int i = 0; str.substring(i,i+1).equals(" "); i++) {
            System.out.println(arr[i]);
        }
        int num = 15-str.length();
        for (int i = 0; i < num; i++) {
            System.out.println(" ");
        }
        int ind;
        int z;
        for (z = 0; z < 3; z++) {
            if (str.equals(" ")) {
                ind = z;
            }
        }
        int ctr1 = 0;
        String [] str2 = new String[3]
        for (int i = z,j = 0; i < 3; i++,j++) {
            if (z == 2) {
                
            }
            // str2[j] = arr[z];
            ctr1 += 1;
        }
        for (int j2 = 0; j2 < str2.length; j2++) {
            if (ctr1 == 2) {
                
            }
        }
        System.out.println("\n==============================");
    }
}
