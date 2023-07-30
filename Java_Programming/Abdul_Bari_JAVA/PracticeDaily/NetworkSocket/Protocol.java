// package NetworkSocket;
import java.net.*;
import java.io.*;

public class Protocol {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.javatpont.com/java-tutorial");
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Host name: "+url.getHost());
        System.out.println("Port Number: "+url.getDefaultPort());
        System.out.println("File Name: "+url.getFile());
        System.out.println("Content: "+url.getContent());
    }
}
