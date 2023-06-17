import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws Exception{
        // FileInputStream fids = new FileInputStream("C:/Users/Prade/Desktop/Programming_Tips/Java_Programming/JavaIOStream/Buff.txt");
        FileReader fis = new FileReader("C:/Users/Prade/Desktop/Programming_Tips/Java_Programming/JavaIOStream/Buff.txt");
        BufferedReader bis = new BufferedReader(fis);

        // int x;
        // while ((x=bis.read()) != -1) {
        //     System.out.print((char)x);
        // }

        // System.out.println("File " + fis.markSupported());
        // System.out.println("Buffer " + bis.markSupported());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

        System.out.println("String " + bis.readLine());

    }
}
