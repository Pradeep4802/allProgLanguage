import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.*;

public class print_content {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("abc.txt");
            FileWriter fw = new FileWriter("b1.txt");
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(fr);
            String s;
            while (sc.hasNextLine() != null) {
                fw.write(sc);
            }
            fr.close();
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}
