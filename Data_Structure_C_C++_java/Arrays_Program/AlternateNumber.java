public class AlternateNumber {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int poscount = 0,negcount=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > 0) {
                poscount++;
            }else {
                negcount++;
            }
        }
        int pos[] = new int[poscount];
        int neg[] = new int[negcount];
        int k = 0,j = 0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if(a[i] > 0) {
                pos[k++] = a[i];
            } else {
                neg[j++] = a[i];
            }
        }

        if(pos.length > neg.length) {
            for (int i = 0; i < neg.length; i++) {
                a[2*i] = pos[i];
                a[2*i+1] = neg[i];
            }
            int index = neg.length * 2;
            for (int i = neg.length; i < pos.length; i++) {
                a[index] = pos[i];
                index++;
            }
        } else {
            for (int i = 0; i < pos.length; i++) {
                a[2*i] = pos[i];
                a[2*i+1] = neg[i];
            }
            int index = pos.length * 2;
            for (int i = pos.length; i < neg.length; i++) {
                a[index] = neg[i];
                index++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, -3, -1, -2, 3};
        int arr1[] = alternateNumbers(arr);
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
