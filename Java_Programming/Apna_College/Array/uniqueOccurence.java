import java.util.*;

public class uniqueOccurence {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mapu = new HashMap<>();
        for (int n : arr)
            if (mapu.containsKey(n))
                mapu.put(n, mapu.get(n) + 1);
            else
                mapu.put(n, 1);

        HashSet<Integer> seta = new HashSet<>();
        for (int n : mapu.keySet())
            if (!seta.add(mapu.get(n)))
                return false;
        return true;
    }

    public static boolean checkUniqueFrequency(int arr[],
            int n) {

        // Freq map will store the frequency
        // of each element of the array
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        // Store the frequency of each
        // element from the array
        for (int i = 0; i < n; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }

        HashSet<Integer> uniqueFreq = new HashSet<Integer>();

        // Check whether frequency of any
        // two or more elements are same
        // or not. If yes, return false
        for (Map.Entry<Integer, Integer> i : freq.entrySet()) {
            if (uniqueFreq.contains(i.getValue()))
                return false;
            else
                uniqueFreq.add(i.getValue());
        }

        // Return true if each
        // frequency is unique
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 1, 3 };
        System.out.println(uniqueOccurrences(arr));
        System.out.println(checkUniqueFrequency(arr,arr.length));
    }
}