public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer();
        char c;
        System.out.println("ENter the string : ");
        try {
            while ((c = (char)System.in.read()) != '\n') {
                string.append(c);  // Append character
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error in input");
        }
        System.out.println(" You have entered.....");
        System.out.println(string);
    }
}
