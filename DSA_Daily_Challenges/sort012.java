public class sort012 {
    public static void sort_012(int a[], int n) {
        // code here
        // Arrays.sort(a);

        int z = 0, o = 0, t = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                z++;
            else if (a[i] == 1)
                o++;
            else
                t++;
        }
        for (int i = 0; i < z; i++)
            a[i] = 0;
        for (int i = z; i < o + z; i++)
            a[i] = 1;
        for (int i = z + o; i < z + o + t; i++)
            a[i] = 2;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 2, 0 };
        int n = arr.length;
        sort_012(arr, n);
    }
}
