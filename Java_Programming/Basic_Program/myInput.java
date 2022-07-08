public class myInput {
    // Read a character
    public char ReadChar() throws java.io.IOException {
        return (char)System.in.read();
    }
    //Read multiple characters
    public static String ReadString(int howmany) throws
    java.io.IOException {
        String str = "";
        // int k;
        for (int i = 0; i < howmany; i++) {
            str += (char)System.in.read();
        }
        return str;
    }
    public static void main(String[] args) {
        int x = 5;
        ReadString(x);
    }   
}
