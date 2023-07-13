import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        int[] my_array = { 5, 9, 2, 10, 57, 372, 983, 1839, 978, 9888 };

        System.out.println("Original array: " + Arrays.toString(my_array));

        Arrays.sort(my_array);

        int index = my_array.length-1;
        while(my_array[index] == my_array[my_array.length-1]) {
            index--;
        }
        System.out.println("Second largest : " + my_array[index]);
    }
}
