import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class cwh_111_file_handling {
    public static void main(String[] args) {
        // Code to create a new file
        // File myfile = new File("cwh111file.txt");
        // try {
        // myfile.createNewFile();
        // } catch (Exception e) {
        // //TODO: handle exception
        // System.out.println("Unable to create this file");
        // e.printStackTrace();
        // }

        // code to write a file
        // try {
        // FileWriter fileWriter = new FileWriter("cwh111file.txt");
        // fileWriter.write("This is our first file from this java course\nokay now
        // by");
        // fileWriter.close();
        // } catch (Exception e) {
        // //TODO: handle exception
        // e.printStackTrace();
        // }

        // Reading a file
        // File myFile = new File("this.txt");
        // try{
        // Scanner sc = new Scanner(myFile);
        // while (sc.hasNextLine()) {
        // String line = sc.nextLine();
        // System.out.println(line);
        // }
        // sc.close();
        // }
        // catch (FileNotFoundException e){
        // e.printStackTrace();
        // }

        // deleting a file 
        File myFile = new File("cwh111file.txt");
        if (myFile.delete()) {
            System.out.println("I have deleted: " + myFile.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
