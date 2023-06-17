import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteDemo {
    public static void main(String[] args) throws Exception {
        // byte b[] = {'a','b','c','d','e','f','g','h','i','j'};

        // ByteArrayInputStream bis = new ByteArrayInputStream(b);
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        // int x;

        // while((x=bis.read())!=-1){
        // System.out.print((char)x);
        // }

        // use of readAllBytes() method.

        // String str = new String(bis.readAllBytes());

        // System.out.println(bis.markSupported());

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        // byte b[] = bos.toByteArray();

        // for (byte c : b) {
        // System.out.println((char)c);
        // }

        bos.writeTo(new FileOutputStream(
                "C:/Users/Pradeep/Desktop/Programming_Tips/Java_Programming/JavaIOStream/MyTest.txt"));

        // bis.close();
        bos.close();
    }
}
