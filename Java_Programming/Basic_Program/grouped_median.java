
// calculating median for grouped data
import java.util.Scanner;

public class grouped_median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number of frequency (n) : ");
        int n = sc.nextInt();
        float median_class[][] = new float[n + 1][2];
        System.out.println("Enter the class value with spacing");
        median_class[0][0] = 0;
        median_class[0][1] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2; j++) {
                median_class[i][j] = sc.nextFloat();
            }
        }
        int b = 1;
        for (int i = 1; i <= n - 2; i++) {
            if (median_class[i][1] == median_class[i + 1][0]) {
                b = i;
            }
        }
        if (b == n) {
            float c = median_class[1][1] - median_class[1][0];
            System.out.println("Enter the frequency ");
            float f[] = new float[n + 1];
            f[0] = 0;
            float sum_f = 0;
            for (int i = 1; i <= n; i++) {
                f[i] = sc.nextInt();
                sum_f += f[i];
            }
            float cf[] = new float[n + 1];
            cf[0] = 0;
            for (int i = 1; i <= n; i++) {
                cf[0] += f[i];
                cf[i] = cf[0];
            }
            if (sum_f == cf[n]) {
                int a = 0;
                for (int i = 1; i <= n; i++) {
                    if ((sum_f) / 2 <= cf[i]) {
                        a = i;
                        break;
                    }
                }
                float l = median_class[a][0];
                float median = (float) l + (((((float) sum_f / 2) - (float) cf[a - 1]) / (float) f[a]) * (float) c);
                System.out.println("The median of the given data is " + median);
                // System.out.println(l+" "+sum_f+" "+cf[a-1]+" "+c);
            } else {
                System.out.println("Invalid data");
            }
        } else {
            System.out.println("invalid data Classes must be continous in order to calculate median at ");
        }

    }
}