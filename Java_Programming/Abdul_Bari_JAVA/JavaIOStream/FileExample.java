import java.io.*;

public class FileExample {
    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter(
                "C:/Users/Pradeep/Desktop/Programming_Tips/Java_Programming/JavaIOStream/Test.txt")) {
            // String str = "Learn Java Programming";
            // byte b[] = str.getBytes();
            // for (byte x:b) {
            // fos.write(b);
            // }
            // fos.write(str.getBytes());
            // fos.write(b, 6, str.length() - 6);
            // fos.close();

            // FileInputStream 

            // byte b[] = new byte[fis.available()];
            // fis.read(b);
            // String str = new String(b);
            // System.out.println(str);

            // int x;
            // do {
            //     x = fis.read();
            //     if(x != -1)
            //         System.out.print((char)x);
            // }while(x!=-1);

            // while ((x=fis.read()) != -1) {
            //     if (x != -1) {
            //         System.out.print((char)x);
            //     }
            // }

            // fileReader

            // int x;

            // while((x=fr.read()) != -1) {
            //     System.out.print((char)x);
            // }

            // FileWriter

            String str = "Learn Java Programming";
            byte b[] = str.getBytes();
            for (byte c : b) {
                fw.write(c);
            }
            // fw.write(str.getBytes());
            fw.close();
        }
    }
}