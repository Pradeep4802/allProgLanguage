import java.io.*;

class Student {
    int rollNo;
    String name;
    String dept;
}

public class printStream {
    public static void main(String[] args) throws Exception {
        // FileOutputStream fos = new FileOutputStream(
        // "C:\\Users\\Prade\\Desktop\\Programming_Tips\\Java_Programming\\Abdul_Bari_JAVA\\JavaIOStream\\Student1.txt");
        FileInputStream fos = new FileInputStream(
                "C:\\Users\\Prade\\Desktop\\Programming_Tips\\Java_Programming\\Abdul_Bari_JAVA\\JavaIOStream\\Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fos));

        Student s = new Student();

        // Writing in a file

        // s.rollNo = 10;
        // s.name = "John";
        // s.dept = "CSE";

        // ps.println(s.rollNo);
        // ps.println(s.name);
        // ps.println(s.dept);

        // ps.close();
        // fos.close ();

        // Reading to a file

        s.rollNo = Integer.parseInt(br.readLine()); 
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println("Roll No: " + s.rollNo );
        System.out.println("Name: " + s.name );
        System.out.println("Dept: " + s.dept );

    }
}
