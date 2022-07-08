import java.util.*;

public class string_prac_01 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is : " + name);

        // concatenation
        // String firstname = "tony";
        // String lastname = "stark";
        // String fullName = firstname + " " + lastname;
        // System.out.println(fullName.length());

        // charAt
        // for (int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        // compare
        // String name1 = "Togny";
        // String name2 = "Togny";

        // 1: s1 > s2 : +ve value
        // 1: s1 == s2 : 0
        // 1: s1 < s2 : -ve value

        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are equal.");
        // }
        // else {
        //     System.out.println("Strings are not equal.");
        // }

        // if (name1 == name2) {
        //     System.out.println("Strings are equal.");
        // }
        // else { 
        //     System.out.println("Strings are not equal.");
        // }

        // if (new String("Tony") == new String("Tony")) {
        //     System.out.println("Strings are equal");
        // }
        // else {
        //     System.out.println("Strings are NOT equal.");
        // }

        // substring
        String sentence = "My name is Tony";
        // substring(beg index, end index);
        String name = sentence.substring(5, sentence.length());
        System.out.println(name);
    }
}