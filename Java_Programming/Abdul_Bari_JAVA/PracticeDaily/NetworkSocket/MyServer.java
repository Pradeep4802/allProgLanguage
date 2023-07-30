import java.net.*;
import java.io.*;

public class MyServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(2000);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String)dis.readUTF();
        System.out.println("Message: " + str);
        ss.close();
    }
}

class MyClient {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost",2000);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello Server");
        dout.flush();
        dout.close();
        s.close();
    }
}
