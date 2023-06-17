// import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedPract {
    public static void main(String[] args) throws java.io.IOException {
        // FileReader fr = new FileReader("C:/Users/Prade/Desktop/Programming_Tips/Java_Programming/Abdul_Bari_JAVA/PracticeDaily/BufferData.txt");
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/Prade/Desktop/Programming_Tips/Java_Programming/Abdul_Bari_JAVA/PracticeDaily/BufferData.txt"));

        // char c[] = new char[25];

        // int x;
        // // System.out.print(x);
        // while ((x = br.read()) != -1) {
        //     if(x == 32) {
        //         System.out.print((char)x);
        //         x = br.read() - 32;
        //         System.out.print((char)x);
        //     }
        //     else {
        //         System.out.print((char)x);
        //     }
        // }

        // if(br.markSupported()) {
        //     System.out.println("Mark() method supported");
        //     br.mark(1);
        // }
        // br.skip(8);
        // if(br.ready()) {
        //     System.out.println(br.readLine());
        //     br.read(c);
        //     for (int i = 0; i < c.length; i++) {
        //         System.out.print(c[i]);
        //     }
        //     System.out.println();
        //     br.reset();
        //     for (int i = 0; i < 8; i++) {
        //         System.out.print((char)br.read());
        //     }
        // }

        String line = br.readLine();
        // System.out.println(line);
        while (line != null) {
            // br.readLine();
            line = br.readLine();
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
