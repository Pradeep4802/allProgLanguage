public class ThreePart {
    public static void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int l = 0;
        int r = array.length-1;
        
        for(int i = 0; i<=r ; i++) {
            if(array[i] < a) {
                int temp = array[i];
                array[i] = array[l];
                array[l] = temp;
                l++;
            }
            else if(array[i] > b) {
                int temp = array[i];
                array[i] = array[r];
                array[r] = temp;
                r--;
                i--;
            }
        }

        for (int i : array) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8};
        int arr[] = {1, 2, 3};
        threeWayPartition(arr,2,5);
    }
}
