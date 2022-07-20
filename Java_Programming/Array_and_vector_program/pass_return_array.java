public class pass_return_array {
    public static void main(String[] args) {
        int[] marks = { 22, 66, 33, 99, 88, 77 };
        display(marks);

        // int[] revMarks;
        // revMarks = reverseArray(marks);
        System.out.println("Reversed array elements: ");
        // display(revMarks);
        display(reverseArray(marks));
    }

    public static void display(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    public static int[] reverseArray(int[] input) {
        int[] reverse = new int[input.length];
        for (int i = 0, j = reverse.length - 1; i < input.length; i++,j--) {
            reverse[j] = input[i];
        }
        return reverse;
    }
}
