import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class charArrayReaderClass {
    public static void main(String[] args) throws Exception{
        // char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        // CharArrayReader cr = new CharArrayReader(c);
        CharArrayWriter cw = new CharArrayWriter(20);

        // int x;

        // while((x=cr.read())!=-1) {
            // System.out.print((char)x);
        // }

        cw.write('A');
        cw.write('B');
        cw.write('C');

        char [] charResult = cw.toCharArray();
        String str = new String(charResult);
        // cr.close();
        cw.close();
    }
}
