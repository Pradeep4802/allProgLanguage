public class stringHandling3 {
    public static void main(String[] args) {
        String str1 = "the great wall";

        String str2 = " of china";
        // String str2 = new String("china all");

        // System.out.println(str1.equalsIgnoreCase(str2));
        // System.out.println(str1.equals(str2));

        // System.out.println(str1.compareToIgnoreCase(str2));

        // System.out.println(str1.contains("wall"));

        // System.out.println(str1.concat(str2));
        System.out.println(str1 + str2);

        int i = 12233;
        String v1 = String.valueOf(i);
        System.out.println(v1);
    }
}
