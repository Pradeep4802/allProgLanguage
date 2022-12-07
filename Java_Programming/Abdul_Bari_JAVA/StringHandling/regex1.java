public class regex1 {
    public static void main(String[] args) {
        String str1 = "joh-n@gmail.com";
        // System.out.println(str1.matches("abc"));

        // System.out.println(str1.matches("\\S"));
        // System.out.println(str1.matches(".*"));
        // System.out.println(str1.matches("[a-z]*"));
        // System.out.println(str1.matches("[abc]{3}"));
        // System.out.println(str1.matches("[abc]{3,7}"));
        System.out.println(str1.matches("\\w*@gmail(.*)"));
    }
}
