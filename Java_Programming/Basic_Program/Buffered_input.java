import java.io.BufferedReader;
import java.io.InputStreamReader;
 
// printf - scanf
// cout - cin
// System.out.println() - System.in.read();

public class Buffered_input {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter a number : ");
        // InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());  // "45"

        System.out.println(n);
    }
}
