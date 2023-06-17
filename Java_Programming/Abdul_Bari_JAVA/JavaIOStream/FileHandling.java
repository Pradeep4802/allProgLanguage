import java.io.*;
// import java.nio.*;

public class FileHandling {
    public static void main(String[] args) throws Exception{
        File f = new File("C:/Users/Prade/Desktop/Programming_Tips/Java_Programming/JavaIOStream/Data.txt");
        System.out.println(f.isDirectory());
        File list[] = f.listFiles();
        System.out.println(list[0].getName());
        for(File x:list) {
            System.out.print(x.getName()+" ");
            System.out.print(x.getPath());
            System.out.print(x.getParent());
        }

        // f.setWritable(true);
        // FileOutputStream fos = new FileOutputStream("C:/Users/Prade/Desktop/Programming_Tips/Java_Programming/JavaIOStream/Data.txt");
    }
}
