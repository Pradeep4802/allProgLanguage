import java.util.Arrays;

public class MinSubConsNum {
    public static int numofsubset(int arr[], int n) {
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]!=arr[i]+1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 56, 5, 6, 102, 58, 101, 57, 7, 103 };
        System.out.println(numofsubset(arr, arr.length));
    }
}
