import java.io.*;

class Student {
    int rollno;
    String name;
    float avg;
    String dept;
}

public class dataInputOutputStream {
    public static void main(String[] args) throws Exception {
        // FileOutputStream fos = new FileOutputStream(
        // "C:\\Users\\Prade\\Desktop\\Programming_Tips\\Java_Programming\\Abdul_Bari_JAVA\\JavaIOStream\\Student2.txt");
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\Prade\\Desktop\\Programming_Tips\\Java_Programming\\Abdul_Bari_JAVA\\JavaIOStream\\Student2.txt");
        // DataOutputStream dos = new DataOutputStream(fos);
        DataInputStream dis = new DataInputStream(fis);

        Student s = new Student();
        // s.rollno=10;
        // s.name="John";
        // s.avg=80.5f;
        // s.dept="CSE";

        // dos.writeInt(s.rollno);
        // dos.writeUTF(s.name);
        // dos.writeFloat(s.avg);
        // dos.writeUTF(s.dept);

        s.rollno = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        s.avg = dis.readFloat();
        

        System.out.println("Roll No: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Average: " + s.avg);
        System.out.println("Dept: " + s.dept);

        dis.close();
        fis.close();
        // dos.close();
        // fos.close();
    }
}
