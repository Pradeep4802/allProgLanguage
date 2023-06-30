import java.io.*;

public class storeRetrieveObject {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream(
                "C:\\Users\\Prade\\Desktop\\Programming_Tips\\Java_Programming\\Abdul_Bari_JAVA\\JavaIOStream\\storeRet.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        // Writing in a file
        float list[] = { 10.5f, 2.9f, 6.4f, 3.7f };
        int len = list.length;
        System.out.println(len);
        dos.write(len);
        for (int i = 0; i < list.length; i++) {
            dos.writeFloat(list[i]);
        }

        // Reading in a file
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\Prade\\Desktop\\Programming_Tips\\Java_Programming\\Abdul_Bari_JAVA\\JavaIOStream\\storeRet.txt");
        DataInputStream dis = new DataInputStream(fis);

        int x = dis.read();
        System.out.println(x);
        while (x > 0) {
            System.out.print(dis.readFloat() + " ");
            x--;
        }

        dos.close();
        fos.close();
        dis.close();
        fis.close();
    }
}
