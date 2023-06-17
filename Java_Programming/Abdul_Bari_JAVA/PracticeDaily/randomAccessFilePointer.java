import java.io.*;

public class randomAccessFilePointer {
    public static void main(String[] args) throws Exception {
        // Read the file
        RandomAccessFile raf = new RandomAccessFile(
                "C:/Users/Prade/Desktop/Programming_Tips/Java_Programming/Abdul_Bari_JAVA/PracticeDaily/BufferData.txt",
                "rw");
        // System.out.println((char)raf.read());
        // int x;
        // int count = 0;
        // int c = 0;
        // while (c < 5) {
        // while ((x = raf.read()) != -1) {
        // if (count == 10) {
        // raf.seek(0);
        // }
        // System.out.print((char) x);
        // count++;
        // }
        // System.out.println("File Pointer : " + raf.getFilePointer());
        // raf.seek(0);
        // count = 0;
        // c++;
        // }

        raf.seek(1);
        byte[] bytes = new byte[5];
        raf.read(bytes);
        raf.close();
        System.out.println(new String(bytes));
    }
}
