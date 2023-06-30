import java.io.*;

class Customer implements Serializable {
    String custID;
    String name;
    String phno;

    static int count = 0;

    public Customer() {
    }

    public Customer(String n, String p) {
        custID = "C" + count+1;
        count++;
        name = n;
        phno = p;
    }

    public String toString() {
        return "Customer ID: " + custID +
                "\nName: " + name +
                "\nPhone Number:" + phno;
    }
}

public class serializedObject {

    // Writing to a file
    // public static void main(String[] args) throws Exception {
    // Customer list[] = { new Customer("PradeepKumar", "7045757937"), new
    // Customer("Nikhil", "8138372828"),
    // new Customer("Pankaj", "9273284931") };
    // FileOutputStream fos = new FileOutputStream(
    // "C:\\Users\\Prade\\Desktop\\Programming_Tips\\Java_Programming\\Abdul_Bari_JAVA\\JavaIOStream\\Customer.txt");
    // ObjectOutputStream oos = new ObjectOutputStream(fos);

    // oos.writeInt(list.length);
    // for (Customer customer : list) {
    // oos.writeObject(customer);
    // }

    // oos.close();
    // fos.close();
    // }

    // Reading from a file
    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\Prade\\Desktop\\Programming_Tips\\Java_Programming\\Abdul_Bari_JAVA\\JavaIOStream\\Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();

        Customer list[] = new Customer[length];

        for (int i = 0; i < length; i++) {
            list[i] = (Customer) ois.readObject();
        }

        System.out.println("Enter the name of Customer: ");

        String name = sc.nextLine();
        for (int i = 0; i < length; i++) {
            if (name.equalsIgnoreCase(list[i].name)) {
                System.out.println(list[i]);
            }
        }
        ois.close();
        fis.close();
    }
}
