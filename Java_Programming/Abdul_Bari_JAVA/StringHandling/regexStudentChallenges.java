public class regexStudentChallenges {
    public static void main(String[] args) {
        // int b = 10110001;
        // String str = String.valueOf(b);
        // System.out.println(str.matches("[01]*"));
        // System.out.println(str.matches("[01]+"));

        // int hex = 0X0A2B;
        // String str = String.valueOf(hex);
        // System.out.println(str.matches("[0-9A-F]*"));

        String d = "01/12/2000";
        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
