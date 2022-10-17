// package Java_Programming.Apna_College.Array;

public class linear_search_AC {
    public static int linearSearch(String menu[], String key) {

        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        String menu[] = { "dosa", "chole Bhature", "samosa", "chinese bhel", "Manchurian Bhel", "Ragda", "Dahi Puri" };
        // int key = 20;
        String key = "Ragda";

        // int index = linearSearch(numbers, key);
        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("key is at index " + index);
        }
    }
}
