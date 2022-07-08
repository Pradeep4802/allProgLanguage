import java.util.*;

public class reverse_string_01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        // for (int i = 0; i < sb.length()/2; i++) {
        //     int front = i;
        //     int back = sb.length() - 1 - i; // 5 - 1 - 0 = 4

        //     char frontchar = sb.charAt(front);
        //     char backchar = sb.charAt(back);

        //     sb.setCharAt(front, backchar);
        //     sb.setCharAt(back, frontchar);
        // }

        // System.out.println(sb);

        Scanner sc = new Scanner (System.in);
        // int size = sc.nextInt();
        // String array[] = new String[size];
        // int totLength = 0;
 
        // for(int i=0; i<size; i++) {
        //     array[i] = sc.next();
        //     totLength += array[i].length();
        // }
 
        // System.out.println(totLength);

        // String str = sc.next();
        // String result = "";
 
        // for(int i=0; i<str.length(); i++) {
        //     if(str.charAt(i) == 'e') {
        //     result += 'i';
        //     } else {
        //     result += str.charAt(i);
        //     }
        // }
 
        // System.out.println(result);

        String email = sc.next();
        String user = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) != '@') {
                user = user + email.charAt(i);
            }
            else
            {
                break;
            }
        }
        System.out.println("Username : " + user);

    }
}
