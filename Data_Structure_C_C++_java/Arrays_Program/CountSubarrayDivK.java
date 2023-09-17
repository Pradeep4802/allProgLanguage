import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSubarrayDivK {
    public static int subArrayCount(ArrayList<Integer> arr, int k) {
        int mod[] = new int[k];
        Arrays.fill(mod, 0);
        long cumSum = 0;
        int n=arr.size();
        for (int i = 0; i < n; i++) {
            cumSum += arr.get(i);
            mod[((int)(cumSum % k) + k) % k]++;
        }
        int result = 0;
        for (int i = 0; i < k; i++) {
            if (mod[i] > 1)
                result += (mod[i] * (mod[i] - 1)) / 2;
        }
        result += mod[0];
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);
        arr.add(1);
        // arr.add(3);
        // arr.add(1);
        System.out.println(subArrayCount(arr, 2));
    }
}
