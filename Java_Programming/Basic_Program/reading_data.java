import java.io.DataInputStream;

public class reading_data {
    public static void main(String[] args) {
        DataInputStream dt = new DataInputStream(System.in);
        int int_number = 0;
        float float_number = 0.0f;
        try {

            System.out.println("Enter the integer number: ");
            int_number = Integer.parseInt(dt.readLine());
            System.out.println("Enter the float number: ");
            float_number = Float.valueOf(dt.readLine()).floatValue();
            System.out.println("Integer number are: " + int_number);
            System.out.println("Float number are: " + float_number);
        } catch(Exception e) {
            
        }

    } 
}
