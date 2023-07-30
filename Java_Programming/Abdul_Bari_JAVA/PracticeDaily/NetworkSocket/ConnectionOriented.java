import java.net.*;
import java.io.*;

public class ConnectionOriented {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

        // For Input taking
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do {
            msg = br.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        } while (!msg.equals("dne"));
    }
}

class ClientConnectionOriented {
    public static void main(String[] args) throws Exception {
        Socket stk = new Socket("localhost", 2000);

        // For Input taking
        BufferedReader keyBr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;
        do {
            msg = keyBr.readLine();
            ps.println(msg);
            msg = br.readLine();

            System.out.println("From server " + msg);
        } while (!msg.equals("dne"));
        stk.close();
    }
}