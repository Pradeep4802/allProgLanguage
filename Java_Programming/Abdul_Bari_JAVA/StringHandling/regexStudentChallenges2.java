public class regexStudentChallenges2 {
    public static void main(String[] args) {
        // String str = "a!B@c#1#2%3";
        String str = "    abc    de    fgh  ijk    ";
        // String str1 = str.replaceAll("\\W","");
        // String str1 = str.replaceAll("[^a-zA-Z0-9]","");
        String str1 = str.replaceAll("\\s+"," ").trim();
        System.out.println(str1);

        String word[] = str1.split("\\s");

        System.out.println(word.length);

    }
}
