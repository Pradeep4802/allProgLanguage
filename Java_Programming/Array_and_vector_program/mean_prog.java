import java.util.Scanner;

public class mean_prog {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int [] x_b = new int [10];
        int [] freq = new int [10];
        int [] fixi = new int [10];
        int size;
        float freq_sum = 0;
        float sum = 0;
        System.out.println("Enter the size of the array: ");
        size = n.nextInt();

        System.out.println("Enter the element in the class array: ");
        for (int i = 0; i < size; i++) {
            x_b[i] = n.nextInt();
        }

        System.out.println("Enter the element in the frequency class array: ");
        for (int i = 0; i < size; i++) {
            freq[i] = n.nextInt();
        }

        // Logic to calculate sum of frequency column
        for (int i = 0; i < size; i++) {
            freq_sum += freq[i];
        }
        // Logic to calculate fixi table
        for (int i = 0; i < size; i++) {
            fixi[i] = x_b[i] * freq[i];
        }
        
        // logic to calculate sum of fixi table
        for (int i = 0; i < fixi.length; i++) {
            sum += fixi[i];
        }

        // Logic to calculate mean by the direct method
        float mean_res = sum / freq_sum;

        System.out.println("Mean by the direct method : " + mean_res);
    }
}
