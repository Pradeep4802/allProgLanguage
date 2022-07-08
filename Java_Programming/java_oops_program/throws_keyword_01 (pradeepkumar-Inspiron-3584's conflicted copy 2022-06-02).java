import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("java_oops_program/abc.txt");
        // statement
    }

    void saveFile() throws FileNotFoundException {
        String text = "This is demo";
        FileOutputStream fos = new FileOutputStream("java_oops_program/abc.txt");
        // statements
    }
}

public class throws_keyword_01 {
    public static void main(String[] args) throws FileNotFoundException{
        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.readFile();
             catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("heeloo");
    }
}
