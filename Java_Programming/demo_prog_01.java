import java.io.*;
import operation.*;
public class demo_prog_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number : ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Enter the second number : ");
        int y = Integer.parseInt(br.readLine());
        addition a = new addition();
        subtract s = new subtract();
        multiply m = new multiply();
        a.sum(x,y);
        s.sub(x,y);
        m.mul(x,y);
    }
}
