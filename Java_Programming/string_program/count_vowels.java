// Write a java code to count all vowels in a string "welcome".

public class count_vowels {
    public static void main(String[] args) {
        String str1 = "welcome";
        int count_vowels = 0;
        int count_consonant = 0;
        for (int i = 0; i < str1.length(); i++) {
            int dig1 = str1.charAt(i);
            if ((char)dig1 == 'a' || (char)dig1 == 'e' || (char)dig1 == 'i' || (char)dig1 == 'o' || (char)dig1 == 'u') {
                count_vowels += 1;
            } else {
                count_consonant += 1;
            }
        }
        System.out.println("Vowels in '" + str1 + "' is " + count_vowels);
        System.out.println("Consonant in '" + str1 + "' is " + count_consonant);
    }
}
